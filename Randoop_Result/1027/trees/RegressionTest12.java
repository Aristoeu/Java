package trees;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) ' ');
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        boolean boolean24 = binaryTree0.remove((int) (byte) 1);
        boolean boolean26 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
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
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) ' ');
        binaryTree0.put(100);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
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
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
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
        boolean boolean20 = binaryTree0.remove((int) ' ');
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((-1));
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
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
        binaryTree0.put((-1));
        boolean boolean28 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(0);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
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
        boolean boolean24 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
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
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove(1);
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
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
        boolean boolean20 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
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
        boolean boolean28 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
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
        boolean boolean20 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove(100);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
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
        boolean boolean26 = binaryTree0.remove((int) (short) 100);
        boolean boolean28 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
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
        boolean boolean20 = binaryTree0.remove((int) '4');
        boolean boolean22 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove(100);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove((int) '#');
        boolean boolean20 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) -1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        boolean boolean6 = binaryTree0.remove((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
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
        boolean boolean26 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 100);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) '#');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
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
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove(1);
        boolean boolean18 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
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
        boolean boolean24 = binaryTree0.remove(0);
        boolean boolean26 = binaryTree0.remove(0);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) ' ');
        java.lang.Class<?> wildcardClass31 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
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
        boolean boolean20 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
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
        boolean boolean22 = binaryTree0.remove((int) '4');
        boolean boolean24 = binaryTree0.remove((int) (byte) 1);
        boolean boolean26 = binaryTree0.remove(1);
        boolean boolean28 = binaryTree0.remove(100);
        binaryTree0.put(10);
        boolean boolean32 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
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
        boolean boolean20 = binaryTree0.remove((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
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
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 1);
        boolean boolean24 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(10);
        boolean boolean20 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
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
        boolean boolean22 = binaryTree0.remove(0);
        boolean boolean24 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
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
        boolean boolean24 = binaryTree0.remove((int) (short) 0);
        boolean boolean26 = binaryTree0.remove((int) (short) 1);
        boolean boolean28 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(100);
        binaryTree0.put(1);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) (short) 0);
        boolean boolean6 = binaryTree0.remove(10);
        boolean boolean8 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
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
        boolean boolean22 = binaryTree0.remove(1);
        boolean boolean24 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(100);
        boolean boolean8 = binaryTree0.remove((int) '#');
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        boolean boolean6 = binaryTree0.remove(1);
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove(100);
        boolean boolean14 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) ' ');
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
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
        boolean boolean20 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) '4');
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        boolean boolean22 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put((int) ' ');
        boolean boolean20 = binaryTree0.remove((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
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
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        binaryTree0.put(10);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(100);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
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
        binaryTree0.put((int) ' ');
        boolean boolean24 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((int) '#');
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
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
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(0);
        boolean boolean24 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) 1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        boolean boolean22 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        boolean boolean8 = binaryTree0.remove((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(10);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 0);
        boolean boolean12 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) ' ');
        boolean boolean8 = binaryTree0.remove((int) (short) 10);
        boolean boolean10 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean14 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
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
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((-1));
        binaryTree0.put((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(10);
        binaryTree0.put((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) '#');
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        boolean boolean22 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove(10);
        boolean boolean14 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 0);
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) ' ');
        boolean boolean12 = binaryTree0.remove((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
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
        boolean boolean20 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
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
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        boolean boolean6 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
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
        boolean boolean24 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
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
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) ' ');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
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
        boolean boolean30 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) -1);
        boolean boolean22 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) -1);
        boolean boolean24 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
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
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
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
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove(1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove(100);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove(100);
        boolean boolean20 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
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
        boolean boolean24 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 10);
        boolean boolean20 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
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
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
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
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove(100);
        boolean boolean20 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) -1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove(0);
        boolean boolean20 = binaryTree0.remove(0);
        boolean boolean22 = binaryTree0.remove(100);
        boolean boolean24 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean22 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
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
        binaryTree0.put(100);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 100);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 100);
        boolean boolean20 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) -1);
        boolean boolean8 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) ' ');
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '4');
        binaryTree0.put(100);
        boolean boolean18 = binaryTree0.remove(0);
        boolean boolean20 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove((-1));
        boolean boolean20 = binaryTree0.remove((-1));
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
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
        boolean boolean24 = binaryTree0.remove(10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        boolean boolean14 = binaryTree0.remove(10);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
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
        boolean boolean22 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove(10);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
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
        boolean boolean20 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 100);
        boolean boolean24 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove(10);
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
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
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(10);
        boolean boolean26 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        boolean boolean10 = binaryTree0.remove(1);
        boolean boolean12 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
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
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
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
        boolean boolean22 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
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
        binaryTree0.put((int) (byte) 100);
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        boolean boolean18 = binaryTree0.remove(1);
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((-1));
        boolean boolean16 = binaryTree0.remove((-1));
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        boolean boolean8 = binaryTree0.remove((int) (short) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(1);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) ' ');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(1);
        binaryTree0.put((int) 'a');
        boolean boolean22 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
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
        boolean boolean24 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(1);
        boolean boolean18 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(1);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
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
        boolean boolean24 = binaryTree0.remove((int) (byte) 100);
        boolean boolean26 = binaryTree0.remove(0);
        boolean boolean28 = binaryTree0.remove(100);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        boolean boolean18 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean20 = binaryTree0.remove((int) '#');
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        boolean boolean24 = binaryTree0.remove(1);
        boolean boolean26 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove(100);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
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
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
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
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(0);
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 10);
        boolean boolean24 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(1);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean20 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
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
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(1);
        boolean boolean16 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
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
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
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
        boolean boolean20 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        boolean boolean6 = binaryTree0.remove(1);
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove(100);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean6 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
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
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        boolean boolean24 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove(100);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
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
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 0);
        boolean boolean26 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) ' ');
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) 'a');
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put(1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 1);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(1);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) ' ');
        boolean boolean22 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean18 = binaryTree0.remove(100);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean22 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(0);
        boolean boolean22 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
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
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) -1);
        boolean boolean12 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
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
        boolean boolean24 = binaryTree0.remove((int) '#');
        boolean boolean26 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
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
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
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
        boolean boolean22 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
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
        boolean boolean20 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) '#');
        boolean boolean14 = binaryTree0.remove((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) (byte) 100);
        boolean boolean10 = binaryTree0.remove(10);
        boolean boolean12 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        boolean boolean6 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 1);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 100);
        boolean boolean22 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        boolean boolean18 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((-1));
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
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
        boolean boolean20 = binaryTree0.remove((int) '#');
        binaryTree0.put(1);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove(100);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
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
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) '4');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        boolean boolean12 = binaryTree0.remove(100);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
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
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove(10);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((-1));
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        boolean boolean24 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
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
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(100);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
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
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
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
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) ' ');
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
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
        boolean boolean24 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 10);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(1);
        binaryTree0.put(1);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove(100);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 1);
        boolean boolean20 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
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
        binaryTree0.put((int) (short) 10);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
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
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
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
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
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
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        boolean boolean24 = binaryTree0.remove((int) 'a');
        boolean boolean26 = binaryTree0.remove((-1));
        boolean boolean28 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(100);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
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
        boolean boolean24 = binaryTree0.remove((int) (short) 1);
        boolean boolean26 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) -1);
        boolean boolean30 = binaryTree0.remove((int) (short) 0);
        boolean boolean32 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
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
        boolean boolean22 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
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
        boolean boolean30 = binaryTree0.remove((int) (byte) 100);
        boolean boolean32 = binaryTree0.remove((-1));
        boolean boolean34 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put(1);
        java.lang.Class<?> wildcardClass39 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((-1));
        boolean boolean20 = binaryTree0.remove(100);
        binaryTree0.put((int) ' ');
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(1);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove((-1));
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
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
        binaryTree0.put((int) (byte) 100);
        boolean boolean22 = binaryTree0.remove((int) (byte) 0);
        boolean boolean24 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
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
        boolean boolean24 = binaryTree0.remove((int) (byte) 10);
        boolean boolean26 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((-1));
        boolean boolean20 = binaryTree0.remove(100);
        boolean boolean22 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
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
        boolean boolean26 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove(1);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
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
        boolean boolean30 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
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
        binaryTree0.put(1);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
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
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        boolean boolean14 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) 'a');
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
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
        boolean boolean20 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        boolean boolean6 = binaryTree0.remove((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 10);
        boolean boolean10 = binaryTree0.remove(100);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
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
        boolean boolean20 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
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
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
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
        boolean boolean22 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
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
        binaryTree0.put((int) (byte) -1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        boolean boolean12 = binaryTree0.remove(100);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
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
        binaryTree0.put((int) '4');
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
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
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
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
        boolean boolean26 = binaryTree0.remove((-1));
        boolean boolean28 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
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
        binaryTree0.put((int) 'a');
        boolean boolean24 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = binaryTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
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
        boolean boolean24 = binaryTree0.remove(10);
        boolean boolean26 = binaryTree0.remove((int) (short) 1);
        boolean boolean28 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove(10);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean18 = binaryTree0.remove(1);
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(10);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
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
        binaryTree0.put((int) (byte) 100);
        boolean boolean24 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
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
        binaryTree0.put(0);
        boolean boolean22 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) '4');
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        boolean boolean24 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        boolean boolean18 = binaryTree0.remove(0);
        boolean boolean20 = binaryTree0.remove(1);
        boolean boolean22 = binaryTree0.remove(0);
        boolean boolean24 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
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
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(0);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
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
        boolean boolean22 = binaryTree0.remove((int) '4');
        boolean boolean24 = binaryTree0.remove((int) (byte) 1);
        boolean boolean26 = binaryTree0.remove(1);
        boolean boolean28 = binaryTree0.remove(100);
        boolean boolean30 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
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
        boolean boolean20 = binaryTree0.remove((int) ' ');
        boolean boolean22 = binaryTree0.remove((int) (short) 0);
        boolean boolean24 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) ' ');
        boolean boolean28 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 1);
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        boolean boolean16 = binaryTree0.remove(100);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
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
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        boolean boolean6 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) -1);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(1);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        boolean boolean14 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) '4');
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
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
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove(100);
        boolean boolean20 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
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
        binaryTree0.put((int) (byte) 1);
        boolean boolean28 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
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
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(100);
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
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
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
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
        boolean boolean22 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
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
        boolean boolean20 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        boolean boolean26 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
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
        boolean boolean20 = binaryTree0.remove(10);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
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
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((-1));
        boolean boolean20 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
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
        boolean boolean24 = binaryTree0.remove((int) (byte) 100);
        boolean boolean26 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
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
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
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
        boolean boolean20 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        boolean boolean18 = binaryTree0.remove((-1));
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
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
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
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
        boolean boolean24 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        boolean boolean18 = binaryTree0.remove(10);
        binaryTree0.put(10);
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
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
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((-1));
        boolean boolean22 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
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
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
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
        boolean boolean24 = binaryTree0.remove((int) ' ');
        boolean boolean26 = binaryTree0.remove((int) (byte) -1);
        boolean boolean28 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
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
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '#');
        boolean boolean14 = binaryTree0.remove(1);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
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
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
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
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
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
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
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
        boolean boolean20 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(1);
        boolean boolean18 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(0);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
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
        boolean boolean22 = binaryTree0.remove((int) '4');
        boolean boolean24 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean28 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
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
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 1);
        boolean boolean28 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove((int) 'a');
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
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
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) 'a');
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
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
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        binaryTree0.put((-1));
        boolean boolean16 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        boolean boolean18 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (short) 100);
        boolean boolean22 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) '4');
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        boolean boolean24 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(10);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        boolean boolean24 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
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
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
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
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        boolean boolean22 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
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
        boolean boolean28 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 1);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean16 = binaryTree0.remove((-1));
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
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
        boolean boolean28 = binaryTree0.remove(0);
        boolean boolean30 = binaryTree0.remove((int) (byte) 0);
        boolean boolean32 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass33 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
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
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        binaryTree0.put((int) 'a');
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
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
        binaryTree0.put((int) '#');
        boolean boolean22 = binaryTree0.remove((int) (byte) 0);
        boolean boolean24 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean8 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        boolean boolean8 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
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
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) -1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put((-1));
        boolean boolean16 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
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
        binaryTree0.put((int) (short) -1);
        boolean boolean22 = binaryTree0.remove((-1));
        boolean boolean24 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(1);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
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
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
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
        boolean boolean22 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove((int) 'a');
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(100);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '4');
        boolean boolean8 = binaryTree0.remove((int) (byte) 1);
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
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
        boolean boolean24 = binaryTree0.remove((int) ' ');
        binaryTree0.put(1);
        boolean boolean28 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass31 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((-1));
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) 'a');
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) -1);
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) ' ');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
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
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) '4');
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        boolean boolean18 = binaryTree0.remove(0);
        boolean boolean20 = binaryTree0.remove(100);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
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
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove(1);
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
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
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
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
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
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
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(10);
        boolean boolean28 = binaryTree0.remove((int) 'a');
        boolean boolean30 = binaryTree0.remove((int) (short) 100);
        java.lang.Class<?> wildcardClass31 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean18 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
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
        binaryTree0.put((int) (short) 1);
        boolean boolean24 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(1);
        boolean boolean8 = binaryTree0.remove((int) '4');
        boolean boolean10 = binaryTree0.remove(100);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
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
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(1);
        boolean boolean8 = binaryTree0.remove((int) '4');
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(1);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
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
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
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
        boolean boolean24 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put(1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(100);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
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
        boolean boolean24 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 1);
        boolean boolean18 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
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
        boolean boolean20 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 100);
        boolean boolean24 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
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
        binaryTree0.put(0);
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) ' ');
        boolean boolean16 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
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
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
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
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((-1));
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
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
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '4');
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass9 = binaryTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) -1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) '#');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 100);
        boolean boolean18 = binaryTree0.remove((int) '4');
        boolean boolean20 = binaryTree0.remove((int) '#');
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 100);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) 'a');
        binaryTree0.put((-1));
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        boolean boolean18 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean18 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 100);
        boolean boolean22 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
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
        boolean boolean22 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
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
        binaryTree0.put(100);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 100);
        boolean boolean16 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(1);
        boolean boolean8 = binaryTree0.remove((int) '4');
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
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
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(1);
        boolean boolean18 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) -1);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(100);
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) '#');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove((-1));
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
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
        binaryTree0.put(100);
        boolean boolean28 = binaryTree0.remove((int) (short) 100);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
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
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
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
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
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
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((-1));
        binaryTree0.put((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}

