package trees;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = binaryTree0.remove((int) (short) -1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = binaryTree0.remove((int) (byte) 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = binaryTree0.remove(1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = binaryTree0.remove((int) (short) 100);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove((int) (short) 1);
        boolean boolean8 = binaryTree0.remove((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = binaryTree0.remove((int) 'a');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = binaryTree0.remove(0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = binaryTree0.remove((int) '4');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = binaryTree0.remove((int) (short) 100);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) '#');
        boolean boolean4 = binaryTree0.remove(0);
        binaryTree0.put((int) 'a');
        boolean boolean8 = binaryTree0.remove((int) 'a');
        boolean boolean10 = binaryTree0.remove((int) (byte) 1);
        boolean boolean12 = binaryTree0.remove((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = binaryTree0.remove((int) ' ');
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = binaryTree0.remove((int) (byte) 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        binaryTree0.put(10);
        binaryTree0.put((int) (short) -1);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        boolean boolean10 = binaryTree0.remove((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = binaryTree0.remove((int) '4');
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = binaryTree0.remove((int) (short) -1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        boolean boolean22 = binaryTree0.remove((int) (short) -1);
        boolean boolean24 = binaryTree0.remove((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = binaryTree0.remove((int) (short) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove((int) '#');
        boolean boolean8 = binaryTree0.remove(10);
        boolean boolean10 = binaryTree0.remove(0);
        binaryTree0.put((int) (byte) 1);
        boolean boolean14 = binaryTree0.remove((int) (byte) -1);
        boolean boolean16 = binaryTree0.remove((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = binaryTree0.remove(0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) -1);
        boolean boolean6 = binaryTree0.remove((int) (short) 10);
        boolean boolean8 = binaryTree0.remove((-1));
        boolean boolean10 = binaryTree0.remove((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = binaryTree0.remove((int) '4');
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) ' ');
        boolean boolean4 = binaryTree0.remove((int) (short) -1);
        boolean boolean6 = binaryTree0.remove((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = binaryTree0.remove((int) '#');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) (short) 10);
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) -1);
        binaryTree0.put(1);
        boolean boolean12 = binaryTree0.remove((int) (short) 1);
        boolean boolean14 = binaryTree0.remove((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = binaryTree0.remove(0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (short) -1);
        boolean boolean4 = binaryTree0.remove((int) '#');
        boolean boolean6 = binaryTree0.remove(0);
        boolean boolean8 = binaryTree0.remove((int) (byte) 10);
        boolean boolean10 = binaryTree0.remove((int) (short) 0);
        boolean boolean12 = binaryTree0.remove((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = binaryTree0.remove((int) '4');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.thealgorithms.datastructures.trees.BinaryTree binaryTree0 = new com.thealgorithms.datastructures.trees.BinaryTree();
        binaryTree0.put((int) (byte) -1);
        binaryTree0.put((int) ' ');
        boolean boolean6 = binaryTree0.remove(100);
        binaryTree0.put((int) '4');
        boolean boolean10 = binaryTree0.remove((int) (short) 10);
        binaryTree0.put((-1));
        boolean boolean14 = binaryTree0.remove((int) (byte) 10);
        boolean boolean16 = binaryTree0.remove((-1));
        boolean boolean18 = binaryTree0.remove((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = binaryTree0.remove(100);
    }
}

