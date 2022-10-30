package KaprekarNumbers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 0, 10L);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(0L, 10L);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(100L, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(10L, (long) (short) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 0, 1L);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 1, (long) (byte) 1);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) '4', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 0, 1L);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) '4', (long) (byte) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(100L, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 0, (long) 0);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(10L, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 1, (long) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(1L, (long) 'a');
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 0, (long) (byte) 0);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (-1), (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, -1) out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) -1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, -1) out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, -1) out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 1, (long) '#');
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 0, (long) '4');
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, -1) out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((-1L), (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, -1) out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) ' ', (long) (byte) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 10, (long) (short) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 'a', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 10, (long) (byte) 10);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 1, 10L);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 0, (long) (byte) 0);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 0, (long) (short) 10);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) '4', (long) '4');
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 1, (long) (short) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 0, (long) (byte) 10);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(10L, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) '#', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) '#', (long) '4');
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) '4', (long) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 1, (long) (short) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) '4', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(1L, 100L);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) -1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, -1) out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 0, (long) (short) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(100L, 100L);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 1, (long) (short) 1);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((-1L), (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, -1) out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 1, (long) (byte) 10);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, -1) out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(10L, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(10L, (long) '4');
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(1L, (long) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((-1L), (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, -1) out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 1, (long) 'a');
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 'a', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 0, (long) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(1L, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) ' ', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((-1L), (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, -1) out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 1, (long) ' ');
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 0, 10L);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 100, (long) (byte) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (-1), (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, -1) out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, -1) out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(10L, (long) (byte) 10);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 0, (long) (byte) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(1L, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 100, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 1, (long) (byte) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 0, (long) (short) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 'a', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 1, (long) 1);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 10, (long) ' ');
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(10L, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(1L, 10L);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(10L, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) '#', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) '#', (long) (short) 100);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 10, (long) 'a');
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (byte) 0, (long) '4');
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) (short) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, -1) out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) ' ', (long) '4');
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 'a', 100L);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange(100L, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid range");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        java.util.ArrayList<java.lang.Long> longList2 = com.thealgorithms.maths.KaprekarNumbers.kaprekarNumberInRange((long) 100, 100L);
        java.lang.Class<?> wildcardClass3 = longList2.getClass();
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

