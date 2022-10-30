package trees;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.delete((int) (byte) 0);
        boolean boolean6 = aVLTree0.insert(1);
        boolean boolean8 = aVLTree0.search((int) (short) 100);
        boolean boolean10 = aVLTree0.search((int) (short) 10);
        aVLTree0.delete((int) '#');
        boolean boolean14 = aVLTree0.insert((int) ' ');
        boolean boolean16 = aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) '#');
        boolean boolean6 = aVLTree0.search((int) (short) -1);
        aVLTree0.delete((int) (byte) -1);
        boolean boolean10 = aVLTree0.search(0);
        boolean boolean12 = aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.printBalance();
        aVLTree0.delete((int) (byte) 100);
        boolean boolean9 = aVLTree0.search(0);
        boolean boolean11 = aVLTree0.insert((int) (byte) 1);
        aVLTree0.printBalance();
        boolean boolean14 = aVLTree0.search((int) (short) 0);
        aVLTree0.printBalance();
        boolean boolean17 = aVLTree0.search((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.printBalance();
        aVLTree0.delete(0);
        aVLTree0.delete((int) (short) 10);
        boolean boolean7 = aVLTree0.search((int) (byte) 0);
        boolean boolean9 = aVLTree0.insert(0);
        aVLTree0.delete((int) 'a');
        aVLTree0.printBalance();
        boolean boolean14 = aVLTree0.insert((int) (short) 0);
        boolean boolean16 = aVLTree0.search(10);
        boolean boolean18 = aVLTree0.search((int) 'a');
        boolean boolean20 = aVLTree0.search(10);
        boolean boolean22 = aVLTree0.insert(1);
        boolean boolean24 = aVLTree0.insert(0);
        aVLTree0.delete((-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) 'a');
        aVLTree0.delete((int) '#');
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.insert((int) (short) 0);
        aVLTree0.printBalance();
        boolean boolean9 = aVLTree0.insert((int) (short) 1);
        boolean boolean11 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean15 = aVLTree0.insert((int) (short) 10);
        boolean boolean17 = aVLTree0.insert((int) (byte) -1);
        boolean boolean19 = aVLTree0.search((-1));
        boolean boolean21 = aVLTree0.search(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.insert((int) (short) 0);
        boolean boolean8 = aVLTree0.insert((int) (byte) 0);
        boolean boolean10 = aVLTree0.search((int) (short) 100);
        boolean boolean12 = aVLTree0.insert((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        boolean boolean4 = aVLTree0.insert((int) (short) 1);
        aVLTree0.delete((int) (short) -1);
        boolean boolean8 = aVLTree0.search(1);
        aVLTree0.delete(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.insert((int) (short) 0);
        aVLTree0.printBalance();
        boolean boolean9 = aVLTree0.insert((int) (short) 1);
        aVLTree0.delete((int) (short) 100);
        boolean boolean13 = aVLTree0.insert((int) (byte) 10);
        boolean boolean15 = aVLTree0.search((int) '4');
        boolean boolean17 = aVLTree0.search(0);
        aVLTree0.delete((int) (short) -1);
        boolean boolean21 = aVLTree0.insert(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.insert((int) (short) 0);
        boolean boolean8 = aVLTree0.insert((int) (byte) 0);
        aVLTree0.printBalance();
        aVLTree0.delete((int) (short) -1);
        boolean boolean13 = aVLTree0.insert((int) (byte) 10);
        aVLTree0.printBalance();
        boolean boolean16 = aVLTree0.search(1);
        aVLTree0.printBalance();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.delete((int) (byte) 0);
        boolean boolean4 = aVLTree0.insert(100);
        boolean boolean6 = aVLTree0.insert(0);
        boolean boolean8 = aVLTree0.search((int) ' ');
        boolean boolean10 = aVLTree0.search(10);
        aVLTree0.delete(10);
        boolean boolean14 = aVLTree0.insert((int) (byte) 0);
        aVLTree0.delete((int) '4');
        boolean boolean18 = aVLTree0.search((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((int) 'a');
        aVLTree0.printBalance();
        boolean boolean5 = aVLTree0.insert(0);
        boolean boolean7 = aVLTree0.insert((int) '#');
        aVLTree0.printBalance();
        boolean boolean10 = aVLTree0.search(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.insert((int) (short) 0);
        aVLTree0.printBalance();
        boolean boolean9 = aVLTree0.insert(100);
        aVLTree0.printBalance();
        aVLTree0.delete((int) 'a');
        boolean boolean14 = aVLTree0.search((int) (short) -1);
        boolean boolean16 = aVLTree0.search((int) '4');
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.delete((int) (byte) 0);
        boolean boolean4 = aVLTree0.insert(100);
        boolean boolean6 = aVLTree0.search(1);
        aVLTree0.printBalance();
        aVLTree0.delete((int) ' ');
        boolean boolean11 = aVLTree0.search((int) ' ');
        aVLTree0.printBalance();
        aVLTree0.delete((int) ' ');
        aVLTree0.printBalance();
        boolean boolean17 = aVLTree0.insert((int) (short) -1);
        aVLTree0.printBalance();
        java.lang.Class<?> wildcardClass19 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.printBalance();
        boolean boolean7 = aVLTree0.search((int) (short) -1);
        boolean boolean9 = aVLTree0.insert(1);
        aVLTree0.delete((int) 'a');
        boolean boolean13 = aVLTree0.search(100);
        boolean boolean15 = aVLTree0.search((int) (byte) -1);
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.printBalance();
        aVLTree0.delete((int) '#');
        boolean boolean9 = aVLTree0.insert(0);
        boolean boolean11 = aVLTree0.search(0);
        aVLTree0.printBalance();
        boolean boolean14 = aVLTree0.search((int) (short) 0);
        boolean boolean16 = aVLTree0.search((int) (byte) 10);
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete((int) ' ');
        boolean boolean6 = aVLTree0.insert((int) '#');
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) ' ');
        boolean boolean12 = aVLTree0.insert((int) (short) -1);
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        boolean boolean4 = aVLTree0.insert((int) (short) 10);
        aVLTree0.printBalance();
        boolean boolean7 = aVLTree0.insert(100);
        boolean boolean9 = aVLTree0.search((int) (short) -1);
        aVLTree0.delete((int) ' ');
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.printBalance();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        boolean boolean4 = aVLTree0.insert((int) (short) 10);
        aVLTree0.printBalance();
        boolean boolean7 = aVLTree0.search((int) (short) 1);
        aVLTree0.delete((int) (short) 100);
        boolean boolean11 = aVLTree0.insert((int) (byte) 10);
        boolean boolean13 = aVLTree0.insert((int) (byte) 100);
        boolean boolean15 = aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean7 = aVLTree0.search((int) (byte) -1);
        boolean boolean9 = aVLTree0.insert((int) (short) 100);
        aVLTree0.delete((int) '#');
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        aVLTree0.delete(100);
        boolean boolean17 = aVLTree0.search(1);
        boolean boolean19 = aVLTree0.search((int) (short) 100);
        aVLTree0.delete((int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.delete((int) (byte) 0);
        boolean boolean4 = aVLTree0.search((int) 'a');
        boolean boolean6 = aVLTree0.insert((int) 'a');
        boolean boolean8 = aVLTree0.search(0);
        aVLTree0.printBalance();
        boolean boolean11 = aVLTree0.insert(0);
        boolean boolean13 = aVLTree0.insert((int) (byte) 100);
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        aVLTree0.delete((int) '4');
        boolean boolean20 = aVLTree0.insert(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.printBalance();
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) 0);
        boolean boolean11 = aVLTree0.search((int) (byte) 0);
        aVLTree0.printBalance();
        aVLTree0.delete((int) (short) 100);
        aVLTree0.printBalance();
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.delete((int) (byte) 0);
        boolean boolean6 = aVLTree0.search((int) (byte) 100);
        boolean boolean8 = aVLTree0.search(100);
        aVLTree0.printBalance();
        boolean boolean11 = aVLTree0.insert((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.insert((int) (short) 0);
        aVLTree0.printBalance();
        boolean boolean9 = aVLTree0.insert((int) (byte) 0);
        boolean boolean11 = aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) 'a');
        boolean boolean17 = aVLTree0.search((int) ' ');
        boolean boolean19 = aVLTree0.insert((int) (short) 100);
        aVLTree0.delete(10);
        aVLTree0.printBalance();
        aVLTree0.delete(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        boolean boolean5 = aVLTree0.search((-1));
        boolean boolean7 = aVLTree0.search(100);
        boolean boolean9 = aVLTree0.insert((int) (short) 100);
        boolean boolean11 = aVLTree0.search((int) (short) 0);
        boolean boolean13 = aVLTree0.search((int) (byte) -1);
        aVLTree0.printBalance();
        boolean boolean16 = aVLTree0.search((int) (byte) 10);
        aVLTree0.delete((int) (short) 1);
        boolean boolean20 = aVLTree0.search(0);
        java.lang.Class<?> wildcardClass21 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        boolean boolean5 = aVLTree0.search((-1));
        boolean boolean7 = aVLTree0.search(100);
        boolean boolean9 = aVLTree0.insert((int) (short) 100);
        boolean boolean11 = aVLTree0.search((int) (short) 0);
        boolean boolean13 = aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete((int) (short) 0);
        boolean boolean17 = aVLTree0.search((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.delete((int) (byte) 0);
        boolean boolean6 = aVLTree0.search((int) (byte) 100);
        boolean boolean8 = aVLTree0.search(100);
        aVLTree0.printBalance();
        boolean boolean11 = aVLTree0.search(0);
        boolean boolean13 = aVLTree0.search((int) (short) 10);
        boolean boolean15 = aVLTree0.search((int) (byte) 10);
        aVLTree0.printBalance();
        boolean boolean18 = aVLTree0.insert((int) '#');
        boolean boolean20 = aVLTree0.search((int) (short) 10);
        aVLTree0.delete((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.insert((int) (short) 0);
        boolean boolean8 = aVLTree0.insert((int) (byte) 0);
        aVLTree0.printBalance();
        boolean boolean11 = aVLTree0.search(100);
        aVLTree0.delete(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        boolean boolean4 = aVLTree0.insert((int) (short) 1);
        aVLTree0.delete(100);
        boolean boolean8 = aVLTree0.search(1);
        boolean boolean10 = aVLTree0.search((int) 'a');
        boolean boolean12 = aVLTree0.insert((int) (short) -1);
        aVLTree0.printBalance();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        boolean boolean4 = aVLTree0.insert((int) (short) 0);
        aVLTree0.delete((-1));
        aVLTree0.delete((-1));
        boolean boolean10 = aVLTree0.search(0);
        boolean boolean12 = aVLTree0.insert(0);
        aVLTree0.delete((int) '4');
        boolean boolean16 = aVLTree0.search((int) 'a');
        boolean boolean18 = aVLTree0.insert((int) (short) 100);
        boolean boolean20 = aVLTree0.search((int) (byte) 10);
        aVLTree0.printBalance();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.insert((int) (short) 0);
        aVLTree0.printBalance();
        boolean boolean9 = aVLTree0.search((int) (byte) -1);
        boolean boolean11 = aVLTree0.search(0);
        aVLTree0.printBalance();
        boolean boolean14 = aVLTree0.search(1);
        boolean boolean16 = aVLTree0.search((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) (short) 10);
        aVLTree0.printBalance();
        aVLTree0.delete(0);
        aVLTree0.delete(0);
        boolean boolean11 = aVLTree0.insert((int) '4');
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) (short) 0);
        boolean boolean8 = aVLTree0.insert((int) (byte) 100);
        aVLTree0.printBalance();
        boolean boolean11 = aVLTree0.search(10);
        aVLTree0.delete(1);
        aVLTree0.delete((int) (byte) 10);
        boolean boolean17 = aVLTree0.search((int) (short) 10);
        aVLTree0.printBalance();
        aVLTree0.delete(0);
        aVLTree0.printBalance();
        aVLTree0.delete((int) (short) 1);
        boolean boolean25 = aVLTree0.search((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.insert((int) 'a');
        boolean boolean4 = aVLTree0.insert(1);
        boolean boolean6 = aVLTree0.search((int) (short) 100);
        aVLTree0.delete((int) '4');
        aVLTree0.printBalance();
        aVLTree0.delete(10);
        boolean boolean13 = aVLTree0.search((int) '4');
        boolean boolean15 = aVLTree0.search((int) (byte) 1);
        boolean boolean17 = aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        boolean boolean5 = aVLTree0.search((int) (short) -1);
        boolean boolean7 = aVLTree0.insert((int) (short) -1);
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean11 = aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete((int) ' ');
        boolean boolean15 = aVLTree0.search(0);
        boolean boolean17 = aVLTree0.search((int) (short) 1);
        boolean boolean19 = aVLTree0.search(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        boolean boolean5 = aVLTree0.search((-1));
        boolean boolean7 = aVLTree0.search(100);
        boolean boolean9 = aVLTree0.insert((int) (short) 100);
        boolean boolean11 = aVLTree0.search((int) (short) 0);
        boolean boolean13 = aVLTree0.search((-1));
        aVLTree0.delete((int) (short) 0);
        boolean boolean17 = aVLTree0.search((int) (short) 0);
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean22 = aVLTree0.insert(10);
        boolean boolean24 = aVLTree0.insert(0);
        aVLTree0.printBalance();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.printBalance();
        aVLTree0.delete(0);
        boolean boolean5 = aVLTree0.insert((int) 'a');
        boolean boolean7 = aVLTree0.insert((int) (byte) 100);
        boolean boolean9 = aVLTree0.search((int) 'a');
        aVLTree0.printBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.insert((int) 'a');
        boolean boolean4 = aVLTree0.search((int) (byte) 1);
        boolean boolean6 = aVLTree0.search((int) ' ');
        boolean boolean8 = aVLTree0.insert((int) (short) -1);
        boolean boolean10 = aVLTree0.search((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.printBalance();
        aVLTree0.delete(0);
        aVLTree0.delete((int) (short) 10);
        boolean boolean7 = aVLTree0.search((int) (short) 0);
        boolean boolean9 = aVLTree0.insert((-1));
        boolean boolean11 = aVLTree0.insert((int) '4');
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.printBalance();
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.printBalance();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.printBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        boolean boolean4 = aVLTree0.insert((int) (short) 10);
        aVLTree0.printBalance();
        boolean boolean7 = aVLTree0.insert(100);
        boolean boolean9 = aVLTree0.insert(10);
        boolean boolean11 = aVLTree0.search(100);
        aVLTree0.printBalance();
        boolean boolean14 = aVLTree0.search((int) '4');
        aVLTree0.delete((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        boolean boolean4 = aVLTree0.insert((int) (short) 0);
        aVLTree0.delete((int) (short) 0);
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) (byte) 100);
        boolean boolean12 = aVLTree0.insert((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.delete((int) (byte) 0);
        boolean boolean6 = aVLTree0.search((int) (byte) 100);
        boolean boolean8 = aVLTree0.search(100);
        aVLTree0.printBalance();
        boolean boolean11 = aVLTree0.search(0);
        boolean boolean13 = aVLTree0.search((int) (short) 10);
        aVLTree0.delete((int) (short) 0);
        boolean boolean17 = aVLTree0.insert((int) (byte) 1);
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (short) 10);
        aVLTree0.printBalance();
        aVLTree0.delete(1);
        boolean boolean28 = aVLTree0.insert((int) ' ');
        java.lang.Class<?> wildcardClass29 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.delete((int) (byte) 0);
        boolean boolean4 = aVLTree0.search((int) 'a');
        boolean boolean6 = aVLTree0.insert((int) 'a');
        boolean boolean8 = aVLTree0.search(0);
        aVLTree0.printBalance();
        boolean boolean11 = aVLTree0.insert(0);
        boolean boolean13 = aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) (byte) -1);
        boolean boolean17 = aVLTree0.insert(100);
        boolean boolean19 = aVLTree0.insert((int) (byte) 0);
        aVLTree0.delete(10);
        boolean boolean23 = aVLTree0.insert(10);
        aVLTree0.printBalance();
        boolean boolean26 = aVLTree0.search((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        boolean boolean4 = aVLTree0.insert((int) (short) 0);
        aVLTree0.printBalance();
        boolean boolean7 = aVLTree0.insert(0);
        boolean boolean9 = aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        boolean boolean4 = aVLTree0.insert((int) '4');
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete(0);
        boolean boolean10 = aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete(0);
        aVLTree0.delete((-1));
        boolean boolean16 = aVLTree0.search(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.search((int) (byte) 10);
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean10 = aVLTree0.search((int) (short) 1);
        boolean boolean12 = aVLTree0.insert((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.insert((int) 'a');
        boolean boolean4 = aVLTree0.insert(1);
        boolean boolean6 = aVLTree0.search((int) (short) 100);
        aVLTree0.delete((int) '4');
        aVLTree0.printBalance();
        boolean boolean11 = aVLTree0.search((int) (byte) -1);
        aVLTree0.printBalance();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.printBalance();
        boolean boolean3 = aVLTree0.insert((int) (short) 0);
        aVLTree0.delete((int) '4');
        boolean boolean7 = aVLTree0.search((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.delete((int) (byte) 0);
        boolean boolean6 = aVLTree0.search((int) (byte) 100);
        boolean boolean8 = aVLTree0.search(100);
        aVLTree0.printBalance();
        aVLTree0.delete((int) (short) -1);
        boolean boolean13 = aVLTree0.search((int) (short) 100);
        boolean boolean15 = aVLTree0.insert((int) (short) 0);
        boolean boolean17 = aVLTree0.search((int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.delete((int) (byte) 0);
        boolean boolean6 = aVLTree0.insert((int) '4');
        boolean boolean8 = aVLTree0.insert(10);
        aVLTree0.delete(1);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        boolean boolean5 = aVLTree0.search((-1));
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.printBalance();
        aVLTree0.delete(0);
        boolean boolean12 = aVLTree0.insert((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.delete((int) (byte) 0);
        boolean boolean4 = aVLTree0.insert(100);
        boolean boolean6 = aVLTree0.search(1);
        aVLTree0.printBalance();
        boolean boolean9 = aVLTree0.insert((int) (short) 100);
        boolean boolean11 = aVLTree0.insert((int) (byte) -1);
        aVLTree0.printBalance();
        boolean boolean14 = aVLTree0.insert(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((int) 'a');
        aVLTree0.printBalance();
        boolean boolean5 = aVLTree0.insert(0);
        boolean boolean7 = aVLTree0.insert((int) '#');
        boolean boolean9 = aVLTree0.search((-1));
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((int) 'a');
        aVLTree0.printBalance();
        boolean boolean5 = aVLTree0.insert(0);
        boolean boolean7 = aVLTree0.insert((int) '#');
        aVLTree0.delete((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.printBalance();
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) 0);
        boolean boolean11 = aVLTree0.search((int) (byte) 0);
        aVLTree0.printBalance();
        aVLTree0.delete((int) (short) 100);
        boolean boolean16 = aVLTree0.insert((int) '#');
        boolean boolean18 = aVLTree0.insert((int) (byte) 0);
        boolean boolean20 = aVLTree0.search((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.delete((int) (byte) 0);
        boolean boolean6 = aVLTree0.search(10);
        aVLTree0.delete((int) (byte) 100);
        boolean boolean10 = aVLTree0.insert((int) (short) -1);
        aVLTree0.printBalance();
        boolean boolean13 = aVLTree0.search((int) (short) 100);
        boolean boolean15 = aVLTree0.insert(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.delete((int) (byte) 100);
        boolean boolean4 = aVLTree0.search(0);
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((-1));
        aVLTree0.printBalance();
        aVLTree0.delete((int) ' ');
        aVLTree0.delete((int) (short) 100);
        boolean boolean15 = aVLTree0.search((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        boolean boolean4 = aVLTree0.insert((int) (short) 10);
        aVLTree0.printBalance();
        boolean boolean7 = aVLTree0.insert(100);
        boolean boolean9 = aVLTree0.search((int) (short) -1);
        aVLTree0.delete((int) ' ');
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.insert((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.printBalance();
        aVLTree0.delete(10);
        aVLTree0.printBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.insert((int) (short) 0);
        boolean boolean8 = aVLTree0.search((-1));
        boolean boolean10 = aVLTree0.search(100);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete(1);
        boolean boolean16 = aVLTree0.insert((-1));
        java.lang.Class<?> wildcardClass17 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.printBalance();
        aVLTree0.delete(0);
        aVLTree0.delete((int) (short) 10);
        boolean boolean7 = aVLTree0.search((int) (byte) 10);
        boolean boolean9 = aVLTree0.insert((int) (short) 1);
        aVLTree0.printBalance();
        boolean boolean12 = aVLTree0.insert((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        boolean boolean4 = aVLTree0.insert((int) (short) 0);
        boolean boolean6 = aVLTree0.search(10);
        boolean boolean8 = aVLTree0.search((int) (byte) -1);
        aVLTree0.delete((int) 'a');
        aVLTree0.delete((-1));
        boolean boolean14 = aVLTree0.insert(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.printBalance();
        aVLTree0.delete(0);
        boolean boolean5 = aVLTree0.insert((int) 'a');
        boolean boolean7 = aVLTree0.insert((int) (byte) 100);
        boolean boolean9 = aVLTree0.insert((int) (short) -1);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        boolean boolean6 = aVLTree0.insert((int) (short) 0);
        boolean boolean8 = aVLTree0.insert((int) (byte) 0);
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) (byte) -1);
        boolean boolean14 = aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        boolean boolean4 = aVLTree0.insert((int) (short) 0);
        boolean boolean6 = aVLTree0.insert(10);
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) (short) 10);
        aVLTree0.delete((int) 'a');
        boolean boolean14 = aVLTree0.insert((int) (short) 10);
        aVLTree0.printBalance();
        boolean boolean17 = aVLTree0.insert((int) ' ');
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.printBalance();
        aVLTree0.printBalance();
        aVLTree0.delete((int) (byte) 1);
        boolean boolean6 = aVLTree0.search((int) (short) -1);
        boolean boolean8 = aVLTree0.insert((int) (short) 0);
        boolean boolean10 = aVLTree0.insert((int) (byte) 10);
        boolean boolean12 = aVLTree0.search((int) (short) 10);
        boolean boolean14 = aVLTree0.search(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        boolean boolean2 = aVLTree0.search((-1));
        boolean boolean4 = aVLTree0.insert((int) (short) 10);
        aVLTree0.printBalance();
        boolean boolean7 = aVLTree0.search((int) (short) 1);
        boolean boolean9 = aVLTree0.search((int) (short) 0);
        aVLTree0.printBalance();
        boolean boolean12 = aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.thealgorithms.datastructures.trees.AVLTree aVLTree0 = new com.thealgorithms.datastructures.trees.AVLTree();
        aVLTree0.delete((int) (byte) 0);
        boolean boolean4 = aVLTree0.insert(100);
        boolean boolean6 = aVLTree0.search((int) 'a');
        boolean boolean8 = aVLTree0.insert((int) (short) 100);
        boolean boolean10 = aVLTree0.search(10);
        boolean boolean12 = aVLTree0.insert(100);
        boolean boolean14 = aVLTree0.insert((int) (short) 100);
        boolean boolean16 = aVLTree0.search((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}

