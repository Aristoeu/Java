package RabinKarp;

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
        int int0 = com.thealgorithms.others.RabinKarp.d;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.util.Scanner scanner0 = com.thealgorithms.others.RabinKarp.scanner;
        org.junit.Assert.assertNull(scanner0);
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
        com.thealgorithms.others.RabinKarp rabinKarp0 = new com.thealgorithms.others.RabinKarp();
        java.lang.Class<?> wildcardClass1 = rabinKarp0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.util.Scanner scanner0 = null;
        com.thealgorithms.others.RabinKarp.scanner = scanner0;
    }
}

