package LongestPalindromicSubsequence;

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
        java.lang.String str1 = com.thealgorithms.dynamicprogramming.LongestPalindromicSubsequence.LPS("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
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
        com.thealgorithms.dynamicprogramming.LongestPalindromicSubsequence longestPalindromicSubsequence0 = new com.thealgorithms.dynamicprogramming.LongestPalindromicSubsequence();
        java.lang.Class<?> wildcardClass1 = longestPalindromicSubsequence0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.String str1 = com.thealgorithms.dynamicprogramming.LongestPalindromicSubsequence.LPS("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.lang.String str1 = com.thealgorithms.dynamicprogramming.LongestPalindromicSubsequence.LPS("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }
}

