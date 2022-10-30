package trees;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(1);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
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
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(10);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) '4');
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) '#');
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(0);
        boolean boolean24 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        boolean boolean20 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
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
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
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
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        boolean boolean8 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '4');
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
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
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
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
        boolean boolean20 = binaryTree0.remove((int) ' ');
        boolean boolean22 = binaryTree0.remove((int) (short) 0);
        boolean boolean24 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (byte) 1);
        boolean boolean20 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
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
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
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
        boolean boolean24 = binaryTree0.remove(100);
        boolean boolean26 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((-1));
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put(1);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
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
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
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
        binaryTree0.put(0);
        boolean boolean26 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) ' ');
        binaryTree0.put(1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove(100);
        boolean boolean18 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 100);
        boolean boolean12 = binaryTree0.remove(100);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
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
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
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
        boolean boolean24 = binaryTree0.remove(10);
        boolean boolean26 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
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
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
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
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
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
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
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
        boolean boolean20 = binaryTree0.remove((int) ' ');
        boolean boolean22 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
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
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
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
        binaryTree0.put((int) 'a');
        boolean boolean26 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean30 = binaryTree0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
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
        boolean boolean26 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
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
        boolean boolean26 = binaryTree0.remove((int) (short) 100);
        boolean boolean28 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) ' ');
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
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
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
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
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
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
        binaryTree0.put((int) (byte) 1);
        boolean boolean22 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
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
        binaryTree0.put((int) '4');
        boolean boolean22 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) '#');
        boolean boolean26 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean30 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
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
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(10);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '4');
        binaryTree0.put(100);
        boolean boolean22 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
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
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
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
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        boolean boolean6 = binaryTree0.remove(1);
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove(100);
        boolean boolean14 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 100);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        boolean boolean24 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) ' ');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(100);
        boolean boolean16 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
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
        boolean boolean24 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        boolean boolean6 = binaryTree0.remove((int) 'a');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
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
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(0);
        binaryTree0.put((int) ' ');
        boolean boolean12 = binaryTree0.remove(1);
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
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
        boolean boolean26 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
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
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
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
        boolean boolean22 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) 'a');
        boolean boolean18 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 1);
        boolean boolean22 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
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
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
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
        boolean boolean22 = binaryTree0.remove((int) ' ');
        boolean boolean24 = binaryTree0.remove((int) (short) 10);
        boolean boolean26 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(1);
        java.lang.Class<?> wildcardClass31 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        binaryTree0.put((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        boolean boolean20 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) '4');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
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
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove(100);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
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
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 1);
        boolean boolean24 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((-1));
        boolean boolean16 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
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
        boolean boolean28 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
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
        boolean boolean20 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) -1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
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
        binaryTree0.put((int) '4');
        binaryTree0.put((int) ' ');
        boolean boolean24 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        boolean boolean10 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
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
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        boolean boolean6 = binaryTree0.remove(1);
        boolean boolean8 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
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
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) 'a');
        binaryTree0.put(10);
        boolean boolean22 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put(1);
        binaryTree0.put((int) 'a');
        boolean boolean16 = binaryTree0.remove(100);
        boolean boolean18 = binaryTree0.remove((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove((-1));
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove(100);
        boolean boolean18 = binaryTree0.remove(100);
        boolean boolean20 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        boolean boolean8 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '4');
        binaryTree0.put(100);
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((-1));
        boolean boolean22 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
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
        boolean boolean26 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
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
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        binaryTree0.put(100);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(0);
        binaryTree0.put((int) ' ');
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
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
        boolean boolean24 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
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
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((-1));
        boolean boolean8 = binaryTree0.remove(1);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
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
        boolean boolean24 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
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
        boolean boolean20 = binaryTree0.remove(1);
        boolean boolean22 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((-1));
        boolean boolean12 = binaryTree0.remove((int) '4');
        boolean boolean14 = binaryTree0.remove(100);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) -1);
        boolean boolean24 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        boolean boolean18 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(100);
        boolean boolean16 = binaryTree0.remove((int) 'a');
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        boolean boolean6 = binaryTree0.remove(1);
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove(100);
        binaryTree0.put(10);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((int) '#');
        binaryTree0.put(10);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
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
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean14 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
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
        binaryTree0.put(1);
        boolean boolean30 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) -1);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        boolean boolean6 = binaryTree0.remove((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(100);
        boolean boolean10 = binaryTree0.remove((-1));
        boolean boolean12 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
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
        java.lang.Class<?> wildcardClass31 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
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
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
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
        binaryTree0.put((int) (short) 100);
        boolean boolean24 = binaryTree0.remove(100);
        boolean boolean26 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((-1));
        binaryTree0.put((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(1);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean20 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
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
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
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
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) -1);
        boolean boolean20 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
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
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 1);
        boolean boolean24 = binaryTree0.remove(1);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
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
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
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
        boolean boolean24 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) -1);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) '4');
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
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
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean26 = binaryTree0.remove((int) 'a');
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove((int) 'a');
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
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
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        boolean boolean16 = binaryTree0.remove(1);
        boolean boolean18 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) '#');
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
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
        boolean boolean24 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
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
        binaryTree0.put(1);
        boolean boolean28 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
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
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((-1));
        boolean boolean18 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 1);
        boolean boolean18 = binaryTree0.remove(10);
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 10);
        boolean boolean26 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
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
        binaryTree0.put((-1));
        binaryTree0.put((int) '#');
        boolean boolean32 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove(100);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put(100);
        binaryTree0.put(1);
        boolean boolean18 = binaryTree0.remove(1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
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
        boolean boolean20 = binaryTree0.remove((int) 'a');
        boolean boolean22 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove(100);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        boolean boolean20 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
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
        boolean boolean20 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(100);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        binaryTree0.put((int) '4');
        binaryTree0.put((int) 'a');
        binaryTree0.put(10);
        boolean boolean20 = binaryTree0.remove(10);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        boolean boolean24 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((-1));
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
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
        boolean boolean20 = binaryTree0.remove(100);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) 'a');
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
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
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
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
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
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
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) 'a');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove(10);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(0);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) ' ');
        binaryTree0.put(100);
        boolean boolean14 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
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
        boolean boolean22 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
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
        binaryTree0.put(100);
        boolean boolean28 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
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
        binaryTree0.put((int) (byte) 100);
        boolean boolean26 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
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
        boolean boolean24 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(10);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
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
        boolean boolean24 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
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
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '#');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove(100);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
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
        boolean boolean22 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
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
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        boolean boolean28 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
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
        binaryTree0.put((int) (short) 100);
        boolean boolean28 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put(10);
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(0);
        binaryTree0.put(1);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
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
        binaryTree0.put(0);
        boolean boolean24 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) 1);
        boolean boolean20 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
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
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
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
        binaryTree0.put((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(1);
        boolean boolean22 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
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
        binaryTree0.put((int) (byte) 100);
        boolean boolean22 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
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
        binaryTree0.put(1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
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
        boolean boolean20 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        boolean boolean18 = binaryTree0.remove(1);
        boolean boolean20 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(0);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
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
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean28 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put(1);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        boolean boolean16 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
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
        boolean boolean34 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(1);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove((int) (short) 100);
        boolean boolean10 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        boolean boolean8 = binaryTree0.remove((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove(1);
        boolean boolean16 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put(1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean20 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) '#');
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        boolean boolean18 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
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
        boolean boolean28 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(10);
        boolean boolean32 = binaryTree0.remove((int) (short) 1);
        java.lang.Class<?> wildcardClass33 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
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
        boolean boolean20 = binaryTree0.remove((int) ' ');
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(1);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
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
        binaryTree0.put(1);
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        boolean boolean6 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put(0);
        boolean boolean14 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
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
        boolean boolean22 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
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
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        boolean boolean20 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) '4');
        boolean boolean24 = binaryTree0.remove(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
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
        binaryTree0.put((int) 'a');
        boolean boolean26 = binaryTree0.remove((int) (short) -1);
        boolean boolean28 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
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
        binaryTree0.put((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove(1);
        boolean boolean18 = binaryTree0.remove(1);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
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
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
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
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put(1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 10);
        boolean boolean18 = binaryTree0.remove((-1));
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
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
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
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
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
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
        boolean boolean22 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 100);
        boolean boolean26 = binaryTree0.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) '#');
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
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
        boolean boolean34 = binaryTree0.remove(1);
        boolean boolean36 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(100);
        boolean boolean16 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove(10);
        boolean boolean14 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove(1);
        binaryTree0.put(1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) '#');
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (short) -1);
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
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
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
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
        boolean boolean30 = binaryTree0.remove((-1));
        boolean boolean32 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass33 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
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
        boolean boolean20 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
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
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) '#');
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        binaryTree0.put((int) ' ');
        boolean boolean12 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) -1);
        boolean boolean22 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 1);
        boolean boolean12 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(10);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '4');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) (byte) 0);
        boolean boolean20 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
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
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
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
        binaryTree0.put(0);
        boolean boolean22 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((-1));
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        boolean boolean20 = binaryTree0.remove((int) (byte) 100);
        boolean boolean22 = binaryTree0.remove(0);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
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
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
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
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
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
        boolean boolean26 = binaryTree0.remove((int) (short) -1);
        boolean boolean28 = binaryTree0.remove((int) '#');
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(100);
        boolean boolean8 = binaryTree0.remove((int) '#');
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
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
        boolean boolean24 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
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
        boolean boolean22 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
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
        binaryTree0.put((-1));
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
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
        binaryTree0.put((int) ' ');
        boolean boolean26 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 0);
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        boolean boolean10 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) '#');
        binaryTree0.put(1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(0);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean14 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
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
        boolean boolean22 = binaryTree0.remove((int) ' ');
        boolean boolean24 = binaryTree0.remove((int) ' ');
        boolean boolean26 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
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
        boolean boolean24 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
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
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(1);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (byte) 100);
        boolean boolean10 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
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
        boolean boolean20 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (short) 1);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
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
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        boolean boolean22 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove((int) 'a');
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(0);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
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
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        boolean boolean18 = binaryTree0.remove((int) 'a');
        binaryTree0.put(1);
        boolean boolean22 = binaryTree0.remove((-1));
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put(1);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove(10);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        boolean boolean12 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) 'a');
        binaryTree0.put(0);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
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
        binaryTree0.put(10);
        boolean boolean24 = binaryTree0.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) (short) 1);
        boolean boolean18 = binaryTree0.remove(10);
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) ' ');
        boolean boolean28 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
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
        binaryTree0.put((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
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
        binaryTree0.put((int) '4');
        boolean boolean26 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove((-1));
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) ' ');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) 1);
        boolean boolean18 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((-1));
        binaryTree0.put(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) '4');
        boolean boolean16 = binaryTree0.remove((int) ' ');
        boolean boolean18 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 100);
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
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
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(0);
        boolean boolean26 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
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
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) 'a');
        boolean boolean14 = binaryTree0.remove((int) (short) -1);
        boolean boolean16 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
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
        boolean boolean22 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((int) '#');
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
        boolean boolean22 = binaryTree0.remove(1);
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) '4');
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) '4');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        binaryTree0.put(100);
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
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
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
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
        binaryTree0.put((int) (short) -1);
        boolean boolean24 = binaryTree0.remove((int) (byte) 1);
        boolean boolean26 = binaryTree0.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        boolean boolean20 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
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
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
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
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put((int) '#');
        binaryTree0.put((-1));
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        boolean boolean18 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
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
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) '4');
        boolean boolean14 = binaryTree0.remove(0);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) '#');
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
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
        binaryTree0.put(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (short) 100);
        boolean boolean14 = binaryTree0.remove(100);
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) ' ');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
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
        boolean boolean20 = binaryTree0.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
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
        boolean boolean20 = binaryTree0.remove((int) '4');
        binaryTree0.put(10);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(1);
        boolean boolean8 = binaryTree0.remove(100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove(10);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
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
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
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
        boolean boolean22 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
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
        boolean boolean28 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
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
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((-1));
        binaryTree0.put((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) 'a');
        binaryTree0.put((int) (byte) -1);
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((-1));
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) 'a');
        boolean boolean14 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) 'a');
        binaryTree0.put((-1));
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean20 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
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
        binaryTree0.put((int) (short) -1);
        boolean boolean26 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(100);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        boolean boolean20 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) ' ');
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
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
        binaryTree0.put((int) (short) 100);
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put(0);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean8 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((-1));
        boolean boolean16 = binaryTree0.remove((int) '#');
        boolean boolean18 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
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
        boolean boolean28 = binaryTree0.remove((int) '4');
        boolean boolean30 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove(100);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        boolean boolean16 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
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
        boolean boolean20 = binaryTree0.remove((-1));
        boolean boolean22 = binaryTree0.remove(0);
        boolean boolean24 = binaryTree0.remove(10);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
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
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(0);
        boolean boolean24 = binaryTree0.remove((int) (short) 1);
        boolean boolean26 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove(1);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        boolean boolean8 = binaryTree0.remove((int) (short) -1);
        boolean boolean10 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(1);
        boolean boolean14 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(10);
        binaryTree0.put((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(10);
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        boolean boolean24 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(0);
        boolean boolean20 = binaryTree0.remove((int) (short) 0);
        boolean boolean22 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 1);
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 10);
        boolean boolean14 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove(100);
        java.lang.Class<?> wildcardClass9 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
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
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
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
        binaryTree0.put((int) ' ');
        boolean boolean22 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
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
        boolean boolean20 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put(100);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((-1));
        binaryTree0.put(0);
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
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
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        java.lang.Class<?> wildcardClass27 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) ' ');
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) 10);
        boolean boolean16 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(0);
        boolean boolean20 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
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
        boolean boolean22 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) -1);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 1);
        boolean boolean16 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put((int) 'a');
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
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
        boolean boolean20 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(10);
        binaryTree0.put((int) ' ');
        boolean boolean16 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(10);
        boolean boolean22 = binaryTree0.remove((int) (short) 100);
        boolean boolean24 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put(1);
        boolean boolean10 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove(1);
        boolean boolean18 = binaryTree0.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
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
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
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
        boolean boolean20 = binaryTree0.remove((int) '4');
        boolean boolean22 = binaryTree0.remove(100);
        boolean boolean24 = binaryTree0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put(0);
        binaryTree0.put(0);
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        boolean boolean8 = binaryTree0.remove(0);
        boolean boolean10 = binaryTree0.remove((int) 'a');
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) '4');
        boolean boolean16 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        boolean boolean10 = binaryTree0.remove((int) '#');
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        boolean boolean14 = binaryTree0.remove((int) (short) 100);
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        boolean boolean14 = binaryTree0.remove(1);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put(100);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((-1));
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) -1);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((-1));
        binaryTree0.put((-1));
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((int) (short) 1);
        boolean boolean20 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(0);
        binaryTree0.put(10);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
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
        binaryTree0.put((int) (byte) 10);
        boolean boolean26 = binaryTree0.remove((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        binaryTree0.put(0);
        binaryTree0.put((int) '#');
        boolean boolean12 = binaryTree0.remove((int) (short) 0);
        boolean boolean14 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 1);
        boolean boolean12 = binaryTree0.remove((int) '4');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((-1));
        boolean boolean18 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) 'a');
        boolean boolean12 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
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
        boolean boolean22 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass23 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove(100);
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put(0);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
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
        binaryTree0.put(0);
        binaryTree0.put((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 100);
        boolean boolean16 = binaryTree0.remove(0);
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put(10);
        binaryTree0.put(1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '4');
        binaryTree0.put((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) 'a');
        binaryTree0.put((int) '4');
        boolean boolean16 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) '4');
        boolean boolean18 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '4');
        binaryTree0.put(0);
        binaryTree0.put(1);
        boolean boolean12 = binaryTree0.remove((int) 'a');
        boolean boolean14 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((-1));
        boolean boolean8 = binaryTree0.remove(1);
        boolean boolean10 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        binaryTree0.put((int) '4');
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
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
        boolean boolean28 = binaryTree0.remove((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 0);
        boolean boolean16 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(0);
        binaryTree0.put((int) (byte) 0);
        binaryTree0.put((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        binaryTree0.put((int) 'a');
        binaryTree0.put(100);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (short) 0);
        binaryTree0.put((-1));
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
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
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(10);
        boolean boolean14 = binaryTree0.remove((-1));
        boolean boolean16 = binaryTree0.remove(0);
        boolean boolean18 = binaryTree0.remove(100);
        boolean boolean20 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
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
        boolean boolean28 = binaryTree0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) '4');
        binaryTree0.put(0);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
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
        boolean boolean26 = binaryTree0.remove((int) (short) -1);
        binaryTree0.put((int) '4');
        boolean boolean30 = binaryTree0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
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
        binaryTree0.put((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
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
        boolean boolean20 = binaryTree0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        boolean boolean6 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put((int) (short) 1);
        binaryTree0.put(1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        boolean boolean18 = binaryTree0.remove((int) '4');
        binaryTree0.put(10);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put(100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) '#');
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put((int) '4');
        boolean boolean14 = binaryTree0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((int) (short) 10);
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove(100);
        binaryTree0.put((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
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
        boolean boolean22 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(10);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
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
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
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
        boolean boolean22 = binaryTree0.remove((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (byte) 0);
        boolean boolean12 = binaryTree0.remove((int) ' ');
        boolean boolean14 = binaryTree0.remove((int) '#');
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        binaryTree0.put((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
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
        binaryTree0.put((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        binaryTree0.put(0);
        boolean boolean10 = binaryTree0.remove((int) (byte) 100);
        boolean boolean12 = binaryTree0.remove((int) '#');
        binaryTree0.put(0);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) '#');
        binaryTree0.put((int) '4');
        boolean boolean12 = binaryTree0.remove((-1));
        binaryTree0.put((int) (short) 100);
        binaryTree0.put(0);
        boolean boolean18 = binaryTree0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        binaryTree0.put((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (byte) 0);
        binaryTree0.put(1);
        boolean boolean14 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
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
        binaryTree0.put(100);
        java.lang.Class<?> wildcardClass21 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (short) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        boolean boolean12 = binaryTree0.remove(0);
        boolean boolean14 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put((int) (short) -1);
        boolean boolean12 = binaryTree0.remove((int) (short) 100);
        binaryTree0.put(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) '#');
        boolean boolean8 = binaryTree0.remove((int) (byte) 100);
        binaryTree0.put(10);
        boolean boolean12 = binaryTree0.remove((int) (byte) 10);
        binaryTree0.put(1);
        boolean boolean16 = binaryTree0.remove(10);
        binaryTree0.put(0);
        boolean boolean20 = binaryTree0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
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
        binaryTree0.put(0);
        binaryTree0.put((int) (short) 100);
        binaryTree0.put((int) (short) 0);
        java.lang.Class<?> wildcardClass25 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) (short) 0);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        binaryTree0.put((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
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
        binaryTree0.put((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((-1));
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) ' ');
        binaryTree0.put((int) (byte) 100);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) 'a');
        boolean boolean16 = binaryTree0.remove((int) (short) 0);
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
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
        boolean boolean26 = binaryTree0.remove((-1));
        boolean boolean28 = binaryTree0.remove((int) '4');
        java.lang.Class<?> wildcardClass29 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((-1));
        boolean boolean10 = binaryTree0.remove((int) '#');
        binaryTree0.put((int) (byte) 10);
        boolean boolean14 = binaryTree0.remove(10);
        boolean boolean16 = binaryTree0.remove((int) ' ');
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

