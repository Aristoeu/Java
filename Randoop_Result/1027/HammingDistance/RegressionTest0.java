package HammingDistance;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.strings.HammingDistance.calculateHammingDistance("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: String lengths must be equal");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        int int2 = com.thealgorithms.strings.HammingDistance.calculateHammingDistance("", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.strings.HammingDistance.calculateHammingDistance("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: String lengths must be equal");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        com.thealgorithms.strings.HammingDistance hammingDistance0 = new com.thealgorithms.strings.HammingDistance();
        java.lang.Class<?> wildcardClass1 = hammingDistance0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        int int2 = com.thealgorithms.strings.HammingDistance.calculateHammingDistance("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

