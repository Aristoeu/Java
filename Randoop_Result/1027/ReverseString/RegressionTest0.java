package ReverseString;

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
        com.thealgorithms.strings.ReverseString reverseString0 = new com.thealgorithms.strings.ReverseString();
        java.lang.Class<?> wildcardClass1 = reverseString0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.String str1 = com.thealgorithms.strings.ReverseString.reverse("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
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
        java.lang.String str1 = com.thealgorithms.strings.ReverseString.reverse2("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.lang.String str1 = com.thealgorithms.strings.ReverseString.reverse("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        java.lang.String str1 = com.thealgorithms.strings.ReverseString.reverse2("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        java.lang.String str1 = com.thealgorithms.strings.ReverseString.reverse("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        java.lang.String str1 = com.thealgorithms.strings.ReverseString.reverse2("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }
}

