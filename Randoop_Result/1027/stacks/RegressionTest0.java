package stacks;

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
            java.lang.String str1 = com.thealgorithms.datastructures.stacks.InfixToPostfix.infix2PostFix("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: invalid expression");
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
        com.thealgorithms.datastructures.stacks.InfixToPostfix infixToPostfix0 = new com.thealgorithms.datastructures.stacks.InfixToPostfix();
        java.lang.Class<?> wildcardClass1 = infixToPostfix0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.String str1 = com.thealgorithms.datastructures.stacks.InfixToPostfix.infix2PostFix("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }
}

