package trees;

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
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove(1);
        boolean boolean14 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove(100);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove((int) '#');
        boolean boolean22 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(1);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean10 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
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
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
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
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        boolean boolean28 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        boolean boolean10 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) -1);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((int) '#');
        boolean boolean14 = binaryTree0.remove(100);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        binaryTree0.put(0);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((-1));
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (byte) 1);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) -1);
        boolean boolean8 = binaryTree0.remove((int) (short) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 1);
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove(1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        boolean boolean20 = binaryTree0.remove((-1));
        boolean boolean22 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 10);
        boolean boolean26 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove(10);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(100);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
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
        java.lang.Class<?> wildcardClass33 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
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
        boolean boolean20 = binaryTree0.remove(1);
        boolean boolean22 = binaryTree0.remove(1);
        boolean boolean24 = binaryTree0.remove((int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
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
        boolean boolean20 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 1);
        boolean boolean24 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
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
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
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
        boolean boolean22 = binaryTree0.remove((int) '4');
        boolean boolean24 = binaryTree0.remove(1);
        boolean boolean26 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
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
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) ' ');
        binaryTree0.put(1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) 0);
        boolean boolean12 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) 'a');
        boolean boolean14 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 10);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        boolean boolean22 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
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
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove(10);
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(0);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((int) '#');
        boolean boolean20 = binaryTree0.remove((int) ' ');
        boolean boolean22 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
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
        boolean boolean26 = binaryTree0.remove(10);
        boolean boolean28 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put(0);
        binaryTree0.put(1);
        boolean boolean26 = binaryTree0.remove((int) (short) 100);
        boolean boolean28 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
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
        boolean boolean22 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
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
        boolean boolean30 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        boolean boolean36 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
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
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((-1));
        binaryTree0.put((-1));
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put(1);
        binaryTree0.put(10);
        binaryTree0.put(0);
        boolean boolean20 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) -1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        binaryTree0.put(10);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove(1);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((int) (byte) 100);
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        boolean boolean24 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
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
        boolean boolean20 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(10);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove(100);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
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
        binaryTree0.put(10);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) 'a');
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) 'a');
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(100);
        boolean boolean22 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (byte) 0);
        boolean boolean10 = binaryTree0.remove(1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(0);
        binaryTree0.put(100);
        boolean boolean22 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) '4');
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove(100);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put((int) ' ');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
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
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) ' ');
        boolean boolean26 = binaryTree0.remove((int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove(10);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 100);
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(1);
        boolean boolean18 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(100);
        boolean boolean16 = binaryTree0.remove((int) '#');
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
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
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        boolean boolean22 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '4');
        binaryTree0.put(100);
        binaryTree0.put((int) '4');
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
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
        boolean boolean22 = binaryTree0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(10);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (short) 1);
        boolean boolean20 = binaryTree0.remove((int) '#');
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) ' ');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
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
        boolean boolean24 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = binaryTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean10 = binaryTree0.remove(1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(100);
        boolean boolean20 = binaryTree0.remove(1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        boolean boolean24 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        binaryTree0.put(0);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '4');
        boolean boolean8 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
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
        boolean boolean20 = binaryTree0.remove((int) '4');
        boolean boolean22 = binaryTree0.remove(10);
        binaryTree0.put(0);
        boolean boolean26 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
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
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(100);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '4');
        boolean boolean22 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) 'a');
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put(1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
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
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove((int) 'a');
        binaryTree0.put(100);
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        boolean boolean22 = binaryTree0.remove(0);
        boolean boolean24 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(100);
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) 'a');
        boolean boolean14 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
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
        boolean boolean22 = binaryTree0.remove((int) '4');
        boolean boolean24 = binaryTree0.remove((int) (byte) 100);
        boolean boolean26 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((-1));
        boolean boolean30 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
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
        boolean boolean22 = binaryTree0.remove((int) (byte) -1);
        boolean boolean24 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove(100);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((-1));
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        boolean boolean12 = binaryTree0.remove(1);
        boolean boolean14 = binaryTree0.remove(100);
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) -1);
        boolean boolean22 = binaryTree0.remove(10);
        boolean boolean24 = binaryTree0.remove((int) (short) 1);
        boolean boolean26 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
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
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
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
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        boolean boolean8 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        boolean boolean6 = binaryTree0.remove(1);
        boolean boolean8 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove(100);
        boolean boolean16 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) ' ');
        boolean boolean24 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
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
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) 'a');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
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
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '#');
        boolean boolean20 = binaryTree0.remove((-1));
        boolean boolean22 = binaryTree0.remove(1);
        boolean boolean24 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        boolean boolean20 = binaryTree0.remove(1);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) '4');
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove(10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) '#');
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean20 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) '#');
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) ' ');
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
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
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
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
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '4');
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        boolean boolean20 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
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
        binaryTree0.put((int) '4');
        boolean boolean24 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
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
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 100);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
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
        binaryTree0.put((int) ' ');
        boolean boolean22 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((-1));
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
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
        boolean boolean20 = binaryTree0.remove(0);
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        boolean boolean20 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
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
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        boolean boolean24 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) ' ');
        boolean boolean12 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) 'a');
        boolean boolean20 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean8 = binaryTree0.remove((int) '4');
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) -1);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        boolean boolean16 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
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
        boolean boolean28 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) '#');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) '#');
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (short) 100);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove(1);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
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
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) '#');
        boolean boolean24 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put(1);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove((-1));
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '#');
        boolean boolean26 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
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
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (short) 100);
        boolean boolean20 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        boolean boolean14 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) ' ');
        boolean boolean12 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
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
        boolean boolean22 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) '#');
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(0);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) '4');
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
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
        binaryTree0.put((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
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
        boolean boolean20 = binaryTree0.remove((int) '4');
        boolean boolean22 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove(10);
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
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
        binaryTree0.put((int) ' ');
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        boolean boolean24 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
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
        binaryTree0.put(1);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
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
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove(100);
        binaryTree0.put(10);
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((-1));
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
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
        boolean boolean20 = binaryTree0.remove((int) 'a');
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove(10);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
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
        binaryTree0.put((int) ' ');
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        boolean boolean24 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(100);
        boolean boolean8 = binaryTree0.remove((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        boolean boolean8 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
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
        boolean boolean22 = binaryTree0.remove((int) '4');
        boolean boolean24 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
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
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        boolean boolean24 = binaryTree0.remove((int) 'a');
        boolean boolean26 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        boolean boolean18 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '#');
        binaryTree0.put(100);
        binaryTree0.put(0);
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
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
        boolean boolean22 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) 'a');
        boolean boolean26 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) (short) 0);
        boolean boolean6 = binaryTree0.remove(10);
        java.lang.Class<?> wildcardClass7 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        boolean boolean24 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
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
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '4');
        boolean boolean26 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put((int) ' ');
        binaryTree0.put(10);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(100);
        boolean boolean8 = binaryTree0.remove((int) '#');
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
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
        boolean boolean20 = binaryTree0.remove((int) '4');
        boolean boolean22 = binaryTree0.remove(100);
        boolean boolean24 = binaryTree0.remove((int) ' ');
        boolean boolean26 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean22 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove(1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) '4');
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
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
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 0);
        boolean boolean24 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(100);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove(1);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean22 = binaryTree0.remove(100);
        binaryTree0.put(0);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
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
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 1);
        boolean boolean24 = binaryTree0.remove((int) (short) 10);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) '#');
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove(10);
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        boolean boolean20 = binaryTree0.remove(0);
        boolean boolean22 = binaryTree0.remove(100);
        boolean boolean24 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put(1);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove((int) '4');
        boolean boolean22 = binaryTree0.remove(100);
        boolean boolean24 = binaryTree0.remove(1);
        boolean boolean26 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
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
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
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
        boolean boolean28 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(0);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
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
        binaryTree0.put(100);
        boolean boolean22 = binaryTree0.remove(100);
        boolean boolean24 = binaryTree0.remove((int) (byte) 10);
        boolean boolean26 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) ' ');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(100);
        boolean boolean16 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 10);
        boolean boolean20 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((-1));
        boolean boolean18 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        boolean boolean6 = binaryTree0.remove(1);
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        boolean boolean18 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean22 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) ' ');
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
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
        boolean boolean22 = binaryTree0.remove(10);
        binaryTree0.put(1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 1);
        boolean boolean20 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 0);
        boolean boolean16 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) -1);
        boolean boolean20 = binaryTree0.remove(10);
        boolean boolean22 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
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
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(1);
        boolean boolean26 = binaryTree0.remove((int) '#');
        boolean boolean28 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
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
        boolean boolean28 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) ' ');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) 'a');
        binaryTree0.put(0);
        binaryTree0.put((int) ' ');
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 0);
        boolean boolean20 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
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
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean24 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) ' ');
        binaryTree0.put((-1));
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put((int) 'a');
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
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
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        boolean boolean24 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
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
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
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
        binaryTree0.put(1);
        boolean boolean22 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
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
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 10);
        boolean boolean18 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (short) 1);
        boolean boolean24 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put(0);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
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
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put(1);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
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
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
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
        boolean boolean22 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(100);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
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
        boolean boolean28 = binaryTree0.remove(100);
        boolean boolean30 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) ' ');
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) ' ');
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put(1);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(100);
        boolean boolean18 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        boolean boolean24 = binaryTree0.remove((int) (short) 0);
        boolean boolean26 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(1);
        binaryTree0.put(1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
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
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        boolean boolean24 = binaryTree0.remove((int) 'a');
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
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
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        binaryTree0.put(0);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) 100);
        boolean boolean24 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
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
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove(1);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        boolean boolean18 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) '4');
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
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
        binaryTree0.put(1);
        boolean boolean28 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((-1));
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) '4');
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 100);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) ' ');
        boolean boolean10 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put(0);
        boolean boolean24 = binaryTree0.remove((int) (short) 10);
        boolean boolean26 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass31 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove(1);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        boolean boolean24 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 100);
        boolean boolean20 = binaryTree0.remove(1);
        boolean boolean22 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) '#');
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put((-1));
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) 0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean20 = binaryTree0.remove((int) (short) 100);
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) ' ');
        boolean boolean18 = binaryTree0.remove(100);
        boolean boolean20 = binaryTree0.remove(0);
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
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
        binaryTree0.put((int) (short) -1);
        boolean boolean22 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
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
        boolean boolean22 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) 'a');
        boolean boolean18 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
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
        boolean boolean20 = binaryTree0.remove((int) '#');
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        binaryTree0.put(100);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        boolean boolean24 = binaryTree0.remove((-1));
        boolean boolean26 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove((int) 'a');
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
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
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(0);
        boolean boolean24 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

