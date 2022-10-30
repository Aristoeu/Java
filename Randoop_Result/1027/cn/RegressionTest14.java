package cn;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass49 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int63 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int66 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int69 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass55 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int60 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass40 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int63 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass43 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass43 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass52 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass55 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass43 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass55 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass52 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass49 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass25 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass43 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass49 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass46 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass61 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int63 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass64 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass28 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass43 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int63 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int66 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int69 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int72 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int75 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int78 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int63 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int66 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass28 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass49 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass52 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass31 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass58 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass25 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass49 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass43 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass58 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass58 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass52 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int63 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass64 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass31 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass37 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass46 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass22 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass52 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass55 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass43 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass49 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass55 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int63 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass52 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int63 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass64 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass40 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass61 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass43 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass61 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int63 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int66 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int69 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int72 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int75 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int78 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass55 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass19 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int63 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int60 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int63 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int66 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass67 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass43 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass43 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass40 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass55 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        // The following exception was thrown during execution in test generation
        try {
            int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Sender and Receiver bits should be same");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass46 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        java.lang.Class<?> wildcardClass58 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int54 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int57 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        java.lang.Class<?> wildcardClass58 = hammingDistance0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        com.thealgorithms.others.cn.HammingDistance hammingDistance0 = new com.thealgorithms.others.cn.HammingDistance();
        int int3 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int6 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int9 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int12 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int15 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int18 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int21 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int24 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int27 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int30 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int33 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int36 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int39 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int42 = hammingDistance0.getHammingDistanceBetweenBits("", "");
        int int45 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int48 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        int int51 = hammingDistance0.getHammingDistanceBetweenBits("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }
}

