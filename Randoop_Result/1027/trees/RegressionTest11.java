package trees;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) '4');
        boolean boolean14 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) 'a');
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove(1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) '4');
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put((-1));
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(100);
        boolean boolean8 = binaryTree0.remove((int) '#');
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean22 = binaryTree0.remove((int) '#');
        boolean boolean24 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put(0);
        binaryTree0.put((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(0);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((-1));
        binaryTree0.put((int) 'a');
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) -1);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove(1);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass31 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put(1);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        boolean boolean22 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) '4');
        binaryTree0.put(1);
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        boolean boolean22 = binaryTree0.remove((int) 'a');
        boolean boolean24 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean24 = binaryTree0.remove((int) '4');
        boolean boolean26 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(1);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        boolean boolean18 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        boolean boolean20 = binaryTree0.remove(10);
        boolean boolean22 = binaryTree0.remove((int) (short) 0);
        boolean boolean24 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        boolean boolean20 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(1);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put(1);
        binaryTree0.put(100);
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove(1);
        boolean boolean24 = binaryTree0.remove(10);
        binaryTree0.put(100);
        boolean boolean28 = binaryTree0.remove((int) (short) 10);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        boolean boolean20 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) -1);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 10);
        boolean boolean16 = binaryTree0.remove(1);
        binaryTree0.put(0);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        binaryTree0.put((int) '4');
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        boolean boolean24 = binaryTree0.remove(10);
        boolean boolean26 = binaryTree0.remove((int) '4');
        boolean boolean28 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) '4');
        boolean boolean20 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) 'a');
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) -1);
        boolean boolean22 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '4');
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove(1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(100);
        boolean boolean16 = binaryTree0.remove(100);
        binaryTree0.put(1);
        boolean boolean20 = binaryTree0.remove(10);
        boolean boolean22 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        boolean boolean24 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((-1));
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(1);
        boolean boolean8 = binaryTree0.remove((int) '4');
        boolean boolean10 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        boolean boolean24 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 100);
        boolean boolean32 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean20 = binaryTree0.remove((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) 10);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        boolean boolean18 = binaryTree0.remove(1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '4');
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        boolean boolean22 = binaryTree0.remove(0);
        boolean boolean24 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) ' ');
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) -1);
        boolean boolean30 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '#');
        boolean boolean20 = binaryTree0.remove((int) '4');
        boolean boolean22 = binaryTree0.remove(100);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) '#');
        boolean boolean22 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(100);
        binaryTree0.put(0);
        boolean boolean20 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean24 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean20 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(0);
        binaryTree0.put(0);
        binaryTree0.put((-1));
        binaryTree0.put((int) ' ');
        boolean boolean24 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put(0);
        binaryTree0.put(10);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(1);
        boolean boolean18 = binaryTree0.remove(100);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(1);
        boolean boolean20 = binaryTree0.remove((int) 'a');
        boolean boolean22 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(1);
        boolean boolean24 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(100);
        boolean boolean22 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) 'a');
        binaryTree0.put(0);
        boolean boolean22 = binaryTree0.remove(0);
        boolean boolean24 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '4');
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) 'a');
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(0);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put(10);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 100);
        boolean boolean20 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove((int) 'a');
        binaryTree0.put(0);
        boolean boolean22 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put(10);
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) '4');
        boolean boolean20 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) '4');
        boolean boolean20 = binaryTree0.remove((int) '#');
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        boolean boolean24 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((-1));
        binaryTree0.put((int) ' ');
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(1);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put(0);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean24 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) '4');
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        boolean boolean24 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        boolean boolean12 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) 'a');
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put(0);
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(1);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        boolean boolean24 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(100);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(1);
        boolean boolean20 = binaryTree0.remove((int) 'a');
        boolean boolean22 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 10);
        boolean boolean32 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        boolean boolean24 = binaryTree0.remove(1);
        boolean boolean26 = binaryTree0.remove(0);
        boolean boolean28 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) ' ');
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(10);
        boolean boolean26 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 0);
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(10);
        boolean boolean28 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        boolean boolean20 = binaryTree0.remove((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove(0);
        boolean boolean20 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) 0);
        boolean boolean24 = binaryTree0.remove((int) 'a');
        boolean boolean26 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (short) -1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '4');
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) -1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((-1));
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) '4');
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((-1));
        boolean boolean12 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put(1);
        boolean boolean18 = binaryTree0.remove(10);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean18 = binaryTree0.remove((-1));
        boolean boolean20 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        boolean boolean18 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean22 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 10);
        boolean boolean26 = binaryTree0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(1);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove(0);
        boolean boolean20 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) 0);
        boolean boolean24 = binaryTree0.remove((int) 'a');
        boolean boolean26 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        boolean boolean20 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((-1));
        boolean boolean24 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove((int) ' ');
        boolean boolean20 = binaryTree0.remove(100);
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) '#');
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        boolean boolean24 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '4');
        boolean boolean8 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) 'a');
        boolean boolean14 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) ' ');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean18 = binaryTree0.remove(100);
        boolean boolean20 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(100);
        boolean boolean18 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove(1);
        binaryTree0.put(100);
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove(100);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(1);
        binaryTree0.put(1);
        boolean boolean8 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        boolean boolean6 = binaryTree0.remove((int) 'a');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) ' ');
        binaryTree0.put(1);
        boolean boolean14 = binaryTree0.remove(10);
        boolean boolean16 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(1);
        boolean boolean18 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) '4');
        binaryTree0.put(1);
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove((-1));
        boolean boolean18 = binaryTree0.remove(10);
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) ' ');
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(0);
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(1);
        boolean boolean18 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove(10);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) '#');
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        boolean boolean20 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean24 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) '4');
        boolean boolean28 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove(0);
        boolean boolean20 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) 0);
        boolean boolean24 = binaryTree0.remove((int) 'a');
        boolean boolean26 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((-1));
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((-1));
        boolean boolean18 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 1);
        boolean boolean22 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) ' ');
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove(100);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        boolean boolean18 = binaryTree0.remove(10);
        binaryTree0.put((int) '#');
        boolean boolean22 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) -1);
        boolean boolean26 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '#');
        boolean boolean20 = binaryTree0.remove(0);
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        boolean boolean24 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) ' ');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 1);
        boolean boolean24 = binaryTree0.remove((int) (byte) 100);
        boolean boolean26 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        boolean boolean24 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) '4');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(10);
        boolean boolean26 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        boolean boolean20 = binaryTree0.remove(1);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        boolean boolean20 = binaryTree0.remove(1);
        binaryTree0.put(1);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        boolean boolean18 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        boolean boolean24 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '4');
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(100);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        boolean boolean12 = binaryTree0.remove(100);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) '#');
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(0);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        boolean boolean24 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(100);
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) 'a');
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean18 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put(10);
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) ' ');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((-1));
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(100);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        boolean boolean24 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean28 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass31 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        boolean boolean6 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(10);
        binaryTree0.put((-1));
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean24 = binaryTree0.remove((int) (short) 100);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put(0);
        binaryTree0.put((int) ' ');
        boolean boolean22 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) -1);
        boolean boolean6 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((-1));
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put(10);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 10);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        boolean boolean24 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 1);
        boolean boolean18 = binaryTree0.remove(10);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) '4');
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '#');
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        boolean boolean24 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) ' ');
        boolean boolean16 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        binaryTree0.put((-1));
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        boolean boolean24 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 0);
        boolean boolean20 = binaryTree0.remove((int) '#');
        boolean boolean22 = binaryTree0.remove(10);
        boolean boolean24 = binaryTree0.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '4');
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove(1);
        boolean boolean22 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 1);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((-1));
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(1);
        boolean boolean22 = binaryTree0.remove(1);
        boolean boolean24 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 1);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(1);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(0);
        boolean boolean24 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove(100);
        boolean boolean14 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) 'a');
        boolean boolean10 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put(1);
        binaryTree0.put(100);
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 1);
        boolean boolean26 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((-1));
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(0);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove(100);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        boolean boolean22 = binaryTree0.remove(0);
        boolean boolean24 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put(1);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(100);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) ' ');
        boolean boolean20 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 100);
        boolean boolean24 = binaryTree0.remove((int) (byte) 100);
        boolean boolean26 = binaryTree0.remove((int) '4');
        boolean boolean28 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put(0);
        binaryTree0.put((int) '4');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean22 = binaryTree0.remove((int) (short) 0);
        boolean boolean24 = binaryTree0.remove(0);
        binaryTree0.put(10);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((-1));
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove((-1));
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put(10);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean20 = binaryTree0.remove((int) ' ');
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove(0);
        boolean boolean22 = binaryTree0.remove(1);
        boolean boolean24 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 100);
        boolean boolean18 = binaryTree0.remove(10);
        binaryTree0.put(0);
        boolean boolean22 = binaryTree0.remove((-1));
        boolean boolean24 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '4');
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) ' ');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean24 = binaryTree0.remove((int) '4');
        boolean boolean26 = binaryTree0.remove((int) (short) 10);
        boolean boolean28 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) '#');
        boolean boolean20 = binaryTree0.remove(0);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        boolean boolean24 = binaryTree0.remove((-1));
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) ' ');
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) -1);
        boolean boolean6 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean10 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(100);
        boolean boolean16 = binaryTree0.remove(100);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 100);
        boolean boolean24 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) -1);
        boolean boolean28 = binaryTree0.remove((int) (short) -1);
        boolean boolean30 = binaryTree0.remove((int) (byte) 100);
        boolean boolean32 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put(1);
        binaryTree0.put(100);
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        boolean boolean24 = binaryTree0.remove((int) (byte) 0);
        boolean boolean26 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove(1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(10);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        boolean boolean20 = binaryTree0.remove((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) '#');
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        boolean boolean20 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) '#');
        boolean boolean22 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(100);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(10);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(0);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((-1));
        boolean boolean20 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put(1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean8 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(10);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (byte) -1);
        boolean boolean22 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(100);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        boolean boolean20 = binaryTree0.remove((int) 'a');
        boolean boolean22 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean20 = binaryTree0.remove((int) ' ');
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) ' ');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '#');
        boolean boolean20 = binaryTree0.remove((int) '4');
        boolean boolean22 = binaryTree0.remove(100);
        boolean boolean24 = binaryTree0.remove((int) (short) 0);
        boolean boolean26 = binaryTree0.remove((int) (short) 1);
        boolean boolean28 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) '#');
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        boolean boolean8 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 100);
        boolean boolean18 = binaryTree0.remove(10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove(0);
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        boolean boolean24 = binaryTree0.remove((int) '#');
        boolean boolean26 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(0);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) '#');
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) 10);
        boolean boolean20 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) ' ');
        boolean boolean20 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) ' ');
        binaryTree0.put(100);
        boolean boolean14 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(100);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) '#');
        boolean boolean18 = binaryTree0.remove((int) '#');
        boolean boolean20 = binaryTree0.remove(1);
        boolean boolean22 = binaryTree0.remove(0);
        boolean boolean24 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((-1));
        boolean boolean28 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        boolean boolean22 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean8 = binaryTree0.remove(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove(100);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((-1));
        boolean boolean16 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean16 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        binaryTree0.put((int) ' ');
        boolean boolean12 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put(1);
        binaryTree0.put((int) (short) -1);
        boolean boolean20 = binaryTree0.remove(0);
        boolean boolean22 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 1);
        boolean boolean18 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 0);
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean20 = binaryTree0.remove(100);
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove(1);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) '#');
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        boolean boolean24 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) '4');
        boolean boolean28 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(100);
        boolean boolean18 = binaryTree0.remove((-1));
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(1);
        boolean boolean24 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) '#');
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove(0);
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        boolean boolean24 = binaryTree0.remove((int) '#');
        boolean boolean26 = binaryTree0.remove((-1));
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '4');
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean14 = binaryTree0.remove(100);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) '4');
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        boolean boolean24 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        boolean boolean20 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((-1));
        boolean boolean18 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) ' ');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put(0);
        binaryTree0.put(10);
        binaryTree0.put(100);
        boolean boolean22 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((int) '#');
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(100);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        boolean boolean22 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) '4');
        boolean boolean20 = binaryTree0.remove((int) '#');
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        boolean boolean24 = binaryTree0.remove(10);
        boolean boolean26 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 10);
        boolean boolean32 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put(1);
        binaryTree0.put(100);
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        boolean boolean24 = binaryTree0.remove((int) (byte) 0);
        boolean boolean26 = binaryTree0.remove((int) '#');
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) -1);
        boolean boolean24 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) '#');
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        boolean boolean24 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        boolean boolean20 = binaryTree0.remove(0);
        binaryTree0.put(1);
        boolean boolean24 = binaryTree0.remove((int) 'a');
        boolean boolean26 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put(100);
        boolean boolean20 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) '4');
        boolean boolean20 = binaryTree0.remove((int) (short) 100);
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 0);
        boolean boolean24 = binaryTree0.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) '#');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((-1));
        boolean boolean16 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 10);
        boolean boolean20 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove(0);
        boolean boolean20 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((-1));
        binaryTree0.put(1);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) '4');
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        boolean boolean24 = binaryTree0.remove(0);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(10);
        boolean boolean20 = binaryTree0.remove((int) 'a');
        boolean boolean22 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(100);
        boolean boolean22 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '#');
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        boolean boolean22 = binaryTree0.remove(100);
        boolean boolean24 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) '4');
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) ' ');
        binaryTree0.put(10);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        boolean boolean8 = binaryTree0.remove((int) (short) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) '4');
        boolean boolean20 = binaryTree0.remove((int) '#');
        boolean boolean22 = binaryTree0.remove((int) ' ');
        binaryTree0.put(1);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) '4');
        binaryTree0.put(1);
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        boolean boolean24 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) '4');
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(0);
        binaryTree0.put(0);
        boolean boolean30 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean20 = binaryTree0.remove((int) ' ');
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(10);
        boolean boolean36 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 100);
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put(1);
        binaryTree0.put((int) (short) -1);
        boolean boolean20 = binaryTree0.remove(0);
        boolean boolean22 = binaryTree0.remove((int) (byte) -1);
        boolean boolean24 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) '#');
        boolean boolean14 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '#');
        boolean boolean20 = binaryTree0.remove((int) '4');
        boolean boolean22 = binaryTree0.remove(100);
        boolean boolean24 = binaryTree0.remove((int) (short) 0);
        boolean boolean26 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 100);
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) ' ');
        boolean boolean18 = binaryTree0.remove(10);
        binaryTree0.put((-1));
        boolean boolean22 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        boolean boolean6 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean22 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((-1));
        boolean boolean26 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        boolean boolean24 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) 'a');
        boolean boolean30 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass31 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        boolean boolean20 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean24 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove(0);
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        boolean boolean20 = binaryTree0.remove(1);
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) ' ');
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put(0);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean20 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '4');
        boolean boolean8 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(10);
        boolean boolean20 = binaryTree0.remove((int) 'a');
        boolean boolean22 = binaryTree0.remove((int) 'a');
        boolean boolean24 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove(1);
        boolean boolean18 = binaryTree0.remove(0);
        boolean boolean20 = binaryTree0.remove(100);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(0);
        boolean boolean20 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean24 = binaryTree0.remove(0);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean20 = binaryTree0.remove((int) ' ');
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean26 = binaryTree0.remove((int) '#');
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) -1);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        boolean boolean22 = binaryTree0.remove(0);
        boolean boolean24 = binaryTree0.remove((int) (byte) 100);
        boolean boolean26 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '#');
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) 'a');
        boolean boolean22 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) '#');
        boolean boolean12 = binaryTree0.remove((-1));
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((-1));
        boolean boolean12 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove(10);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(1);
        boolean boolean8 = binaryTree0.remove(100);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove(1);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(1);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put((-1));
        binaryTree0.put((int) ' ');
        boolean boolean20 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '#');
        binaryTree0.put(100);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        boolean boolean6 = binaryTree0.remove((int) 'a');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        boolean boolean16 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(0);
        binaryTree0.put((int) ' ');
        boolean boolean12 = binaryTree0.remove(1);
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) -1);
        boolean boolean20 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) ' ');
        binaryTree0.put(1);
        boolean boolean26 = binaryTree0.remove((int) (short) 0);
        boolean boolean28 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(100);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) ' ');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 0);
        boolean boolean8 = binaryTree0.remove((int) (short) -1);
        boolean boolean10 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) ' ');
        boolean boolean20 = binaryTree0.remove(100);
        boolean boolean22 = binaryTree0.remove((int) (byte) -1);
        boolean boolean24 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) 'a');
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove((int) 'a');
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean24 = binaryTree0.remove(0);
        boolean boolean26 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(10);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        boolean boolean20 = binaryTree0.remove(100);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 0);
        boolean boolean24 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) -1);
        boolean boolean6 = binaryTree0.remove(1);
        boolean boolean8 = binaryTree0.remove((int) 'a');
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put(100);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

