package EulerMethod;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

    public static boolean debug = false;

    @Test
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (-1), (double) (short) 100, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (-1.0d), (double) (short) 100, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (short) -1, (double) (-1.0f), (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) ' ', (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) 10, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) (-1), (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) (-1L), (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) (byte) 100, (double) (-1L), (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, 1.0d, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, 0.0d, (double) 'a', (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (short) 100, (-1.0d), (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 1, (double) 0L, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (-1), (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, 0.0d, (double) 0.0f, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) (-1L), (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, 100.0d, (double) 0.0f, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 1L, (double) 10L, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) (byte) 10, (double) '4', (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 0.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (short) 10, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), 1.0d, (double) (short) 1, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) 0, (double) 100, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) 100L, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 'a', (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 1, (double) '4', (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) '4', (double) (byte) 10, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) (byte) 100, (double) (byte) 0, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 1, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, 0.0d, 0.0d, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 100L, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) (byte) -1, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) (byte) 10, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (byte) 100, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) '#', 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) (byte) 100, (double) 1.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) (short) -1, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (-1.0d), (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) (byte) 100, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) '4', (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) 10L, (double) (byte) 1, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) 100.0f, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (-1.0f), (double) ' ', 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) 1.0f, (double) 0.0f, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) (short) -1, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 100.0f, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) (short) 100, (double) (byte) 0, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) '#', (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) 0L, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 100, (double) (short) -1, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) 0L, (double) (byte) 100, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (short) 10, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) '#', (double) 100, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 0, (double) (short) 10, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) '4', (double) 10L, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) 1L, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 0L, 0.0d, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) 'a', (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) (-1L), (double) 100.0f, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', 100.0d, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', 1.0d, (double) (short) 100, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) (byte) -1, (double) 1, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 100.0f, (double) 100.0f, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) (byte) 10, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) (short) 1, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (byte) 10, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, 1.0d, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (-1), (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (byte) 10, (double) 100L, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, 0.0d, 10.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, 0.0d, (double) 1.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) ' ', (double) 100.0f, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) (-1), 0.0d, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) 1L, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) (-1), (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, (double) 100L, (double) (byte) 0, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 100, 0.0d, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (-1L), (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) 10.0f, (double) (byte) 10, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) ' ', (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (byte) 10, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 1.0f, (double) 100L, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 1L, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 10L, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) '#', (double) (byte) 1, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (byte) 1, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) (-1.0f), 100.0d, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) '4', (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (-1.0d), (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (byte) 10, (double) '#', 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 10, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) 1.0f, (double) (short) -1, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (-1.0f), (double) '4', (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 100.0f, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) (byte) -1, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) (-1.0f), (double) (-1.0f), 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (-1L), 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 1L, (double) 100.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (short) 1, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) ' ', (double) (byte) 10, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) (short) 1, 100.0d, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) 0, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (byte) 100, 10.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (-1.0d), (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, 10.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) 1L, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, 0.0d, (double) 1, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) 1L, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 'a', (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 100.0f, (double) 0L, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) (short) 10, (double) 0, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) (byte) 10, (double) 100L, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) (-1.0f), (double) (-1.0f), (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (-1.0d), (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) '#', (double) (short) 100, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (-1), (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (short) 1, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 10L, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, 100.0d, (double) (short) 10, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) 0, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 100, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) ' ', (double) 0, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) (byte) 1, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (-1), (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 1L, (double) (-1L), (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) (byte) 100, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) (short) 1, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) (short) 1, (double) 10.0f, (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 10, (double) (byte) 1, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) 'a', 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) (byte) -1, (double) (-1.0f), (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 100, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) 10L, (double) (short) 1, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) (-1), (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (byte) -1, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (byte) 100, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) 0L, (double) (-1L), (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) ' ', (double) (short) 10, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, 1.0d, 10.0d, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) 0L, (double) (short) 10, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (short) -1, (double) (-1), (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (byte) -1, (double) (-1.0f), (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 10, (double) (byte) 100, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) (byte) 100, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, 10.0d, (double) 0.0f, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) '#', (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) 100L, (double) ' ', (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 0.0f, (double) 100, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 10, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), 100.0d, (double) 100.0f, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) 0.0f, (double) 0L, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (-1.0f), (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) (-1), (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 1L, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) 100, (double) (-1), 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 100L, (double) '4', (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) (short) 0, (double) (byte) 1, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) (short) -1, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, 0.0d, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) (-1.0f), (double) (byte) 0, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (short) -1, (double) (byte) 100, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) 0.0f, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) '4', (double) (byte) 100, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (-1.0f), (double) '4', (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) (short) 1, (double) '4', (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) ' ', (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (-1.0f), (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 1, (double) (short) 10, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 0L, 0.0d, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (short) 1, (double) (byte) 0, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) 'a', 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) (-1), (double) (byte) 10, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, 1.0d, (double) 1, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) (byte) 100, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) 100.0f, (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (-1.0f), (double) (byte) 0, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 0.0f, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) (-1), (double) (byte) 0, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) 10, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) 100L, (double) (short) 1, (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 10L, (double) 100, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (byte) 1, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, (double) (-1), (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 100, (-1.0d), (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, (double) '#', (double) 10, (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) 10.0f, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), 100.0d, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) '4', (double) (short) -1, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (byte) 10, 1.0d, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) 'a', (double) '#', (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (-1), (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) '#', (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 1.0f, (double) '4', 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) 100L, (double) '4', (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (short) 100, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (byte) 1, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 100L, (-1.0d), 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) '4', (double) 10L, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) 10.0f, (double) (-1), (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (-1L), (double) (short) 100, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 1, (double) (-1L), (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (byte) 0, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) 10L, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) (byte) -1, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) (byte) 1, (double) (byte) 0, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) (byte) 1, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, 1.0d, (double) (-1), (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), 1.0d, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (short) 0, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', 0.0d, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), 0.0d, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (-1.0f), 0.0d, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) ' ', (double) (byte) -1, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', 1.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 100.0f, (double) (short) 0, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) (short) -1, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (short) 1, (double) 'a', (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) 0, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) 10L, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) ' ', (double) 0.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) ' ', (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (-1), 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), 10.0d, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) (short) -1, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) '#', (double) 10L, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) '4', (double) (-1.0f), (double) (short) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) ' ', (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (-1.0f), (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) (byte) 1, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) (byte) -1, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), 1.0d, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (short) 100, (double) (short) 100, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) 1, 100.0d, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 0, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, 1.0d, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 10, (double) (short) 100, (double) 100.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (-1.0d), 1.0d, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (short) 100, (double) 1L, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) 1.0f, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) 'a', (double) (-1L), 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) (byte) -1, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) (byte) -1, 0.0d, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (byte) 1, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) (-1), (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) 10.0f, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) '#', (double) (byte) 100, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) 0.0f, (double) ' ', (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', 100.0d, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (-1), (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) 100, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (short) 1, (double) 100, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) '4', (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) 100.0f, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (byte) -1, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) 1, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 0, (double) (byte) -1, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) 0, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) (byte) 1, (double) (short) -1, (double) (byte) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) (byte) 10, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (-1.0f), (double) 1L, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 0.0f, (double) 100.0f, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) (short) 100, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 1, (double) ' ', (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 0, (double) (-1.0f), (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 10, (double) 0L, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) (short) 0, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 0, (double) 1L, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 100, 0.0d, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, 10.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) 10L, 100.0d, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) 0, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (-1.0d), (double) (byte) 10, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, 10.0d, 0.0d, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, 0.0d, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) (-1.0f), 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) (-1L), (double) 1, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (byte) 10, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) 100.0f, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (byte) 100, (double) (byte) 100, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (-1.0d), (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (short) 0, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) (short) 0, (double) (short) 0, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 10, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) ' ', (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 10, (double) 0, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 100L, (double) 1L, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 0.0f, (double) 1L, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 10.0f, (double) (byte) 10, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) 10, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) 100, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) 0, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) (short) -1, (double) 0L, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) (short) 1, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) (short) 0, 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, 1.0d, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, 1.0d, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) (short) 0, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) (byte) -1, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) (short) 0, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) (short) -1, (double) (short) 0, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) (byte) -1, 10.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 1.0f, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 100.0f, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) ' ', 1.0d, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) '4', (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (short) 100, (double) 0L, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, 0.0d, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, 1.0d, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) (byte) 10, (double) 100.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(10.0d, (double) (-1), (double) (short) 1, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) '#', (double) (short) 0, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) '4', (double) 1, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100, 0.0d, (-1.0d), (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (short) 100, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) (short) 0, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, (double) (short) 1, (double) (byte) 0, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) '#', (double) 100.0f, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 0, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (short) 100, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, 10.0d, (double) (short) 0, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, 100.0d, (double) 100.0f, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) 0.0f, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (short) 10, (double) (short) 100, (double) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) 10, (double) 0L, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, 10.0d, (double) 10, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) (-1L), (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) 100.0f, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (byte) -1, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) -1, 1.0d, (double) 100L, (double) 'a', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10, (double) (-1), (double) 10, (double) (short) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) 1.0f, (double) (byte) -1, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) (short) 1, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) (short) 0, (double) '4', (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) 0, (double) (-1L), (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) (byte) -1, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 10, 10.0d, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) 1, 10.0d, (double) 10.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(1.0d, (double) (short) 0, (double) '4', (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) (short) 1, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) (byte) 10, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) 10, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) 100, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) (byte) 100, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, 100.0d, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, 0.0d, 0.0d, (double) (short) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) 10, (double) (short) 1, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) (short) -1, (double) 100, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) (byte) 0, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) 1, (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) -1, (double) 100, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) (short) -1, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) '4', (double) (-1L), 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (byte) 100, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) 10, (double) 10.0f, (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 'a', (double) (byte) 1, 0.0d, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 10, (double) '4', (double) 0L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, 0.0d, (double) '#', (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 1, (-1.0d), (double) 0.0f, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (-1.0d), (double) (byte) 0, (double) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) 1L, (double) 'a', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) 100L, (double) 100.0f, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, 0.0d, 0.0d, (double) '#', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (-1.0f), (double) 0, (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) (short) 1, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) ' ', 10.0d, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (-1.0f), (double) '#', (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) (byte) -1, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, 0.0d, (double) (byte) 1, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10.0f, (double) 1.0f, (double) 100.0f, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) (-1.0f), 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, 1.0d, (double) (short) 10, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, 10.0d, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, 0.0d, (double) 10L, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 1L, (double) 10.0f, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) 10L, (double) (byte) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (short) 0, (double) (short) -1, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) 1, (double) '4', (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (-1.0d), (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, 100.0d, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), (double) 100, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, (double) (short) 1, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1L, (double) 1, (double) 100L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', 0.0d, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(100.0d, (double) (byte) -1, (double) ' ', 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) (byte) 0, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 1.0f, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) 1, (double) 100.0f, (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) 10, (double) (byte) -1, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (-1.0d), (double) (-1L), (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (short) 100, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100.0f, (double) (-1L), 100.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 0, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 100.0f, (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 10, (double) '#', (double) 100L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', 0.0d, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, 10.0d, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((-1.0d), (double) 100L, (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, 0.0d, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) 0, (double) (byte) 0, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (short) 0, (double) 10.0f, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 10.0f, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 1L, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) (byte) 10, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) ' ', (double) 1L, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(10.0d, (double) (short) 10, (double) (short) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10, (double) 100L, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, 0.0d, 0.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) 100, (double) (short) 100, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) 0.0f, 1.0d, 10.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, (double) (short) 10, (double) '#', (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) 'a', (double) (byte) 100, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, (double) '4', (-1.0d), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 1, (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0.0f, 0.0d, (double) 0.0f, (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(0.0d, 0.0d, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, (double) 'a', (double) 1, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (-1.0d), (double) 10, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (short) 10, (double) '4', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) -1, 0.0d, (double) ' ', (double) '4', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) '#', (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1), 1.0d, (double) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, 0.0d, (double) (short) 10, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (byte) 1, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) ' ', (double) 10.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0L, 100.0d, (double) (-1.0f), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 0, (double) (byte) 0, (double) 10.0f, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) 100, (double) 'a', (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) 100, (double) 100.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 0.0f, (double) 100L, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100, (double) (-1.0f), (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 10L, (double) (short) -1, 10.0d, (-1.0d), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 0, (double) 1.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) (byte) 100, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (byte) -1, (double) (short) 10, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) 100L, (double) (byte) 0, (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 1, (double) 1.0f, (double) (byte) -1, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10L, (double) '4', (double) (short) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((-1.0d), (double) 0.0f, (double) (byte) 100, (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) 1L, (double) (byte) 10, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1, (double) 1L, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) 100, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0L, (double) (short) 1, (double) '4', (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '#', (double) 100.0f, (double) ' ', (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) '#', (double) (byte) 0, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) 100, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 1.0f, (double) (-1), 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(1.0d, (double) 100L, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (-1), (double) (short) -1, (double) (byte) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '4', (double) 1.0f, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, (double) 100, (double) 100.0f, 0.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 0, (double) 100.0f, (double) 1.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 10, (double) (byte) -1, (double) (short) 10, 100.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 1, (double) (byte) -1, (double) (-1L), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 100, (double) '4', (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) 0, (double) 0.0f, (double) 0L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), 100.0d, (double) (-1), doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) '#', (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1L), (double) (-1.0f), (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 'a', (double) (short) 0, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 10, (double) ' ', (double) '#', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (double) 1, (double) (byte) -1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0, (double) 100.0f, (double) (byte) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100.0f, (double) 100L, (double) 0.0f, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (short) 0, (-1.0d), (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (-1.0f), (double) 100.0f, (double) (byte) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', 0.0d, (double) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 1, (double) 100L, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 10.0f, (double) 1L, (double) 10, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1.0f), (double) (byte) 0, (double) 100, (double) (byte) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, 0.0d, (double) (-1), (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) 100L, (double) (short) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', (double) 100, (-1.0d), (double) ' ', doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep(100.0d, (double) (short) 0, (double) (short) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1L, 100.0d, 0.0d, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 0.0f, (double) (byte) 100, (double) 1L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) (-1.0f), (double) 1, 1.0d, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) -1, 10.0d, (double) 0.0f, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1.0f, (double) (-1.0f), 0.0d, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 100L, (double) '4', (double) 1L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) '4', 10.0d, (double) (-1), (double) (byte) 100, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 1, (double) (short) 100, (double) 1, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) 100L, (double) 0, (double) (byte) 100, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, 10.0d, (double) (short) 0, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, 0.0d, (double) (byte) 100, (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, 1.0d, (double) 10L, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1L), (double) 10.0f, (double) 'a', (double) (byte) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 100L, (double) (byte) 10, (double) 100L, (double) 10L, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) '#', (double) (byte) 0, 1.0d, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (short) 100, (double) (byte) 10, (double) (short) -1, (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 10, 100.0d, (double) '4', (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) 0, (double) 1L, (double) ' ', (double) (short) -1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) '#', (double) (byte) 100, (double) (-1), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) ' ', (double) ' ', (-1.0d), (double) 0.0f, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 0, (double) (short) 100, (double) 1, doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = com.thealgorithms.maths.EulerMethod.eulerStep((double) (byte) 100, (double) (byte) 0, (double) ' ', doubleBiFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 0, (double) 10, (double) 0.0f, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (short) 100, (double) '#', (double) 0, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) 10.0f, (double) (-1.0f), (double) (short) 10, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: stepSize should be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (byte) 100, (double) 0L, (double) (byte) 10, (double) (-1L), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull((double) (-1), (double) (byte) 100, (double) 1, (double) 1, doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
        java.util.function.BiFunction<java.lang.Double, java.lang.Double, java.lang.Double> doubleBiFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<double[]> doubleArrayList5 = com.thealgorithms.maths.EulerMethod.eulerFull(0.0d, (double) (-1.0f), 10.0d, (double) (-1.0f), doubleBiFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: xEnd should be greater than xStart");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

