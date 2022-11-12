package others.Damm;

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
        com.thealgorithms.others.Damm damm0 = new com.thealgorithms.others.Damm();
        java.lang.Class<?> wildcardClass1 = damm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.thealgorithms.others.Damm.addDammChecksum("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input '' contains not only digits");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.thealgorithms.others.Damm.dammCheck("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input '' contains not only digits");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.thealgorithms.others.Damm.addDammChecksum("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input 'hi!' contains not only digits");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.thealgorithms.others.Damm.dammCheck("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input 'hi!' contains not only digits");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

