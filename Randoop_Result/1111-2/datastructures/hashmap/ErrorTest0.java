package datastructures.hashmap;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        java.lang.String str8 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        java.lang.String str8 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (byte) 10);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        linkedList0.insert((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((-1));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean9 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 100);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.insertHash((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) 'a');
        boolean boolean14 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((-1));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        java.lang.String str9 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        java.lang.String str5 = linkedList0.display();
        linkedList0.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(51);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        java.lang.String str12 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) '4');
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 100);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(10);
        linkedList0.insert((int) (short) 100);
        java.lang.String str15 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) (byte) 0);
        int int7 = hashMap1.hashing((int) ' ');
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (byte) 10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        linkedList0.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        java.lang.String str12 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '#');
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        linkedList0.insert(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert(100);
        boolean boolean9 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(10);
        linkedList0.insert((int) (short) 100);
        java.lang.String str15 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(100);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        linkedList0.insert((int) (byte) 100);
        boolean boolean13 = linkedList0.isEmpty();
        linkedList0.insert(51);
        java.lang.String str16 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((-1));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.deleteHash(1);
        hashMap1.displayHashtable();
        hashMap1.deleteHash((int) (byte) 0);
        hashMap1.insertHash(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        java.lang.String str3 = linkedList0.display();
        linkedList0.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.deleteHash(1);
        hashMap1.insertHash(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(100);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '#');
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        linkedList0.insert(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 100);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        boolean boolean14 = linkedList0.isEmpty();
        java.lang.String str15 = linkedList0.display();
        boolean boolean16 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        java.lang.String str8 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        boolean boolean3 = linkedList0.isEmpty();
        boolean boolean4 = linkedList0.isEmpty();
        linkedList0.insert(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 100);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.insert(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete((int) (short) 0);
        linkedList0.insert((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(52);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 100);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert(100);
        linkedList0.insert(100);
        boolean boolean11 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(51);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(19);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (byte) -1);
        int int6 = hashMap1.hashing((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(32);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 100);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete(10);
        linkedList0.delete((int) (byte) 0);
        linkedList0.insert(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '4');
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) 'a');
        java.lang.String str14 = linkedList0.display();
        linkedList0.insert((int) (byte) 100);
        boolean boolean17 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        hashMap1.insertHash((int) (short) 10);
        int int7 = hashMap1.hashing((int) '#');
        int int9 = hashMap1.hashing((int) '4');
        hashMap1.insertHash(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(100);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        linkedList0.insert(0);
        boolean boolean9 = linkedList0.isEmpty();
        boolean boolean10 = linkedList0.isEmpty();
        java.lang.String str11 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 100);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        int int7 = hashMap1.hashing((int) (short) -1);
        int int9 = hashMap1.hashing(1);
        hashMap1.deleteHash((int) (short) 10);
        hashMap1.insertHash((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(19);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete(10);
        linkedList0.delete((int) (byte) 0);
        linkedList0.insert(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 10);
        boolean boolean14 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        boolean boolean14 = linkedList0.isEmpty();
        java.lang.String str15 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(19);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) '#');
        java.lang.String str11 = linkedList0.display();
        boolean boolean12 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(32);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        hashMap1.insertHash((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (byte) -1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(100);
        linkedList0.insert((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        linkedList0.insert((int) (byte) 100);
        boolean boolean13 = linkedList0.isEmpty();
        linkedList0.insert(51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.insertHash((int) (short) 0);
        int int5 = hashMap1.hashing((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(32);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        java.lang.String str15 = linkedList0.display();
        boolean boolean16 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((-1));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(2);
        java.lang.String str13 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(10);
        java.lang.String str10 = linkedList0.display();
        java.lang.String str11 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((-1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        boolean boolean8 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        java.lang.String str5 = linkedList0.display();
        linkedList0.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete(10);
        linkedList0.insert((-1));
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) '4');
        boolean boolean17 = linkedList0.isEmpty();
        linkedList0.insert((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(32);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.delete((int) (short) 1);
        boolean boolean8 = linkedList0.isEmpty();
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(52);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        java.lang.String str8 = linkedList0.display();
        boolean boolean9 = linkedList0.isEmpty();
        boolean boolean10 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(100);
        linkedList0.insert((int) (short) 1);
        boolean boolean18 = linkedList0.isEmpty();
        linkedList0.insert(5);
        java.lang.String str21 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(48);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        linkedList0.delete(51);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert(48);
        java.lang.String str14 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(35);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete((-1));
        linkedList0.insert((int) (short) 100);
        java.lang.String str13 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) 'a');
        boolean boolean13 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 10);
        hashMap1.insertHash(5);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.insertHash((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(35);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        boolean boolean12 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(52);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(48);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 10);
        java.lang.String str14 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(99);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.deleteHash(0);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) ' ');
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete(10);
        linkedList0.insert((-1));
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        linkedList0.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.insertHash(0);
        hashMap1.insertHash(19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(52);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        linkedList0.insert(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(10);
        java.lang.String str10 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.insert(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete((int) (short) 0);
        linkedList0.insert((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '#');
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        boolean boolean8 = linkedList0.isEmpty();
        boolean boolean9 = linkedList0.isEmpty();
        boolean boolean10 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        linkedList0.delete(51);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert(48);
        java.lang.String str14 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey(5);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(51);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.deleteHash(0);
        hashMap1.insertHash((int) (byte) 10);
        hashMap1.deleteHash((int) '#');
        hashMap1.insertHash((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(35);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        boolean boolean12 = linkedList0.isEmpty();
        linkedList0.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(48);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        int int7 = hashMap1.hashing((int) (short) -1);
        int int9 = hashMap1.hashing(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (short) 10);
        hashMap1.insertHash(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) '4');
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(52);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (short) 10);
        boolean boolean5 = linkedList0.isEmpty();
        java.lang.String str6 = linkedList0.display();
        linkedList0.insert((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (byte) 10);
        java.lang.String str13 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        boolean boolean16 = linkedList0.isEmpty();
        linkedList0.insert(9);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node20 = linkedList0.findKey(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 10);
        boolean boolean14 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        java.lang.String str8 = linkedList0.display();
        java.lang.String str9 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.deleteHash(1);
        hashMap1.displayHashtable();
        hashMap1.deleteHash((int) (byte) 0);
        hashMap1.insertHash(100);
        hashMap1.insertHash((-1));
        int int14 = hashMap1.hashing(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        java.lang.String str16 = linkedList0.display();
        java.lang.String str17 = linkedList0.display();
        java.lang.String str18 = linkedList0.display();
        linkedList0.insert((-1));
        linkedList0.insert(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '#');
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        linkedList0.insert(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((-1));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(48);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey(0);
        linkedList0.insert(0);
        java.lang.String str10 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(17);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        java.lang.String str8 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '4');
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 10);
        java.lang.String str14 = linkedList0.display();
        linkedList0.insert(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (short) 10);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(51);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        java.lang.String str16 = linkedList0.display();
        java.lang.String str17 = linkedList0.display();
        java.lang.String str18 = linkedList0.display();
        linkedList0.insert(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(48);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        java.lang.String str16 = linkedList0.display();
        java.lang.String str17 = linkedList0.display();
        java.lang.String str18 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(17);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        java.lang.String str12 = linkedList0.display();
        linkedList0.delete(32);
        java.lang.String str15 = linkedList0.display();
        linkedList0.delete(8);
        linkedList0.insert(0);
        java.lang.String str20 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (byte) 100);
        hashMap1.deleteHash((int) '#');
        hashMap1.insertHash(9);
        int int9 = hashMap1.hashing((int) (short) 0);
        hashMap1.insertHash((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 100);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        linkedList0.delete(51);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert(48);
        java.lang.String str14 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(16);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.insertHash(0);
        int int7 = hashMap1.hashing(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(19);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (byte) 1);
        int int6 = hashMap1.hashing(48);
        hashMap1.insertHash(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        linkedList0.insert((int) ' ');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        boolean boolean16 = linkedList0.isEmpty();
        linkedList0.insert(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(19);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) 'a');
        linkedList0.insert((int) '4');
        boolean boolean15 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(97);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        boolean boolean16 = linkedList0.isEmpty();
        linkedList0.insert(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(17);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        java.lang.String str9 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(51);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey(0);
        linkedList0.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(10);
        java.lang.String str10 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) -1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        linkedList0.insert((int) (byte) 100);
        boolean boolean13 = linkedList0.isEmpty();
        linkedList0.insert(51);
        java.lang.String str16 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        boolean boolean1 = linkedList0.isEmpty();
        linkedList0.delete((int) (byte) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node5 = linkedList0.findKey(10);
        linkedList0.insert(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(27);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        linkedList0.insert((int) (byte) 100);
        boolean boolean13 = linkedList0.isEmpty();
        linkedList0.insert(51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(99);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) 'a');
        boolean boolean13 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        boolean boolean14 = linkedList0.isEmpty();
        java.lang.String str15 = linkedList0.display();
        linkedList0.insert(52);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node19 = linkedList0.findKey(35);
        java.lang.String str20 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        linkedList0.insert(10);
        java.lang.String str14 = linkedList0.display();
        linkedList0.insert(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) '#');
        java.lang.String str11 = linkedList0.display();
        boolean boolean12 = linkedList0.isEmpty();
        boolean boolean13 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(17);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 10);
        linkedList0.insert((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        int int7 = hashMap1.hashing((int) (short) -1);
        int int9 = hashMap1.hashing(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(17);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(10);
        linkedList0.insert((int) (short) 100);
        java.lang.String str15 = linkedList0.display();
        linkedList0.insert(0);
        linkedList0.delete((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        linkedList0.insert((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(100);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(100);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (short) -1);
        hashMap1.displayHashtable();
        int int9 = hashMap1.hashing(9);
        hashMap1.insertHash((int) (byte) 0);
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(100);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        hashMap1.insertHash((int) (short) 10);
        int int7 = hashMap1.hashing((int) '#');
        int int9 = hashMap1.hashing((int) '4');
        hashMap1.insertHash(35);
        int int13 = hashMap1.hashing(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) 'a');
        linkedList0.insert((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        linkedList0.insert(51);
        linkedList0.insert(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(35);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        linkedList0.insert((int) ' ');
        java.lang.String str14 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        boolean boolean1 = linkedList0.isEmpty();
        linkedList0.delete((int) (byte) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node5 = linkedList0.findKey(10);
        linkedList0.insert(48);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '4');
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        java.lang.String str8 = linkedList0.display();
        linkedList0.insert(0);
        linkedList0.insert(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 10);
        java.lang.String str14 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(99);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) 1);
        java.lang.String str13 = linkedList0.display();
        linkedList0.insert((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        linkedList0.insert(10);
        java.lang.String str14 = linkedList0.display();
        java.lang.String str15 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        java.lang.String str15 = linkedList0.display();
        boolean boolean16 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(2);
        boolean boolean19 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '4');
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) '#');
        java.lang.String str11 = linkedList0.display();
        boolean boolean12 = linkedList0.isEmpty();
        boolean boolean13 = linkedList0.isEmpty();
        boolean boolean14 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 10);
        boolean boolean14 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 1);
        boolean boolean17 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node19 = linkedList0.findKey((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.insertHash((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(20);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.insertHash(19);
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(32);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 10);
        linkedList0.insert((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.deleteHash(0);
        hashMap1.insertHash((int) (byte) 10);
        hashMap1.deleteHash((int) '#');
        hashMap1.deleteHash(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 100);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        linkedList0.insert(1);
        java.lang.String str11 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete((int) (short) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (byte) 10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey(9);
        linkedList0.insert((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(30);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete(10);
        linkedList0.delete((int) (byte) 0);
        linkedList0.insert(2);
        java.lang.String str17 = linkedList0.display();
        java.lang.String str18 = linkedList0.display();
        boolean boolean19 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) -1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 10);
        java.lang.String str14 = linkedList0.display();
        linkedList0.insert(8);
        boolean boolean17 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        boolean boolean16 = linkedList0.isEmpty();
        linkedList0.insert(9);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node20 = linkedList0.findKey(0);
        boolean boolean21 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey((int) (short) 0);
        linkedList0.insert(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 10);
        boolean boolean14 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 10);
        linkedList0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '#');
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(99);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(35);
        linkedList0.insert((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        linkedList0.delete(51);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert(48);
        java.lang.String str14 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        java.lang.String str6 = linkedList0.display();
        linkedList0.delete(19);
        java.lang.String str9 = linkedList0.display();
        linkedList0.insert((int) '4');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(51);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        boolean boolean3 = linkedList0.isEmpty();
        java.lang.String str4 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        linkedList0.insert(0);
        java.lang.String str9 = linkedList0.display();
        linkedList0.insert(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) (byte) 0);
        hashMap1.insertHash(0);
        int int9 = hashMap1.hashing((int) '#');
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(30);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.deleteHash(0);
        hashMap1.displayHashtable();
        hashMap1.deleteHash((int) (short) 1);
        hashMap1.insertHash((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        linkedList0.delete(51);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert(48);
        java.lang.String str14 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey(5);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        java.lang.String str12 = linkedList0.display();
        linkedList0.delete(32);
        java.lang.String str15 = linkedList0.display();
        boolean boolean16 = linkedList0.isEmpty();
        java.lang.String str17 = linkedList0.display();
        linkedList0.insert((int) 'a');
        java.lang.String str20 = linkedList0.display();
        java.lang.String str21 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) 'a');
        boolean boolean14 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(32);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        hashMap1.insertHash((int) (short) 10);
        int int7 = hashMap1.hashing((int) '#');
        hashMap1.displayHashtable();
        int int10 = hashMap1.hashing(51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(27);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (short) -1);
        hashMap1.displayHashtable();
        int int9 = hashMap1.hashing(9);
        hashMap1.insertHash((int) (byte) 0);
        hashMap1.displayHashtable();
        int int14 = hashMap1.hashing((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(99);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        java.lang.String str16 = linkedList0.display();
        java.lang.String str17 = linkedList0.display();
        java.lang.String str18 = linkedList0.display();
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node22 = linkedList0.findKey(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.deleteHash(1);
        hashMap1.insertHash((int) (short) -1);
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(100);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(52);
        linkedList0.insert(51);
        boolean boolean14 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(100);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.insert((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey(9);
        boolean boolean9 = linkedList0.isEmpty();
        boolean boolean10 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete((-1));
        linkedList0.insert((int) (short) 100);
        java.lang.String str13 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        hashMap1.insertHash(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (byte) 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.insertHash(99);
        hashMap1.insertHash(19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(9);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey((int) (short) 1);
        java.lang.String str16 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        boolean boolean16 = linkedList0.isEmpty();
        linkedList0.insert(9);
        linkedList0.delete((int) (short) 100);
        boolean boolean21 = linkedList0.isEmpty();
        java.lang.String str22 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.delete((int) (short) 1);
        boolean boolean8 = linkedList0.isEmpty();
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(51);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) '#');
        hashMap1.insertHash(9);
        hashMap1.displayHashtable();
        int int6 = hashMap1.hashing(0);
        hashMap1.deleteHash(5);
        hashMap1.insertHash((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) '#');
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        boolean boolean16 = linkedList0.isEmpty();
        linkedList0.insert(9);
        linkedList0.delete((int) (short) 100);
        boolean boolean21 = linkedList0.isEmpty();
        java.lang.String str22 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        linkedList0.insert((int) (byte) 100);
        boolean boolean13 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 10);
        boolean boolean14 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(2);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(7);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(10);
        java.lang.String str10 = linkedList0.display();
        java.lang.String str11 = linkedList0.display();
        java.lang.String str12 = linkedList0.display();
        linkedList0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(51);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (short) 10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        boolean boolean7 = linkedList0.isEmpty();
        java.lang.String str8 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(52);
        boolean boolean12 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean13 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        java.lang.String str15 = linkedList0.display();
        boolean boolean16 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(2);
        linkedList0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        java.lang.String str8 = linkedList0.display();
        boolean boolean9 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(52);
        linkedList0.insert(51);
        boolean boolean14 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(19);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.insert(2);
        linkedList0.insert(19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) -1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        linkedList0.delete(51);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert(48);
        java.lang.String str14 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.deleteHash(0);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) '4');
        hashMap1.insertHash((int) (byte) 1);
        int int12 = hashMap1.hashing(100);
        int int14 = hashMap1.hashing(52);
        int int16 = hashMap1.hashing(9);
        hashMap1.insertHash(1);
        hashMap1.insertHash(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(32);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (short) 1);
        boolean boolean9 = linkedList0.isEmpty();
        java.lang.String str10 = linkedList0.display();
        linkedList0.insert(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(35);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        java.lang.String str15 = linkedList0.display();
        boolean boolean16 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(2);
        linkedList0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(16);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        int int7 = hashMap1.hashing((int) (short) -1);
        int int9 = hashMap1.hashing(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (short) 10);
        hashMap1.insertHash(0);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (short) 10);
        java.lang.String str5 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '#');
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (short) 10);
        boolean boolean5 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        boolean boolean1 = linkedList0.isEmpty();
        linkedList0.delete((int) (byte) 100);
        linkedList0.delete((int) ' ');
        boolean boolean6 = linkedList0.isEmpty();
        boolean boolean7 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 100);
        java.lang.String str10 = linkedList0.display();
        linkedList0.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(32);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        boolean boolean8 = linkedList0.isEmpty();
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) '4');
        java.lang.String str12 = linkedList0.display();
        linkedList0.insert(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey(0);
        linkedList0.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete((-1));
        linkedList0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.deleteHash(0);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        int int7 = hashMap1.hashing(100);
        hashMap1.deleteHash((int) (byte) 0);
        hashMap1.insertHash((int) (byte) 10);
        int int13 = hashMap1.hashing((int) '4');
        hashMap1.displayHashtable();
        hashMap1.insertHash(20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(2);
        hashMap1.displayHashtable();
        hashMap1.insertHash(4);
        hashMap1.deleteHash(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(32);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        boolean boolean1 = linkedList0.isEmpty();
        linkedList0.delete((int) (byte) 100);
        linkedList0.delete((int) ' ');
        boolean boolean6 = linkedList0.isEmpty();
        java.lang.String str7 = linkedList0.display();
        linkedList0.insert(19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(34);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (short) 1);
        java.lang.String str9 = linkedList0.display();
        linkedList0.insert(32);
        linkedList0.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        boolean boolean8 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(10);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.insertHash((-1));
        hashMap1.insertHash(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert(100);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) '#');
        boolean boolean13 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(97);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(52);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 10);
        java.lang.String str14 = linkedList0.display();
        linkedList0.insert(8);
        java.lang.String str17 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) 'a');
        boolean boolean14 = linkedList0.isEmpty();
        boolean boolean15 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey(48);
        linkedList0.insert(19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) -1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(100);
        int int3 = hashMap1.hashing((int) (byte) 0);
        hashMap1.displayHashtable();
        int int6 = hashMap1.hashing(48);
        hashMap1.insertHash(1);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.insertHash((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 100);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        java.lang.String str8 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(17);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) 100);
        java.lang.String str13 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 10);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 100);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.delete((int) (short) 1);
        java.lang.String str8 = linkedList0.display();
        linkedList0.insert(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(2);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash(35);
        hashMap1.insertHash(27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(34);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        boolean boolean1 = linkedList0.isEmpty();
        linkedList0.delete((int) (byte) 100);
        linkedList0.delete((int) ' ');
        boolean boolean6 = linkedList0.isEmpty();
        java.lang.String str7 = linkedList0.display();
        linkedList0.insert(19);
        java.lang.String str10 = linkedList0.display();
        java.lang.String str11 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(12);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete((int) (short) 0);
        linkedList0.insert((int) (byte) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(17);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        linkedList0.insert(2);
        linkedList0.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(19);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 10);
        linkedList0.insert((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(20);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        linkedList0.delete((-1));
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(19);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (byte) 100);
        hashMap1.deleteHash((int) '#');
        hashMap1.insertHash(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(2);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        java.lang.String str6 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        java.lang.String str10 = linkedList0.display();
        linkedList0.insert(2);
        linkedList0.insert((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(10);
        linkedList0.insert((int) (short) 100);
        java.lang.String str15 = linkedList0.display();
        linkedList0.insert(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete(10);
        linkedList0.delete((int) '4');
        java.lang.String str13 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(32);
        linkedList0.insert(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(4);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 0);
        java.lang.String str16 = linkedList0.display();
        java.lang.String str17 = linkedList0.display();
        java.lang.String str18 = linkedList0.display();
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node22 = linkedList0.findKey(5);
        boolean boolean23 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.insertHash((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(9);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.delete((int) (short) 1);
        boolean boolean8 = linkedList0.isEmpty();
        linkedList0.insert(100);
        boolean boolean11 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (byte) 10);
        linkedList0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(34);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.insertHash(0);
        int int7 = hashMap1.hashing(10);
        int int9 = hashMap1.hashing(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(12);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(0);
        java.lang.String str12 = linkedList0.display();
        java.lang.String str13 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }
}

