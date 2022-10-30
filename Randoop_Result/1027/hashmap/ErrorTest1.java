package hashmap;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        java.lang.String str10 = linkedList0.display();
        linkedList0.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(45);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.delete((int) (short) 1);
        java.lang.String str8 = linkedList0.display();
        linkedList0.delete(51);
        linkedList0.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey(0);
        boolean boolean8 = linkedList0.isEmpty();
        linkedList0.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(97);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
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
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '4');
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(2);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) (byte) 0);
        int int7 = hashMap1.hashing((int) ' ');
        hashMap1.insertHash((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(10);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.deleteHash(0);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) '4');
        hashMap1.insertHash((int) (byte) 1);
        int int12 = hashMap1.hashing(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(12);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert(19);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) (short) 10);
        java.lang.String str17 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(20);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        boolean boolean3 = linkedList0.isEmpty();
        linkedList0.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(7);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        java.lang.String str3 = linkedList0.display();
        linkedList0.insert(0);
        java.lang.String str6 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '4');
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        java.lang.String str8 = linkedList0.display();
        linkedList0.insert(0);
        linkedList0.insert(1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(35);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(99);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(7);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        hashMap1.insertHash((int) (short) 10);
        int int7 = hashMap1.hashing((int) '#');
        int int9 = hashMap1.hashing((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 1);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        linkedList0.insert(10);
        boolean boolean14 = linkedList0.isEmpty();
        linkedList0.insert(17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) 'a');
        java.lang.String str14 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) (short) 100);
        linkedList0.insert((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(2);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        boolean boolean15 = linkedList0.isEmpty();
        java.lang.String str16 = linkedList0.display();
        linkedList0.insert(51);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node20 = linkedList0.findKey((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
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
        linkedList0.insert((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        boolean boolean3 = linkedList0.isEmpty();
        linkedList0.delete((int) (short) 10);
        linkedList0.insert(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '#');
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey((int) (byte) 100);
        java.lang.String str12 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(20);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        boolean boolean8 = linkedList0.isEmpty();
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) '4');
        linkedList0.insert((-1));
        boolean boolean14 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(4);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
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
        java.lang.String str17 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        java.lang.String str9 = linkedList0.display();
        java.lang.String str10 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey((int) (short) 10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey(47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(3);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (short) -1);
        hashMap1.deleteHash((int) '4');
        hashMap1.insertHash((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(5);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete(10);
        linkedList0.delete((int) '4');
        java.lang.String str13 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(32);
        linkedList0.insert(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.insertHash((-1));
        int int9 = hashMap1.hashing((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(10);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        linkedList0.delete((-1));
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey(10);
        linkedList0.delete((int) '#');
        linkedList0.insert(16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
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
        java.lang.String str17 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(13);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
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
        java.lang.String str17 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(3);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        int int7 = hashMap1.hashing((int) (short) -1);
        int int9 = hashMap1.hashing(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash(100);
        int int14 = hashMap1.hashing(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(0);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) '4');
        hashMap1.insertHash((-1));
        hashMap1.insertHash((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int9 = hashMap1.hashing((int) (byte) -1);
        hashMap1.displayHashtable();
        int int12 = hashMap1.hashing(0);
        hashMap1.insertHash((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(51);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
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
        linkedList0.insert(16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        boolean boolean8 = linkedList0.isEmpty();
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) '4');
        linkedList0.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        boolean boolean8 = linkedList0.isEmpty();
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) '4');
        linkedList0.insert((-1));
        linkedList0.insert(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 100);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        java.lang.String str6 = linkedList0.display();
        linkedList0.delete(19);
        java.lang.String str9 = linkedList0.display();
        linkedList0.delete((int) (byte) 100);
        boolean boolean12 = linkedList0.isEmpty();
        boolean boolean13 = linkedList0.isEmpty();
        linkedList0.insert(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        boolean boolean1 = linkedList0.isEmpty();
        linkedList0.delete((int) (byte) 100);
        linkedList0.delete((int) ' ');
        boolean boolean6 = linkedList0.isEmpty();
        java.lang.String str7 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey((int) (byte) 10);
        linkedList0.insert(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
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
        linkedList0.insert(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 10);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
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
        linkedList0.delete(100);
        linkedList0.insert(27);
        java.lang.String str21 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(35);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) 1);
        java.lang.String str13 = linkedList0.display();
        linkedList0.insert((int) '4');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey(1);
        linkedList0.insert(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(27);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) (byte) 0);
        int int7 = hashMap1.hashing((int) (short) -1);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (byte) 10);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
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
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert(100);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) '#');
        boolean boolean13 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(10);
        linkedList0.insert((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(48);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        hashMap1.insertHash((int) (short) 10);
        int int7 = hashMap1.hashing((int) '#');
        int int9 = hashMap1.hashing((int) '4');
        hashMap1.insertHash(10);
        hashMap1.insertHash(27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) ' ');
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
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
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.delete((int) (short) 1);
        boolean boolean8 = linkedList0.isEmpty();
        linkedList0.insert(99);
        linkedList0.insert(1);
        linkedList0.insert(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 100);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        linkedList0.insert((int) (byte) 100);
        boolean boolean13 = linkedList0.isEmpty();
        linkedList0.insert(51);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey((int) 'a');
        linkedList0.insert(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 10);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        boolean boolean1 = linkedList0.isEmpty();
        linkedList0.delete((int) (byte) 100);
        linkedList0.delete((int) ' ');
        boolean boolean6 = linkedList0.isEmpty();
        java.lang.String str7 = linkedList0.display();
        linkedList0.insert(19);
        linkedList0.insert((int) (short) 1);
        linkedList0.delete((int) (short) 1);
        linkedList0.insert(1);
        linkedList0.insert((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node19 = linkedList0.findKey((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        int int7 = hashMap1.hashing((int) (short) -1);
        int int9 = hashMap1.hashing((int) 'a');
        hashMap1.deleteHash((int) 'a');
        hashMap1.insertHash(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(30);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
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
        java.lang.String str16 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(48);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        java.lang.String str8 = linkedList0.display();
        linkedList0.insert(0);
        java.lang.String str11 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(32);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
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
        linkedList0.delete(32);
        boolean boolean17 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node21 = linkedList0.findKey(47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        linkedList0.delete(51);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((-1));
        java.lang.String str14 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey(12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(45);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (byte) 100);
        hashMap1.insertHash(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (byte) -1);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
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
        boolean boolean19 = linkedList0.isEmpty();
        linkedList0.insert(0);
        linkedList0.delete(0);
        java.lang.String str24 = linkedList0.display();
        java.lang.String str25 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(10);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
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
        linkedList0.insert((int) (short) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node21 = linkedList0.findKey(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(12);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
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
        linkedList0.insert(16);
        java.lang.String str17 = linkedList0.display();
        boolean boolean18 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(3);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        linkedList0.insert(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(52);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
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
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
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
        boolean boolean18 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node20 = linkedList0.findKey((int) (short) -1);
        boolean boolean21 = linkedList0.isEmpty();
        java.lang.String str22 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(7);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
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
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete(10);
        linkedList0.delete(9);
        linkedList0.delete((int) '4');
        boolean boolean17 = linkedList0.isEmpty();
        linkedList0.delete(0);
        linkedList0.delete(19);
        linkedList0.insert(0);
        linkedList0.insert(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
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
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey((int) (short) -1);
        linkedList0.insert((int) (byte) 1);
        linkedList0.insert(4);
        java.lang.String str19 = linkedList0.display();
        linkedList0.insert(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 10);
        boolean boolean14 = linkedList0.isEmpty();
        java.lang.String str15 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.insertHash(20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (byte) 0);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        linkedList0.delete(51);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(35);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey(0);
        linkedList0.insert(0);
        java.lang.String str10 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
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
        linkedList0.insert(19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '4');
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(5);
        boolean boolean16 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(99);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
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
        linkedList0.delete(27);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        java.lang.String str3 = linkedList0.display();
        linkedList0.insert(0);
        linkedList0.insert((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 100);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (byte) 10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey(8);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(100);
        boolean boolean16 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node20 = linkedList0.findKey(0);
        linkedList0.insert(34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(100);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        boolean boolean15 = linkedList0.isEmpty();
        java.lang.String str16 = linkedList0.display();
        java.lang.String str17 = linkedList0.display();
        java.lang.String str18 = linkedList0.display();
        boolean boolean19 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(52);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        java.lang.String str5 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey(52);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(47);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(7);
        linkedList0.insert(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(4);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
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
        linkedList0.delete(5);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(6);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        linkedList0.insert(1);
        boolean boolean11 = linkedList0.isEmpty();
        boolean boolean12 = linkedList0.isEmpty();
        linkedList0.insert((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(20);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.insert(2);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert((int) (short) 0);
        linkedList0.insert((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(16);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        java.lang.String str8 = linkedList0.display();
        linkedList0.insert(0);
        linkedList0.insert(1);
        linkedList0.insert((int) ' ');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey(52);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(17);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
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
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node19 = linkedList0.findKey(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '4');
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        boolean boolean8 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) -1);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) 'a');
        boolean boolean13 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(17);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
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
        java.lang.String str17 = linkedList0.display();
        linkedList0.insert((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        java.lang.String str3 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node5 = linkedList0.findKey((int) (short) 100);
        linkedList0.insert(8);
        linkedList0.insert(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey(0);
        linkedList0.insert(0);
        java.lang.String str10 = linkedList0.display();
        java.lang.String str11 = linkedList0.display();
        boolean boolean12 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey((int) (short) 1);
        boolean boolean15 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 10);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        java.lang.String str9 = linkedList0.display();
        linkedList0.delete((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey(32);
        linkedList0.insert(2);
        linkedList0.insert(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '4');
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        linkedList0.insert(0);
        boolean boolean9 = linkedList0.isEmpty();
        boolean boolean10 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) (byte) 0);
        int int7 = hashMap1.hashing((int) ' ');
        hashMap1.displayHashtable();
        int int10 = hashMap1.hashing(1);
        hashMap1.deleteHash((int) '4');
        int int14 = hashMap1.hashing(32);
        hashMap1.insertHash(16);
        int int18 = hashMap1.hashing(17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(100);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
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
        linkedList0.delete(12);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        boolean boolean8 = linkedList0.isEmpty();
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) '4');
        boolean boolean12 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey(27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
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
        java.lang.String str21 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        boolean boolean8 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '#');
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 0);
        linkedList0.insert(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(97);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(52);
        linkedList0.insert(51);
        boolean boolean14 = linkedList0.isEmpty();
        linkedList0.insert(32);
        java.lang.String str17 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node19 = linkedList0.findKey(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(17);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) 'a');
        java.lang.String str14 = linkedList0.display();
        boolean boolean15 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(27);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.displayHashtable();
        int int6 = hashMap1.hashing(35);
        hashMap1.insertHash(0);
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(100);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(52);
        linkedList0.insert(51);
        linkedList0.insert((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(27);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        linkedList0.insert(10);
        linkedList0.insert((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey(51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 100);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        java.lang.String str9 = linkedList0.display();
        java.lang.String str10 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(0);
        boolean boolean13 = linkedList0.isEmpty();
        java.lang.String str14 = linkedList0.display();
        java.lang.String str15 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(12);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (short) 10);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        boolean boolean7 = linkedList0.isEmpty();
        java.lang.String str8 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete(10);
        linkedList0.insert((-1));
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) '4');
        java.lang.String str17 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node19 = linkedList0.findKey(6);
        linkedList0.insert(51);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node23 = linkedList0.findKey(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(7);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash(35);
        hashMap1.insertHash(99);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 1);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
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
        java.lang.String str17 = linkedList0.display();
        java.lang.String str18 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(7);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert(100);
        boolean boolean9 = linkedList0.isEmpty();
        boolean boolean10 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 1);
        hashMap1.deleteHash(0);
        hashMap1.insertHash(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(48);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
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
        java.lang.String str17 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(100);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.insertHash(0);
        hashMap1.insertHash(19);
        int int11 = hashMap1.hashing(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) 'a');
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(19);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        int int7 = hashMap1.hashing((int) (short) -1);
        int int9 = hashMap1.hashing((int) 'a');
        hashMap1.deleteHash((int) 'a');
        hashMap1.insertHash(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(0);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(7);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.insert((int) (short) -1);
        boolean boolean7 = linkedList0.isEmpty();
        boolean boolean8 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 100);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.insertHash(0);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) '#');
        hashMap1.insertHash(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) 'a');
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
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
        linkedList0.delete(12);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        boolean boolean15 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.insert(2);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(0);
        java.lang.String str14 = linkedList0.display();
        java.lang.String str15 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(16);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        java.lang.String str6 = linkedList0.display();
        linkedList0.delete(19);
        linkedList0.insert((int) (short) -1);
        boolean boolean11 = linkedList0.isEmpty();
        java.lang.String str12 = linkedList0.display();
        linkedList0.insert(51);
        java.lang.String str15 = linkedList0.display();
        boolean boolean16 = linkedList0.isEmpty();
        boolean boolean17 = linkedList0.isEmpty();
        java.lang.String str18 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(97);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
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
        java.lang.String str18 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(97);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        linkedList0.insert(1);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey(1);
        linkedList0.insert(97);
        linkedList0.insert((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete(10);
        linkedList0.delete((int) '4');
        java.lang.String str13 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(32);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node19 = linkedList0.findKey(3);
        linkedList0.insert(99);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '#');
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.deleteHash(1);
        hashMap1.insertHash((int) (short) -1);
        hashMap1.displayHashtable();
        int int10 = hashMap1.hashing(32);
        hashMap1.insertHash(4);
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(100);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
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
        linkedList0.insert(0);
        linkedList0.insert(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(3);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(5);
        boolean boolean16 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(5);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete(10);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(3);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
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
        boolean boolean18 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node20 = linkedList0.findKey((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
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
        java.lang.String str17 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(99);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete(10);
        linkedList0.delete(9);
        linkedList0.delete((int) '4');
        linkedList0.delete((int) '#');
        boolean boolean19 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(13);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(100);
        boolean boolean16 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node20 = linkedList0.findKey(0);
        linkedList0.insert(34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        java.lang.String str9 = linkedList0.display();
        java.lang.String str10 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(0);
        java.lang.String str13 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(5);
        boolean boolean16 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(10);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.deleteHash(0);
        hashMap1.insertHash((int) (byte) 10);
        hashMap1.deleteHash((int) '#');
        hashMap1.deleteHash(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (byte) 100);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        int int7 = hashMap1.hashing((int) (short) -1);
        int int9 = hashMap1.hashing(8);
        hashMap1.insertHash((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(34);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
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
        linkedList0.delete(17);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (byte) -1);
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(0);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.delete((int) (short) 1);
        boolean boolean8 = linkedList0.isEmpty();
        linkedList0.insert(99);
        java.lang.String str11 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(52);
        linkedList0.insert(51);
        boolean boolean14 = linkedList0.isEmpty();
        linkedList0.insert(32);
        java.lang.String str17 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (byte) 100);
        int int9 = hashMap1.hashing(4);
        hashMap1.insertHash((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(16);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.delete((int) (short) 1);
        boolean boolean8 = linkedList0.isEmpty();
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert(0);
        java.lang.String str12 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(52);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(97);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
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
        linkedList0.insert(27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(10);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean13 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(52);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(35);
        linkedList0.insert((int) (short) 0);
        linkedList0.insert((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(2);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) 'a');
        boolean boolean13 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(6);
        java.lang.String str16 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(7);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey((int) (short) 0);
        linkedList0.insert(35);
        boolean boolean10 = linkedList0.isEmpty();
        boolean boolean11 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(51);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey(0);
        boolean boolean14 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey(1);
        linkedList0.insert((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete((-1));
        linkedList0.insert((int) (short) 100);
        linkedList0.insert((int) (byte) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((-1));
        linkedList0.insert((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(3);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert(100);
        linkedList0.insert((int) (short) 10);
        linkedList0.insert(97);
        linkedList0.delete((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(3);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete(10);
        linkedList0.insert((int) (byte) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey(20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert(100);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 10);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.insertHash(19);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(32);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 100);
        java.lang.String str9 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(99);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
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
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash(35);
        hashMap1.insertHash(99);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) 'a');
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        linkedList0.insert((int) (byte) 100);
        boolean boolean13 = linkedList0.isEmpty();
        linkedList0.insert(51);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey(8);
        linkedList0.insert(51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) -1);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(10);
        linkedList0.insert((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(99);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey((int) (short) 0);
        linkedList0.insert(35);
        boolean boolean10 = linkedList0.isEmpty();
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(32);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) (byte) 0);
        int int7 = hashMap1.hashing((int) ' ');
        hashMap1.insertHash((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(51);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.deleteHash((int) 'a');
        hashMap1.displayHashtable();
        hashMap1.deleteHash((int) (short) 10);
        hashMap1.insertHash(1);
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(100);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 10);
        boolean boolean14 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        int int7 = hashMap1.hashing((int) (short) -1);
        int int9 = hashMap1.hashing(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (short) 10);
        hashMap1.insertHash((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 0);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 100);
        java.lang.String str9 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(99);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(45);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 10);
        boolean boolean14 = linkedList0.isEmpty();
        java.lang.String str15 = linkedList0.display();
        linkedList0.insert(27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(52);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 10);
        linkedList0.insert((-1));
        boolean boolean16 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete((-1));
        linkedList0.insert((int) (short) 100);
        linkedList0.insert((int) (byte) 0);
        java.lang.String str15 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert(19);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey(97);
        linkedList0.insert(99);
        linkedList0.insert(2);
        java.lang.String str21 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(34);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        boolean boolean8 = linkedList0.isEmpty();
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert(10);
        linkedList0.delete((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.insertHash(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) ' ');
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.deleteHash(1);
        hashMap1.insertHash((int) (short) -1);
        hashMap1.deleteHash((int) '#');
        hashMap1.insertHash(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 10);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 10);
        linkedList0.insert((-1));
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey(1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node19 = linkedList0.findKey(45);
        linkedList0.insert(5);
        java.lang.String str22 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(4);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        boolean boolean1 = linkedList0.isEmpty();
        linkedList0.delete((int) (byte) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node5 = linkedList0.findKey(10);
        linkedList0.delete(6);
        linkedList0.insert(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(27);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(52);
        linkedList0.insert(51);
        java.lang.String str14 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(13);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (short) 1);
        java.lang.String str9 = linkedList0.display();
        linkedList0.delete((int) ' ');
        linkedList0.insert(7);
        boolean boolean14 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((-1));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        java.lang.String str5 = linkedList0.display();
        linkedList0.delete((int) (byte) 10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(2);
        java.lang.String str10 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(51);
        linkedList0.insert((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(13);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (byte) 100);
        hashMap1.deleteHash((int) '#');
        hashMap1.insertHash((int) (byte) 0);
        int int9 = hashMap1.hashing((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(6);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        java.lang.String str9 = linkedList0.display();
        java.lang.String str10 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(0);
        boolean boolean13 = linkedList0.isEmpty();
        java.lang.String str14 = linkedList0.display();
        boolean boolean15 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(19);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.deleteHash(1);
        hashMap1.displayHashtable();
        hashMap1.deleteHash((int) (byte) 0);
        hashMap1.displayHashtable();
        hashMap1.insertHash(32);
        hashMap1.insertHash(20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(52);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert(100);
        linkedList0.insert(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(47);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (short) 1);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert(51);
        boolean boolean12 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        java.lang.String str3 = linkedList0.display();
        linkedList0.insert((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(48);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) 'a');
        java.lang.String str14 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) (short) 100);
        linkedList0.insert((int) '#');
        linkedList0.insert(16);
        linkedList0.delete((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(30);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        java.lang.String str5 = linkedList0.display();
        linkedList0.insert((int) (byte) 100);
        boolean boolean8 = linkedList0.isEmpty();
        java.lang.String str9 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) (byte) 0);
        int int7 = hashMap1.hashing((int) ' ');
        int int9 = hashMap1.hashing(35);
        hashMap1.insertHash((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 100);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 0);
        linkedList0.insert(7);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node20 = linkedList0.findKey(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(20);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        boolean boolean3 = linkedList0.isEmpty();
        java.lang.String str4 = linkedList0.display();
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.insertHash(0);
        int int7 = hashMap1.hashing(10);
        int int9 = hashMap1.hashing(9);
        hashMap1.insertHash((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(34);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
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
        linkedList0.delete(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(52);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey((int) (short) -1);
        linkedList0.insert((int) (byte) 1);
        linkedList0.insert(4);
        java.lang.String str19 = linkedList0.display();
        linkedList0.insert(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(99);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey((int) (byte) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(16);
        linkedList0.insert((int) 'a');
        linkedList0.insert(3);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node21 = linkedList0.findKey((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 0);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        linkedList0.insert(51);
        linkedList0.insert(10);
        boolean boolean13 = linkedList0.isEmpty();
        boolean boolean14 = linkedList0.isEmpty();
        linkedList0.insert(1);
        java.lang.String str17 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 100);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        int int7 = hashMap1.hashing((int) (short) -1);
        int int9 = hashMap1.hashing(1);
        hashMap1.deleteHash((int) (short) 10);
        hashMap1.deleteHash((int) (byte) 0);
        hashMap1.deleteHash(5);
        hashMap1.insertHash(8);
        hashMap1.displayHashtable();
        hashMap1.insertHash(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (byte) 10);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
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
        java.lang.String str17 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
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
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node21 = linkedList0.findKey((int) (byte) -1);
        java.lang.String str22 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey(0);
        boolean boolean8 = linkedList0.isEmpty();
        linkedList0.insert(0);
        linkedList0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(97);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey((int) (short) -1);
        linkedList0.insert((int) (byte) 1);
        linkedList0.insert(4);
        java.lang.String str19 = linkedList0.display();
        java.lang.String str20 = linkedList0.display();
        java.lang.String str21 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '4');
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.delete((int) (short) 1);
        boolean boolean8 = linkedList0.isEmpty();
        linkedList0.insert(99);
        linkedList0.insert(1);
        java.lang.String str13 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) '#');
        java.lang.String str11 = linkedList0.display();
        boolean boolean12 = linkedList0.isEmpty();
        boolean boolean13 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey((int) ' ');
        boolean boolean16 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(16);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        boolean boolean3 = linkedList0.isEmpty();
        boolean boolean4 = linkedList0.isEmpty();
        linkedList0.insert(10);
        linkedList0.insert(17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(32);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.insertHash((-1));
        hashMap1.insertHash(97);
        hashMap1.insertHash(2);
        int int13 = hashMap1.hashing(31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(3);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
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
        java.lang.String str19 = linkedList0.display();
        java.lang.String str20 = linkedList0.display();
        boolean boolean21 = linkedList0.isEmpty();
        linkedList0.insert(51);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node25 = linkedList0.findKey(2);
        boolean boolean26 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node28 = linkedList0.findKey(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) -1);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (short) 0);
        hashMap1.displayHashtable();
        int int7 = hashMap1.hashing(1);
        int int9 = hashMap1.hashing(17);
        hashMap1.deleteHash(97);
        int int13 = hashMap1.hashing((int) '4');
        hashMap1.insertHash(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(35);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(9);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.deleteHash(0);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        int int7 = hashMap1.hashing(100);
        hashMap1.displayHashtable();
        hashMap1.insertHash(1);
        hashMap1.insertHash(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(0);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete(10);
        linkedList0.delete((int) '4');
        linkedList0.delete(0);
        linkedList0.insert((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(3);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) 100);
        linkedList0.insert(4);
        boolean boolean15 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey((int) (byte) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node19 = linkedList0.findKey(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 10);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.deleteHash(1);
        hashMap1.insertHash((int) (short) -1);
        hashMap1.displayHashtable();
        int int10 = hashMap1.hashing(32);
        hashMap1.insertHash((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(20);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
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
        boolean boolean19 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(99);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.deleteHash(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash(0);
        hashMap1.insertHash((int) (byte) 1);
        hashMap1.insertHash(2);
        int int14 = hashMap1.hashing((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 100);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 100);
        java.lang.String str9 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(0);
        boolean boolean12 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(35);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        java.lang.String str8 = linkedList0.display();
        java.lang.String str9 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.deleteHash(0);
        hashMap1.deleteHash((int) (byte) -1);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.deleteHash(7);
        hashMap1.deleteHash(52);
        hashMap1.insertHash((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(99);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 10);
        java.lang.String str14 = linkedList0.display();
        java.lang.String str15 = linkedList0.display();
        linkedList0.insert(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (byte) -1);
        int int6 = hashMap1.hashing(19);
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (byte) 10);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean13 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '4');
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey((int) (byte) 1);
        linkedList0.insert(52);
        java.lang.String str14 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        boolean boolean11 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey(35);
        linkedList0.delete(16);
        linkedList0.insert(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(17);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (byte) 10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey(8);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(10);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        linkedList0.insert(10);
        linkedList0.insert((int) (byte) 1);
        java.lang.String str16 = linkedList0.display();
        boolean boolean17 = linkedList0.isEmpty();
        boolean boolean18 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey(20);
        java.lang.String str14 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(100);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        hashMap1.insertHash((int) (short) 10);
        int int7 = hashMap1.hashing(32);
        int int9 = hashMap1.hashing((int) (short) 10);
        hashMap1.insertHash(31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(99);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete(10);
        linkedList0.delete((int) (byte) 0);
        linkedList0.insert(2);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(19);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.delete(10);
        linkedList0.delete((int) '4');
        java.lang.String str13 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(32);
        linkedList0.insert(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node19 = linkedList0.findKey(19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(10);
        java.lang.String str10 = linkedList0.display();
        java.lang.String str11 = linkedList0.display();
        java.lang.String str12 = linkedList0.display();
        java.lang.String str13 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
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
        linkedList0.delete(32);
        boolean boolean17 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node21 = linkedList0.findKey(47);
        java.lang.String str22 = linkedList0.display();
        linkedList0.insert(17);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node26 = linkedList0.findKey((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(6);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert(0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 10);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.deleteHash(0);
        hashMap1.insertHash((int) (byte) 10);
        hashMap1.deleteHash((int) '#');
        hashMap1.deleteHash(5);
        hashMap1.deleteHash((int) (byte) 1);
        int int13 = hashMap1.hashing((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (byte) 100);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        java.lang.String str8 = linkedList0.display();
        boolean boolean9 = linkedList0.isEmpty();
        boolean boolean10 = linkedList0.isEmpty();
        linkedList0.insert((-1));
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey(27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 1);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (byte) -1);
        int int6 = hashMap1.hashing(19);
        hashMap1.insertHash(19);
        int int10 = hashMap1.hashing((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(51);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        java.lang.String str9 = linkedList0.display();
        boolean boolean10 = linkedList0.isEmpty();
        linkedList0.delete((int) (short) 0);
        linkedList0.insert((int) (short) -1);
        linkedList0.insert(97);
        linkedList0.insert((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) ' ');
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
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
        linkedList0.delete(8);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        java.lang.String str9 = linkedList0.display();
        linkedList0.insert((int) (byte) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey(100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (byte) 100);
        hashMap1.deleteHash((int) (short) 100);
        hashMap1.insertHash(99);
        int int9 = hashMap1.hashing((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(10);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        java.lang.String str8 = linkedList0.display();
        linkedList0.insert(35);
        linkedList0.insert(0);
        java.lang.String str13 = linkedList0.display();
        java.lang.String str14 = linkedList0.display();
        java.lang.String str15 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(9);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        java.lang.String str6 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(9);
        linkedList0.insert(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(35);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(10);
        java.lang.String str10 = linkedList0.display();
        linkedList0.insert(99);
        java.lang.String str13 = linkedList0.display();
        boolean boolean14 = linkedList0.isEmpty();
        boolean boolean15 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(7);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
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
        boolean boolean21 = linkedList0.isEmpty();
        boolean boolean22 = linkedList0.isEmpty();
        linkedList0.insert(97);
        boolean boolean25 = linkedList0.isEmpty();
        boolean boolean26 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(51);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete(10);
        linkedList0.delete((int) (byte) 0);
        linkedList0.insert(2);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(48);
        boolean boolean19 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(32);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        java.lang.String str5 = linkedList0.display();
        linkedList0.insert((int) (byte) 100);
        java.lang.String str8 = linkedList0.display();
        boolean boolean9 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(19);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (byte) 100);
        hashMap1.deleteHash((int) '#');
        hashMap1.insertHash(9);
        int int9 = hashMap1.hashing((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(3);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        int int5 = hashMap1.hashing((int) (byte) 100);
        hashMap1.insertHash(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) 'a');
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        linkedList0.delete((-1));
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        linkedList0.insert(19);
        linkedList0.insert(13);
        boolean boolean12 = linkedList0.isEmpty();
        boolean boolean13 = linkedList0.isEmpty();
        boolean boolean14 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(34);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        boolean boolean10 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(97);
        java.lang.String str13 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey((int) (byte) 0);
        boolean boolean16 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(47);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
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
        boolean boolean18 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node20 = linkedList0.findKey((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(45);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(10);
        java.lang.String str10 = linkedList0.display();
        java.lang.String str11 = linkedList0.display();
        java.lang.String str12 = linkedList0.display();
        java.lang.String str13 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(6);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.deleteHash(1);
        hashMap1.insertHash(48);
        int int9 = hashMap1.hashing(99);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(8);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey((int) (short) 0);
        linkedList0.insert(35);
        boolean boolean10 = linkedList0.isEmpty();
        boolean boolean11 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) -1);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(52);
        linkedList0.insert(51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(4);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean13 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) 'a');
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey(0);
        linkedList0.insert(0);
        java.lang.String str10 = linkedList0.display();
        java.lang.String str11 = linkedList0.display();
        boolean boolean12 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey((int) (short) 1);
        boolean boolean15 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(52);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.insert(2);
        linkedList0.insert((int) (short) 100);
        java.lang.String str13 = linkedList0.display();
        java.lang.String str14 = linkedList0.display();
        boolean boolean15 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) '4');
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey((int) (byte) 1);
        linkedList0.insert(52);
        linkedList0.insert(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 0);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        int int7 = hashMap1.hashing((int) (short) -1);
        int int9 = hashMap1.hashing(1);
        hashMap1.deleteHash((int) (short) 10);
        hashMap1.insertHash((int) (byte) -1);
        hashMap1.insertHash(32);
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 100);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) 'a');
        boolean boolean14 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey(48);
        linkedList0.insert((int) (byte) 0);
        java.lang.String str19 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(8);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        hashMap1.insertHash((int) (short) 10);
        int int7 = hashMap1.hashing(32);
        int int9 = hashMap1.hashing((int) (short) 10);
        hashMap1.insertHash((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(32);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (short) -1);
        hashMap1.displayHashtable();
        hashMap1.deleteHash((int) 'a');
        hashMap1.displayHashtable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(20);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        linkedList0.insert(0);
        boolean boolean9 = linkedList0.isEmpty();
        boolean boolean10 = linkedList0.isEmpty();
        linkedList0.insert(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) -1);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
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
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node19 = linkedList0.findKey((int) (short) 0);
        boolean boolean20 = linkedList0.isEmpty();
        boolean boolean21 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(5);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean13 = linkedList0.isEmpty();
        boolean boolean14 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 100);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.delete(10);
        linkedList0.insert((-1));
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) '4');
        java.lang.String str17 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node19 = linkedList0.findKey(0);
        boolean boolean20 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(1);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert((int) (byte) 10);
        boolean boolean13 = linkedList0.isEmpty();
        linkedList0.delete((int) (short) 10);
        linkedList0.delete(1);
        linkedList0.insert((int) (short) -1);
        boolean boolean20 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 100);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
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
        linkedList0.insert(48);
        linkedList0.insert(52);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node22 = linkedList0.findKey(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(3);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        boolean boolean15 = linkedList0.isEmpty();
        java.lang.String str16 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node18 = linkedList0.findKey(9);
        linkedList0.insert(34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(12);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 10);
        hashMap1.insertHash(5);
        hashMap1.insertHash(35);
        int int7 = hashMap1.hashing(4);
        hashMap1.insertHash((int) (byte) 100);
        int int11 = hashMap1.hashing(99);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 10);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.insert((int) (short) -1);
        boolean boolean7 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey((int) (short) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(4);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        int int7 = hashMap1.hashing(52);
        hashMap1.deleteHash(35);
        hashMap1.displayHashtable();
        hashMap1.insertHash((int) (short) 0);
        hashMap1.displayHashtable();
        hashMap1.displayHashtable();
        hashMap1.insertHash(17);
        hashMap1.deleteHash(17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(5);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(0);
        linkedList0.insert((int) (byte) 100);
        boolean boolean13 = linkedList0.isEmpty();
        linkedList0.insert(7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(16);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.displayHashtable();
        int int4 = hashMap1.hashing((int) (byte) 1);
        int int6 = hashMap1.hashing(48);
        hashMap1.insertHash(2);
        int int10 = hashMap1.hashing(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (byte) 1);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
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
        linkedList0.delete((int) (short) 1);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) ' ');
        int int7 = hashMap1.hashing((int) (short) -1);
        int int9 = hashMap1.hashing(8);
        hashMap1.insertHash((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(12);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 10);
        java.lang.String str14 = linkedList0.display();
        java.lang.String str15 = linkedList0.display();
        boolean boolean16 = linkedList0.isEmpty();
        linkedList0.insert((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(35);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert((int) (byte) 10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(5);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        boolean boolean8 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey(10);
        java.lang.String str11 = linkedList0.display();
        boolean boolean12 = linkedList0.isEmpty();
        java.lang.String str13 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(7);
        java.lang.String str16 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) -1);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        linkedList0.insert(100);
        java.lang.String str11 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey((int) (short) 10);
        linkedList0.insert(2);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey(47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(97);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        int int5 = hashMap1.hashing((int) (byte) 0);
        hashMap1.insertHash(0);
        hashMap1.deleteHash(9);
        int int11 = hashMap1.hashing(99);
        hashMap1.insertHash(32);
        hashMap1.insertHash(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(51);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (short) 10);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) 10);
        linkedList0.insert(52);
        boolean boolean10 = linkedList0.isEmpty();
        java.lang.String str11 = linkedList0.display();
        java.lang.String str12 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(97);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (byte) 1);
        hashMap1.deleteHash((int) (byte) 100);
        hashMap1.deleteHash((int) (short) 100);
        hashMap1.displayHashtable();
        hashMap1.insertHash(51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (byte) 1);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        java.lang.String str9 = linkedList0.display();
        java.lang.String str10 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(0);
        boolean boolean13 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(27);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey(10);
        boolean boolean10 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(20);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        boolean boolean11 = linkedList0.isEmpty();
        linkedList0.insert((int) '#');
        boolean boolean14 = linkedList0.isEmpty();
        linkedList0.insert(48);
        boolean boolean17 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(97);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        linkedList0.insert((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(47);
        java.lang.String str12 = linkedList0.display();
        linkedList0.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(47);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.insert(2);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(9);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        boolean boolean6 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) 0);
        boolean boolean9 = linkedList0.isEmpty();
        linkedList0.insert((int) ' ');
        linkedList0.insert(10);
        boolean boolean14 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node16 = linkedList0.findKey((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey((int) (short) 1);
        java.lang.String str13 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node15 = linkedList0.findKey(9);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey((int) 'a');
        linkedList0.insert(47);
        linkedList0.insert(45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(0);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.deleteHash(0);
        int int5 = hashMap1.hashing(2);
        hashMap1.deleteHash((int) (short) 0);
        hashMap1.insertHash((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(20);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap(1);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.insertHash(0);
        hashMap1.insertHash(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash(19);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        java.lang.String str6 = linkedList0.display();
        linkedList0.delete(19);
        linkedList0.insert((int) (short) -1);
        boolean boolean11 = linkedList0.isEmpty();
        java.lang.String str12 = linkedList0.display();
        linkedList0.insert(51);
        boolean boolean15 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node17 = linkedList0.findKey(34);
        linkedList0.insert(16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(30);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        java.lang.String str9 = linkedList0.display();
        linkedList0.insert((int) (byte) 100);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node13 = linkedList0.findKey(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(20);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.delete((int) (short) 1);
        java.lang.String str8 = linkedList0.display();
        linkedList0.delete((-1));
        boolean boolean11 = linkedList0.isEmpty();
        java.lang.String str12 = linkedList0.display();
        linkedList0.insert(52);
        java.lang.String str15 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 10);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        java.lang.String str8 = linkedList0.display();
        linkedList0.insert(35);
        linkedList0.insert(0);
        boolean boolean13 = linkedList0.isEmpty();
        boolean boolean14 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(47);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
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
        linkedList0.delete(100);
        linkedList0.insert(27);
        java.lang.String str21 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) -1);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node7 = linkedList0.findKey(0);
        linkedList0.insert(0);
        java.lang.String str10 = linkedList0.display();
        java.lang.String str11 = linkedList0.display();
        boolean boolean12 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node14 = linkedList0.findKey(0);
        java.lang.String str15 = linkedList0.display();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (short) 10);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(3);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        linkedList0.delete((int) (short) -1);
        linkedList0.insert(2);
        java.lang.String str11 = linkedList0.display();
        linkedList0.insert((int) (short) 0);
        boolean boolean14 = linkedList0.isEmpty();
        java.lang.String str15 = linkedList0.display();
        boolean boolean16 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(99);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap hashMap1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap((int) (short) 10);
        hashMap1.insertHash((int) (short) 0);
        hashMap1.deleteHash(1);
        hashMap1.insertHash((int) (short) -1);
        hashMap1.displayHashtable();
        hashMap1.deleteHash(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        hashMap1.deleteHash((int) (short) 10);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        boolean boolean5 = linkedList0.isEmpty();
        linkedList0.insert((int) (short) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node9 = linkedList0.findKey((int) (byte) 1);
        java.lang.String str10 = linkedList0.display();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(0);
        boolean boolean13 = linkedList0.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(12);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        linkedList0.delete(0);
        linkedList0.insert((int) (byte) 0);
        linkedList0.insert(51);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node12 = linkedList0.findKey(1);
        linkedList0.insert(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(3);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.insert(10);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (short) 10);
        boolean boolean5 = linkedList0.isEmpty();
        java.lang.String str6 = linkedList0.display();
        linkedList0.insert((int) (short) 1);
        boolean boolean9 = linkedList0.isEmpty();
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node11 = linkedList0.findKey(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete(20);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList linkedList0 = new com.thealgorithms.datastructures.hashmap.hashing.HashMap.LinkedList();
        linkedList0.delete((int) 'a');
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node4 = linkedList0.findKey((int) (byte) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node6 = linkedList0.findKey((int) (short) 1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node8 = linkedList0.findKey((int) (byte) -1);
        com.thealgorithms.datastructures.hashmap.hashing.HashMap.Node node10 = linkedList0.findKey((int) (short) 10);
        linkedList0.insert((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        linkedList0.delete((int) (byte) 100);
    }
}

