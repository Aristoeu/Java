package heaps;

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
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap4.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode12 = fibonacciHeap10.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode12);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        boolean boolean20 = fibonacciHeap13.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap13.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap24.findMin();
        int int26 = heapNode25.key;
        fibonacciHeap13.delete(heapNode25);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap29.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap38.meld(fibonacciHeap41);
        fibonacciHeap41.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap41.new HeapNode(0);
        fibonacciHeap29.meld(fibonacciHeap41);
        int[] intArray47 = fibonacciHeap41.countersRep();
        boolean boolean48 = fibonacciHeap41.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap41.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode50);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap1.countersRep();
        int int20 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap25.insert(0);
        fibonacciHeap22.delete(heapNode28);
        fibonacciHeap1.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap22.new HeapNode(2);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap36.insert(0);
        int int40 = heapNode39.key;
        fibonacciHeap34.delete(heapNode39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap22.delete(heapNode39);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap3.insert(1);
        int int6 = heapNode5.key;
        int int7 = heapNode5.key;
        heapNode5.key = (-1);
        int int10 = heapNode5.getKey();
        fibonacciHeap1.delete(heapNode5);
        int int12 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode15 = fibonacciHeap13.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap17.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap17.meld(fibonacciHeap23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap26.meld(fibonacciHeap29);
        fibonacciHeap29.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap29.new HeapNode(0);
        fibonacciHeap17.meld(fibonacciHeap29);
        int[] intArray35 = fibonacciHeap17.countersRep();
        fibonacciHeap13.meld(fibonacciHeap17);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap17.new HeapNode((-1));
        int int39 = heapNode38.getKey();
        heapNode38.key = 32;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode38);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        int int20 = fibonacciHeap13.size();
        int int21 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int24 = fibonacciHeap23.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap23.meld(fibonacciHeap26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap23.meld(fibonacciHeap29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int33 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap32.meld(fibonacciHeap35);
        fibonacciHeap35.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap35.new HeapNode(0);
        fibonacciHeap23.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int43 = fibonacciHeap42.size();
        fibonacciHeap23.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap23.meld(fibonacciHeap46);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int50 = fibonacciHeap49.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap49.insert(0);
        fibonacciHeap49.deleteMin();
        fibonacciHeap46.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap46.new HeapNode((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode56);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap1.countersRep();
        int int20 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap25.insert(0);
        fibonacciHeap22.delete(heapNode28);
        fibonacciHeap1.meld(fibonacciHeap22);
        int[] intArray31 = fibonacciHeap22.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap33.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int38 = fibonacciHeap37.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int41 = fibonacciHeap40.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap40.insert(0);
        fibonacciHeap37.delete(heapNode43);
        fibonacciHeap33.delete(heapNode43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap22.delete(heapNode43);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int4 = fibonacciHeap3.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap3.insert(0);
        int int7 = heapNode6.key;
        fibonacciHeap1.delete(heapNode6);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode12 = fibonacciHeap10.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap10.new HeapNode(10);
        heapNode14.key = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode14);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int int19 = fibonacciHeap13.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode28);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap4.new HeapNode(0);
        int int9 = fibonacciHeap4.size();
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode(0);
        fibonacciHeap12.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        fibonacciHeap24.meld(fibonacciHeap31);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int36 = fibonacciHeap35.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap35.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap35.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int45 = fibonacciHeap44.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap44.meld(fibonacciHeap47);
        fibonacciHeap47.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap47.new HeapNode(0);
        fibonacciHeap35.meld(fibonacciHeap47);
        fibonacciHeap31.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap35.insert((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode55);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap0.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap3.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap7.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int17 = fibonacciHeap16.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap16.meld(fibonacciHeap19);
        fibonacciHeap19.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap19.new HeapNode(0);
        fibonacciHeap7.meld(fibonacciHeap19);
        int[] intArray25 = fibonacciHeap7.countersRep();
        fibonacciHeap3.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap3.new HeapNode((int) 'a');
        int int29 = heapNode28.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap0.delete(heapNode28);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap4.new HeapNode(0);
        int[] intArray9 = fibonacciHeap4.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap11.insert(1);
        boolean boolean14 = fibonacciHeap11.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap16.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int24 = fibonacciHeap23.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap23.insert(0);
        fibonacciHeap20.delete(heapNode26);
        fibonacciHeap16.delete(heapNode26);
        fibonacciHeap11.delete(heapNode26);
        heapNode26.key = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode26);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap0.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int5 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap4.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        fibonacciHeap16.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap16.new HeapNode(0);
        fibonacciHeap4.meld(fibonacciHeap16);
        int[] intArray22 = fibonacciHeap4.countersRep();
        fibonacciHeap0.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap4.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap27.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        fibonacciHeap39.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap39.new HeapNode(0);
        fibonacciHeap27.meld(fibonacciHeap39);
        int[] intArray45 = fibonacciHeap39.countersRep();
        int int46 = fibonacciHeap39.size();
        int int47 = fibonacciHeap39.size();
        fibonacciHeap4.meld(fibonacciHeap39);
        int int49 = fibonacciHeap39.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap51 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int52 = fibonacciHeap51.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap54 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap51.meld(fibonacciHeap54);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap57 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap51.meld(fibonacciHeap57);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap60 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int61 = fibonacciHeap60.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap63 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap60.meld(fibonacciHeap63);
        fibonacciHeap63.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap63.new HeapNode(0);
        fibonacciHeap51.meld(fibonacciHeap63);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap70 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int71 = fibonacciHeap70.size();
        fibonacciHeap51.meld(fibonacciHeap70);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap74 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap51.meld(fibonacciHeap74);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode77 = fibonacciHeap51.insert((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap39.delete(heapNode77);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int15 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap17.insert(0);
        fibonacciHeap14.delete(heapNode20);
        fibonacciHeap4.meld(fibonacciHeap14);
        fibonacciHeap14.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap25.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap14.delete(heapNode26);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.new HeapNode(10);
        fibonacciHeap1.deleteMin();
        int int7 = fibonacciHeap1.size();
        fibonacciHeap1.deleteMin();
        int[] intArray9 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int12 = fibonacciHeap11.size();
        int int13 = fibonacciHeap11.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode15 = fibonacciHeap11.insert(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode15);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap0.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int5 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap4.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        fibonacciHeap16.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap16.new HeapNode(0);
        fibonacciHeap4.meld(fibonacciHeap16);
        int[] intArray22 = fibonacciHeap4.countersRep();
        fibonacciHeap0.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap4.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap27.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        fibonacciHeap39.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap39.new HeapNode(0);
        fibonacciHeap27.meld(fibonacciHeap39);
        int[] intArray45 = fibonacciHeap39.countersRep();
        int int46 = fibonacciHeap39.size();
        int int47 = fibonacciHeap39.size();
        fibonacciHeap4.meld(fibonacciHeap39);
        fibonacciHeap4.deleteMin();
        int int50 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap4.findMin();
        boolean boolean52 = fibonacciHeap4.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap54 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap54.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int59 = fibonacciHeap58.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int62 = fibonacciHeap61.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode64 = fibonacciHeap61.insert(0);
        fibonacciHeap58.delete(heapNode64);
        fibonacciHeap54.delete(heapNode64);
        heapNode64.key = ' ';
        int int69 = heapNode64.getKey();
        int int70 = heapNode64.getKey();
        int int71 = heapNode64.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode64);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap3.insert(1);
        int int6 = heapNode5.key;
        int int7 = heapNode5.key;
        heapNode5.key = (-1);
        int int10 = heapNode5.getKey();
        fibonacciHeap1.delete(heapNode5);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap12.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int17 = fibonacciHeap16.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap16.meld(fibonacciHeap19);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap16.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap25.meld(fibonacciHeap28);
        fibonacciHeap28.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap28.new HeapNode(0);
        fibonacciHeap16.meld(fibonacciHeap28);
        int[] intArray34 = fibonacciHeap16.countersRep();
        fibonacciHeap12.meld(fibonacciHeap16);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap16.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int40 = fibonacciHeap39.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap39.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap39.meld(fibonacciHeap45);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int49 = fibonacciHeap48.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap51 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap48.meld(fibonacciHeap51);
        fibonacciHeap51.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap51.new HeapNode(0);
        fibonacciHeap39.meld(fibonacciHeap51);
        int[] intArray57 = fibonacciHeap51.countersRep();
        int int58 = fibonacciHeap51.size();
        int int59 = fibonacciHeap51.size();
        fibonacciHeap16.meld(fibonacciHeap51);
        int int61 = fibonacciHeap51.potential();
        boolean boolean62 = fibonacciHeap51.empty();
        fibonacciHeap51.deleteMin();
        fibonacciHeap1.meld(fibonacciHeap51);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap65 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap65.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap69 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int70 = fibonacciHeap69.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap72 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap69.meld(fibonacciHeap72);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap75 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap69.meld(fibonacciHeap75);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap78 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int79 = fibonacciHeap78.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap81 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap78.meld(fibonacciHeap81);
        fibonacciHeap81.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode85 = fibonacciHeap81.new HeapNode(0);
        fibonacciHeap69.meld(fibonacciHeap81);
        int[] intArray87 = fibonacciHeap69.countersRep();
        fibonacciHeap65.meld(fibonacciHeap69);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode90 = fibonacciHeap69.new HeapNode((-1));
        heapNode90.key = 100;
        int int93 = heapNode90.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode90);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.new HeapNode(0);
        fibonacciHeap1.deleteMin();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap7.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode11 = fibonacciHeap7.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        fibonacciHeap7.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.insert((int) (byte) 0);
        int int18 = heapNode17.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode17);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        boolean boolean20 = fibonacciHeap13.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap13.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap24.meld(fibonacciHeap27);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap24.meld(fibonacciHeap30);
        fibonacciHeap13.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap33.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap33.new HeapNode((int) (short) 100);
        int int38 = fibonacciHeap33.size();
        fibonacciHeap13.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode42 = fibonacciHeap40.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap40.new HeapNode((int) (short) 100);
        boolean boolean45 = fibonacciHeap40.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap40.insert(7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap33.delete(heapNode47);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap1.deleteMin();
        fibonacciHeap1.deleteMin();
        fibonacciHeap1.deleteMin();
        int int5 = fibonacciHeap1.potential();
        int[] intArray6 = fibonacciHeap1.countersRep();
        int int7 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap11.meld(fibonacciHeap14);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap11.new HeapNode((int) (short) 0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode19 = fibonacciHeap11.new HeapNode((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap21.insert(1);
        boolean boolean24 = fibonacciHeap21.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap21.new HeapNode((int) ' ');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap21.new HeapNode((int) '#');
        fibonacciHeap11.delete(heapNode28);
        fibonacciHeap9.delete(heapNode28);
        heapNode28.key = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode28);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap27.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap34.insert(0);
        fibonacciHeap31.delete(heapNode37);
        fibonacciHeap27.delete(heapNode37);
        fibonacciHeap24.delete(heapNode37);
        fibonacciHeap1.delete(heapNode37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap42.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap46.meld(fibonacciHeap52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap55.meld(fibonacciHeap58);
        fibonacciHeap58.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap58.new HeapNode(0);
        fibonacciHeap46.meld(fibonacciHeap58);
        int[] intArray64 = fibonacciHeap46.countersRep();
        fibonacciHeap42.meld(fibonacciHeap46);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap46.new HeapNode((-1));
        int int68 = heapNode67.getKey();
        fibonacciHeap1.delete(heapNode67);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap71 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int72 = fibonacciHeap71.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap74 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap71.meld(fibonacciHeap74);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap77 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap71.meld(fibonacciHeap77);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap80 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int81 = fibonacciHeap80.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap83 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap80.meld(fibonacciHeap83);
        fibonacciHeap83.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode87 = fibonacciHeap83.new HeapNode(0);
        fibonacciHeap71.meld(fibonacciHeap83);
        int int89 = fibonacciHeap83.potential();
        int int90 = fibonacciHeap83.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode92 = fibonacciHeap83.insert((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode92);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap4.new HeapNode(0);
        int[] intArray9 = fibonacciHeap4.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int19 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap18.meld(fibonacciHeap21);
        fibonacciHeap15.meld(fibonacciHeap21);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap15.new HeapNode((int) (short) 10);
        heapNode25.key = 2;
        int int28 = heapNode25.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode25);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int int19 = fibonacciHeap13.potential();
        int int20 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap22.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap22.insert((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode27);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.new HeapNode(10);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap8.meld(fibonacciHeap11);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap8.new HeapNode((int) (short) 0);
        heapNode14.key = (byte) 100;
        heapNode14.key = (-1);
        fibonacciHeap1.delete(heapNode14);
        int int20 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap22.meld(fibonacciHeap25);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap22.meld(fibonacciHeap28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap31.meld(fibonacciHeap34);
        fibonacciHeap34.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap34.new HeapNode(0);
        fibonacciHeap22.meld(fibonacciHeap34);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap22.insert((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode41);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap1.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap24.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int31 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap30.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        fibonacciHeap33.meld(fibonacciHeap39);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap33.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap33.new HeapNode(0);
        fibonacciHeap24.delete(heapNode45);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int49 = fibonacciHeap48.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap48.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap24.delete(heapNode50);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap4.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap11.insert(0);
        fibonacciHeap8.delete(heapNode14);
        fibonacciHeap4.delete(heapNode14);
        fibonacciHeap1.delete(heapNode14);
        int int18 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap22.meld(fibonacciHeap25);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap22.new HeapNode((int) (short) 0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap22.new HeapNode((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap32.insert(1);
        boolean boolean35 = fibonacciHeap32.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap32.new HeapNode((int) ' ');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap32.new HeapNode((int) '#');
        fibonacciHeap22.delete(heapNode39);
        fibonacciHeap20.delete(heapNode39);
        heapNode39.key = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode39);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap3.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap3.new HeapNode(10);
        fibonacciHeap1.delete(heapNode7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap1.new HeapNode((int) '4');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode(0);
        fibonacciHeap12.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode31 = fibonacciHeap12.insert((-1));
        fibonacciHeap12.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap12.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode33);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap10.new HeapNode((int) (byte) 100);
        int[] intArray15 = fibonacciHeap10.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap17.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap17.meld(fibonacciHeap23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap26.meld(fibonacciHeap29);
        fibonacciHeap29.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap29.new HeapNode(0);
        fibonacciHeap17.meld(fibonacciHeap29);
        int[] intArray35 = fibonacciHeap29.countersRep();
        boolean boolean36 = fibonacciHeap29.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap29.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap29.insert(100);
        fibonacciHeap10.meld(fibonacciHeap29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap43.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap43.new HeapNode(10);
        heapNode47.key = 100;
        int int50 = heapNode47.getKey();
        fibonacciHeap10.delete(heapNode47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap10.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap10.deleteMin();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        boolean boolean4 = fibonacciHeap1.empty();
        int int5 = fibonacciHeap1.size();
        int int6 = fibonacciHeap1.size();
        boolean boolean7 = fibonacciHeap1.empty();
        int int8 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap1.insert((int) (byte) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap12.new HeapNode((int) (short) 0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap12.new HeapNode((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap22.insert(1);
        boolean boolean25 = fibonacciHeap22.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap22.new HeapNode((int) ' ');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap22.new HeapNode((int) '#');
        fibonacciHeap12.delete(heapNode29);
        fibonacciHeap1.delete(heapNode29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap33.insert(1);
        int int36 = heapNode35.getKey();
        int int37 = heapNode35.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode35);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap0.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int5 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap4.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        fibonacciHeap16.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap16.new HeapNode(0);
        fibonacciHeap4.meld(fibonacciHeap16);
        int[] intArray22 = fibonacciHeap4.countersRep();
        fibonacciHeap0.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap4.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap27.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        fibonacciHeap39.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap39.new HeapNode(0);
        fibonacciHeap27.meld(fibonacciHeap39);
        int[] intArray45 = fibonacciHeap39.countersRep();
        int int46 = fibonacciHeap39.size();
        int int47 = fibonacciHeap39.size();
        fibonacciHeap4.meld(fibonacciHeap39);
        fibonacciHeap4.deleteMin();
        int int50 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap4.findMin();
        boolean boolean52 = fibonacciHeap4.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode54 = fibonacciHeap4.new HeapNode((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap56 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int57 = fibonacciHeap56.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap56.meld(fibonacciHeap59);
        fibonacciHeap59.deleteMin();
        int[] intArray62 = fibonacciHeap59.countersRep();
        int int63 = fibonacciHeap59.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode65 = fibonacciHeap59.new HeapNode(0);
        int[] intArray66 = fibonacciHeap59.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode68 = fibonacciHeap59.new HeapNode((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode68);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int17 = fibonacciHeap16.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap16.meld(fibonacciHeap19);
        fibonacciHeap13.meld(fibonacciHeap19);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap13.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.delete(heapNode25);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int29 = fibonacciHeap28.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap28.meld(fibonacciHeap31);
        fibonacciHeap31.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap31.new HeapNode(0);
        int int36 = fibonacciHeap31.size();
        fibonacciHeap31.deleteMin();
        fibonacciHeap1.meld(fibonacciHeap31);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int41 = fibonacciHeap40.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap40.meld(fibonacciHeap43);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap40.meld(fibonacciHeap46);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int50 = fibonacciHeap49.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap49.meld(fibonacciHeap52);
        fibonacciHeap52.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap52.new HeapNode(0);
        fibonacciHeap40.meld(fibonacciHeap52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int60 = fibonacciHeap59.size();
        fibonacciHeap40.meld(fibonacciHeap59);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap63 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap40.meld(fibonacciHeap63);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap66 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int67 = fibonacciHeap66.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode69 = fibonacciHeap66.insert(0);
        fibonacciHeap66.deleteMin();
        fibonacciHeap63.meld(fibonacciHeap66);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode73 = fibonacciHeap63.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode75 = fibonacciHeap63.insert(0);
        int int76 = heapNode75.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode75);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap13.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap13.new HeapNode(32);
        int int23 = fibonacciHeap13.potential();
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap26.insert((int) (short) 10);
        int int30 = fibonacciHeap26.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap26.new HeapNode((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode32);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        boolean boolean20 = fibonacciHeap13.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap13.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap24.meld(fibonacciHeap27);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap24.meld(fibonacciHeap30);
        fibonacciHeap13.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap33.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap33.new HeapNode((int) (short) 100);
        int int38 = fibonacciHeap33.size();
        fibonacciHeap13.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int42 = fibonacciHeap41.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap41.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap33.delete(heapNode44);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap3.insert(1);
        int int6 = heapNode5.key;
        int int7 = heapNode5.key;
        heapNode5.key = (-1);
        int int10 = heapNode5.getKey();
        fibonacciHeap1.delete(heapNode5);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int20 = fibonacciHeap19.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap19.meld(fibonacciHeap22);
        fibonacciHeap16.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap22.new HeapNode((int) (byte) 100);
        int[] intArray27 = fibonacciHeap22.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap29.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap38.meld(fibonacciHeap41);
        fibonacciHeap41.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap41.new HeapNode(0);
        fibonacciHeap29.meld(fibonacciHeap41);
        int[] intArray47 = fibonacciHeap41.countersRep();
        boolean boolean48 = fibonacciHeap41.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap41.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap41.insert(100);
        fibonacciHeap22.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap55.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode59 = fibonacciHeap55.new HeapNode(10);
        heapNode59.key = 100;
        int int62 = heapNode59.getKey();
        fibonacciHeap22.delete(heapNode59);
        fibonacciHeap1.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode66 = fibonacciHeap22.new HeapNode(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap22.deleteMin();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        boolean boolean20 = fibonacciHeap13.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap13.insert((int) (byte) 100);
        int[] intArray23 = fibonacciHeap13.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap13.findMin();
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap27.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode31 = fibonacciHeap27.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int34 = fibonacciHeap33.size();
        fibonacciHeap27.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap33.insert((int) (byte) 0);
        int int38 = heapNode37.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode37);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        int int9 = fibonacciHeap7.potential();
        int int10 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode(0);
        fibonacciHeap12.meld(fibonacciHeap24);
        int[] intArray30 = fibonacciHeap24.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode31 = fibonacciHeap24.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap24.new HeapNode(32);
        fibonacciHeap7.delete(heapNode33);
        boolean boolean35 = fibonacciHeap7.empty();
        boolean boolean36 = fibonacciHeap7.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap38.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode42 = fibonacciHeap38.new HeapNode(10);
        fibonacciHeap38.deleteMin();
        int int44 = fibonacciHeap38.size();
        boolean boolean45 = fibonacciHeap38.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap38.insert((int) (byte) -1);
        int int48 = heapNode47.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap7.delete(heapNode47);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap3.insert(1);
        int int6 = heapNode5.key;
        int int7 = heapNode5.key;
        heapNode5.key = (-1);
        int int10 = heapNode5.getKey();
        fibonacciHeap1.delete(heapNode5);
        boolean boolean12 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int15 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap14.findMin();
        int int17 = fibonacciHeap14.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap18.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap18.new HeapNode((int) (short) 100);
        boolean boolean23 = fibonacciHeap18.empty();
        fibonacciHeap14.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap14.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap14.insert((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode27);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap1.countersRep();
        int int20 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap25.insert(0);
        fibonacciHeap22.delete(heapNode28);
        fibonacciHeap1.meld(fibonacciHeap22);
        boolean boolean31 = fibonacciHeap22.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap22.findMin();
        int[] intArray33 = fibonacciHeap22.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap34.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap38.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap38.meld(fibonacciHeap44);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int48 = fibonacciHeap47.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap47.meld(fibonacciHeap50);
        fibonacciHeap50.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode54 = fibonacciHeap50.new HeapNode(0);
        fibonacciHeap38.meld(fibonacciHeap50);
        int[] intArray56 = fibonacciHeap38.countersRep();
        fibonacciHeap34.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode59 = fibonacciHeap38.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int62 = fibonacciHeap61.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap64 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap61.meld(fibonacciHeap64);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap67 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap61.meld(fibonacciHeap67);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap70 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int71 = fibonacciHeap70.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap73 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap70.meld(fibonacciHeap73);
        fibonacciHeap73.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode77 = fibonacciHeap73.new HeapNode(0);
        fibonacciHeap61.meld(fibonacciHeap73);
        int[] intArray79 = fibonacciHeap73.countersRep();
        int int80 = fibonacciHeap73.size();
        int int81 = fibonacciHeap73.size();
        fibonacciHeap38.meld(fibonacciHeap73);
        fibonacciHeap38.deleteMin();
        int int84 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode85 = fibonacciHeap38.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap22.delete(heapNode85);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap2 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode4 = fibonacciHeap2.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int7 = fibonacciHeap6.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int10 = fibonacciHeap9.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode12 = fibonacciHeap9.insert(0);
        fibonacciHeap6.delete(heapNode12);
        fibonacciHeap2.delete(heapNode12);
        boolean boolean15 = fibonacciHeap2.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap2.insert(3);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap19.insert(1);
        int int22 = heapNode21.key;
        int int23 = heapNode21.key;
        heapNode21.key = (-1);
        int int26 = heapNode21.key;
        fibonacciHeap2.delete(heapNode21);
        int[] intArray28 = fibonacciHeap2.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode31 = fibonacciHeap30.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap30.new HeapNode((-1));
        fibonacciHeap2.delete(heapNode33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap0.delete(heapNode33);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int int19 = fibonacciHeap13.size();
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        int[] intArray24 = fibonacciHeap22.countersRep();
        int int25 = fibonacciHeap22.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap22.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap22.insert(32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode31 = fibonacciHeap22.insert((int) (byte) 100);
        int int32 = heapNode31.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode31);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int4 = fibonacciHeap3.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap3.insert(0);
        int int7 = heapNode6.key;
        fibonacciHeap1.delete(heapNode6);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        int int15 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap10.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode19 = fibonacciHeap17.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap21.meld(fibonacciHeap27);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int31 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap30.meld(fibonacciHeap33);
        fibonacciHeap33.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap33.new HeapNode(0);
        fibonacciHeap21.meld(fibonacciHeap33);
        int[] intArray39 = fibonacciHeap21.countersRep();
        fibonacciHeap17.meld(fibonacciHeap21);
        fibonacciHeap10.meld(fibonacciHeap17);
        fibonacciHeap10.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode49 = fibonacciHeap46.insert(0);
        int int50 = heapNode49.key;
        fibonacciHeap44.delete(heapNode49);
        heapNode49.key = (short) -1;
        fibonacciHeap10.delete(heapNode49);
        heapNode49.key = 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode49);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap3.insert(1);
        boolean boolean6 = fibonacciHeap3.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap8.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap15.insert(0);
        fibonacciHeap12.delete(heapNode18);
        fibonacciHeap8.delete(heapNode18);
        fibonacciHeap3.delete(heapNode18);
        fibonacciHeap1.delete(heapNode18);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap25.new HeapNode((int) (short) 1);
        int int28 = heapNode27.getKey();
        int int29 = heapNode27.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode27);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        int int20 = fibonacciHeap13.size();
        int int21 = fibonacciHeap13.size();
        fibonacciHeap13.deleteMin();
        int[] intArray23 = fibonacciHeap13.countersRep();
        int[] intArray24 = fibonacciHeap13.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap29.insert(0);
        fibonacciHeap26.delete(heapNode32);
        heapNode32.key = (short) 1;
        int int36 = heapNode32.getKey();
        int int37 = heapNode32.key;
        int int38 = heapNode32.key;
        heapNode32.key = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode32);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        boolean boolean4 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int7 = fibonacciHeap6.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int10 = fibonacciHeap9.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode12 = fibonacciHeap9.insert(0);
        fibonacciHeap6.delete(heapNode12);
        heapNode12.key = (short) 1;
        fibonacciHeap1.delete(heapNode12);
        int int17 = fibonacciHeap1.potential();
        boolean boolean18 = fibonacciHeap1.empty();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap1.insert(4);
        fibonacciHeap1.deleteMin();
        int[] intArray23 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap25.meld(fibonacciHeap28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap31.meld(fibonacciHeap34);
        fibonacciHeap28.meld(fibonacciHeap34);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap34.insert((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode38);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap1.countersRep();
        int int20 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap25.insert(0);
        fibonacciHeap22.delete(heapNode28);
        fibonacciHeap1.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap22.new HeapNode(2);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap22.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap22.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap36.insert(1);
        boolean boolean39 = fibonacciHeap36.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int42 = fibonacciHeap41.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int45 = fibonacciHeap44.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap44.insert(0);
        fibonacciHeap41.delete(heapNode47);
        heapNode47.key = (short) 1;
        fibonacciHeap36.delete(heapNode47);
        heapNode47.key = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap22.delete(heapNode47);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        boolean boolean4 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap6.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap13.insert(0);
        fibonacciHeap10.delete(heapNode16);
        fibonacciHeap6.delete(heapNode16);
        fibonacciHeap1.delete(heapNode16);
        int[] intArray20 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap22.meld(fibonacciHeap25);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int29 = fibonacciHeap28.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap28.meld(fibonacciHeap31);
        fibonacciHeap25.meld(fibonacciHeap31);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap25.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap25.new HeapNode(0);
        fibonacciHeap1.delete(heapNode37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int41 = fibonacciHeap40.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int44 = fibonacciHeap43.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode46 = fibonacciHeap43.insert(0);
        fibonacciHeap40.delete(heapNode46);
        heapNode46.key = (short) 1;
        int int50 = heapNode46.getKey();
        int int51 = heapNode46.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode46);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap0.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int5 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap4.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        fibonacciHeap16.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap16.new HeapNode(0);
        fibonacciHeap4.meld(fibonacciHeap16);
        int[] intArray22 = fibonacciHeap4.countersRep();
        fibonacciHeap0.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap4.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap27.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        fibonacciHeap39.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap39.new HeapNode(0);
        fibonacciHeap27.meld(fibonacciHeap39);
        int[] intArray45 = fibonacciHeap39.countersRep();
        int int46 = fibonacciHeap39.size();
        int int47 = fibonacciHeap39.size();
        fibonacciHeap4.meld(fibonacciHeap39);
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap51 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap51.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int59 = fibonacciHeap58.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode61 = fibonacciHeap58.insert(0);
        fibonacciHeap55.delete(heapNode61);
        fibonacciHeap51.delete(heapNode61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode61);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap10.new HeapNode((int) (byte) 100);
        int[] intArray15 = fibonacciHeap10.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap16.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap20.meld(fibonacciHeap23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap20.meld(fibonacciHeap26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        fibonacciHeap32.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap32.new HeapNode(0);
        fibonacciHeap20.meld(fibonacciHeap32);
        int[] intArray38 = fibonacciHeap20.countersRep();
        fibonacciHeap16.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap16.new HeapNode((int) 'a');
        fibonacciHeap10.delete(heapNode41);
        fibonacciHeap10.deleteMin();
        int[] intArray44 = fibonacciHeap10.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int53 = fibonacciHeap52.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap52.meld(fibonacciHeap55);
        fibonacciHeap49.meld(fibonacciHeap55);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode59 = fibonacciHeap55.new HeapNode((int) (byte) 100);
        int[] intArray60 = fibonacciHeap55.countersRep();
        int int61 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode63 = fibonacciHeap55.new HeapNode((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap10.delete(heapNode63);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap4.new HeapNode(0);
        int[] intArray9 = fibonacciHeap4.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.findMin();
        int int11 = fibonacciHeap4.potential();
        boolean boolean12 = fibonacciHeap4.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int15 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap14.insert((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode17);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        int int6 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap8.meld(fibonacciHeap11);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap8.meld(fibonacciHeap14);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap17.meld(fibonacciHeap20);
        fibonacciHeap20.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap20.new HeapNode(0);
        fibonacciHeap8.meld(fibonacciHeap20);
        int[] intArray26 = fibonacciHeap20.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap20.findMin();
        fibonacciHeap1.meld(fibonacciHeap20);
        boolean boolean29 = fibonacciHeap20.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap31.new HeapNode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap20.delete(heapNode33);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        boolean boolean4 = fibonacciHeap1.empty();
        int int5 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap6.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap10.meld(fibonacciHeap16);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int20 = fibonacciHeap19.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap19.meld(fibonacciHeap22);
        fibonacciHeap22.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap22.new HeapNode(0);
        fibonacciHeap10.meld(fibonacciHeap22);
        int[] intArray28 = fibonacciHeap10.countersRep();
        fibonacciHeap6.meld(fibonacciHeap10);
        fibonacciHeap1.meld(fibonacciHeap10);
        fibonacciHeap1.deleteMin();
        int int32 = fibonacciHeap1.potential();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap1.findMin();
        int int35 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap37.findMin();
        heapNode38.key = (byte) 10;
        fibonacciHeap1.delete(heapNode38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.deleteMin();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap4.new HeapNode(2);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.new HeapNode(32);
        int int11 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        fibonacciHeap16.deleteMin();
        int[] intArray19 = fibonacciHeap16.countersRep();
        int int20 = fibonacciHeap16.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap16.new HeapNode(1);
        int int23 = heapNode22.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode22);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap10.new HeapNode((int) (byte) 100);
        int[] intArray15 = fibonacciHeap10.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap16.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap20.meld(fibonacciHeap23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap20.meld(fibonacciHeap26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        fibonacciHeap32.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap32.new HeapNode(0);
        fibonacciHeap20.meld(fibonacciHeap32);
        int[] intArray38 = fibonacciHeap20.countersRep();
        fibonacciHeap16.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap16.new HeapNode((int) 'a');
        fibonacciHeap10.delete(heapNode41);
        fibonacciHeap10.deleteMin();
        int[] intArray44 = fibonacciHeap10.countersRep();
        int int45 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode49 = fibonacciHeap47.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap47.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int54 = fibonacciHeap53.size();
        fibonacciHeap47.meld(fibonacciHeap53);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap47.new HeapNode((int) '4');
        boolean boolean58 = fibonacciHeap47.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode60 = fibonacciHeap47.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap10.delete(heapNode60);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int15 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap17.insert(0);
        fibonacciHeap14.delete(heapNode20);
        fibonacciHeap4.meld(fibonacciHeap14);
        int[] intArray23 = fibonacciHeap4.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap27.insert(1);
        int int30 = heapNode29.key;
        int int31 = heapNode29.key;
        heapNode29.key = (-1);
        int int34 = heapNode29.getKey();
        fibonacciHeap25.delete(heapNode29);
        int int36 = fibonacciHeap25.size();
        boolean boolean37 = fibonacciHeap25.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap25.findMin();
        fibonacciHeap4.meld(fibonacciHeap25);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int42 = fibonacciHeap41.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap41.meld(fibonacciHeap44);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap41.meld(fibonacciHeap47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int51 = fibonacciHeap50.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap50.meld(fibonacciHeap53);
        fibonacciHeap53.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap53.new HeapNode(0);
        fibonacciHeap41.meld(fibonacciHeap53);
        int[] intArray59 = fibonacciHeap41.countersRep();
        int int60 = fibonacciHeap41.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap62 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int63 = fibonacciHeap62.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap65 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int66 = fibonacciHeap65.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode68 = fibonacciHeap65.insert(0);
        fibonacciHeap62.delete(heapNode68);
        fibonacciHeap41.meld(fibonacciHeap62);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode72 = fibonacciHeap62.new HeapNode(2);
        int int73 = heapNode72.getKey();
        int int74 = heapNode72.key;
        int int75 = heapNode72.getKey();
        int int76 = heapNode72.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap25.delete(heapNode72);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap4.new HeapNode(0);
        int int9 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap12.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 1);
        int int2 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int5 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap4.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap7.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap20.insert(0);
        fibonacciHeap17.delete(heapNode23);
        fibonacciHeap7.meld(fibonacciHeap17);
        fibonacciHeap17.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap17.insert(100);
        fibonacciHeap1.delete(heapNode28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int33 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap32.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap32.new HeapNode((int) (short) 0);
        int int39 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap32.insert(0);
        int int42 = heapNode41.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode41);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap4.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap11.insert(0);
        fibonacciHeap8.delete(heapNode14);
        fibonacciHeap4.delete(heapNode14);
        heapNode14.key = ' ';
        int int19 = heapNode14.getKey();
        fibonacciHeap1.delete(heapNode14);
        int int21 = fibonacciHeap1.potential();
        boolean boolean22 = fibonacciHeap1.empty();
        fibonacciHeap1.deleteMin();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap26.meld(fibonacciHeap29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap26.meld(fibonacciHeap32);
        int int34 = fibonacciHeap32.potential();
        int int35 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap36.new HeapNode((int) '#');
        fibonacciHeap32.delete(heapNode38);
        int int40 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode42 = fibonacciHeap32.new HeapNode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode42);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap1.countersRep();
        int int20 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap25.insert(0);
        fibonacciHeap22.delete(heapNode28);
        fibonacciHeap1.meld(fibonacciHeap22);
        boolean boolean31 = fibonacciHeap22.empty();
        fibonacciHeap22.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap22.findMin();
        int int34 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap36.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int46 = fibonacciHeap45.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap45.meld(fibonacciHeap48);
        fibonacciHeap48.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap48.new HeapNode(0);
        fibonacciHeap36.meld(fibonacciHeap48);
        int[] intArray54 = fibonacciHeap36.countersRep();
        int int55 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap36.findMin();
        int int57 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode59 = fibonacciHeap36.new HeapNode(3);
        int int60 = heapNode59.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap22.delete(heapNode59);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        int[] intArray7 = fibonacciHeap4.countersRep();
        int int8 = fibonacciHeap4.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.new HeapNode(0);
        int int11 = fibonacciHeap4.size();
        int int12 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap16.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap16.new HeapNode(10);
        fibonacciHeap14.delete(heapNode20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap14.new HeapNode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode23);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode11 = fibonacciHeap1.new HeapNode((int) '4');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap1.new HeapNode(32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode19 = fibonacciHeap17.insert(1);
        boolean boolean20 = fibonacciHeap17.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap22.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap29.insert(0);
        fibonacciHeap26.delete(heapNode32);
        fibonacciHeap22.delete(heapNode32);
        fibonacciHeap17.delete(heapNode32);
        fibonacciHeap15.delete(heapNode32);
        fibonacciHeap1.delete(heapNode32);
        int int38 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int41 = fibonacciHeap40.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap40.insert(0);
        int int44 = heapNode43.getKey();
        heapNode43.key = (byte) -1;
        int int47 = heapNode43.getKey();
        int int48 = heapNode43.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode43);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap1.countersRep();
        int int20 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap25.insert(0);
        fibonacciHeap22.delete(heapNode28);
        fibonacciHeap1.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap22.new HeapNode(2);
        int int33 = fibonacciHeap22.size();
        fibonacciHeap22.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap36.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap22.delete(heapNode38);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(97);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int4 = fibonacciHeap3.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap3.meld(fibonacciHeap6);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap3.meld(fibonacciHeap9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        fibonacciHeap15.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode19 = fibonacciHeap15.new HeapNode(0);
        fibonacciHeap3.meld(fibonacciHeap15);
        int[] intArray21 = fibonacciHeap15.countersRep();
        boolean boolean22 = fibonacciHeap15.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap15.insert((int) (byte) 100);
        int[] intArray25 = fibonacciHeap15.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap15.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap15.new HeapNode(5);
        fibonacciHeap1.delete(heapNode28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap31.findMin();
        int int33 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap31.findMin();
        heapNode34.key = 97;
        int int37 = heapNode34.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode34);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        fibonacciHeap4.meld(fibonacciHeap10);
        fibonacciHeap10.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap14.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int19 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap18.meld(fibonacciHeap21);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap18.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        fibonacciHeap30.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap30.new HeapNode(0);
        fibonacciHeap18.meld(fibonacciHeap30);
        int[] intArray36 = fibonacciHeap18.countersRep();
        fibonacciHeap14.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap14.insert(2);
        int int40 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode46 = fibonacciHeap44.new HeapNode(0);
        fibonacciHeap42.delete(heapNode46);
        fibonacciHeap14.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int51 = fibonacciHeap50.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap50.meld(fibonacciHeap53);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap56 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int57 = fibonacciHeap56.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap56.meld(fibonacciHeap59);
        fibonacciHeap53.meld(fibonacciHeap59);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode63 = fibonacciHeap53.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode65 = fibonacciHeap53.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap53.new HeapNode((-1));
        fibonacciHeap14.delete(heapNode67);
        heapNode67.key = 'a';
        int int71 = heapNode67.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap10.delete(heapNode67);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap4.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.insert((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode(0);
        fibonacciHeap12.meld(fibonacciHeap24);
        int[] intArray30 = fibonacciHeap24.countersRep();
        boolean boolean31 = fibonacciHeap24.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap24.insert((int) (byte) 100);
        int[] intArray34 = fibonacciHeap24.countersRep();
        fibonacciHeap4.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int38 = fibonacciHeap37.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap37.findMin();
        fibonacciHeap37.deleteMin();
        fibonacciHeap24.meld(fibonacciHeap37);
        int[] intArray42 = fibonacciHeap37.countersRep();
        int int43 = fibonacciHeap37.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap45.deleteMin();
        fibonacciHeap45.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int50 = fibonacciHeap49.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap49.meld(fibonacciHeap52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap49.meld(fibonacciHeap55);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int59 = fibonacciHeap58.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap58.meld(fibonacciHeap61);
        fibonacciHeap61.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode65 = fibonacciHeap61.new HeapNode(0);
        fibonacciHeap49.meld(fibonacciHeap61);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap68 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int69 = fibonacciHeap68.size();
        fibonacciHeap49.meld(fibonacciHeap68);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode71 = fibonacciHeap49.findMin();
        fibonacciHeap45.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode73 = fibonacciHeap49.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap37.delete(heapNode73);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        int[] intArray7 = fibonacciHeap4.countersRep();
        int int8 = fibonacciHeap4.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.new HeapNode(0);
        int int11 = fibonacciHeap4.potential();
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int15 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap14.meld(fibonacciHeap17);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap14.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int24 = fibonacciHeap23.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap23.meld(fibonacciHeap26);
        fibonacciHeap26.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap26.new HeapNode(0);
        fibonacciHeap14.meld(fibonacciHeap26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int34 = fibonacciHeap33.size();
        fibonacciHeap26.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int38 = fibonacciHeap37.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap37.meld(fibonacciHeap40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap37.meld(fibonacciHeap43);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        fibonacciHeap49.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap49.new HeapNode(0);
        fibonacciHeap37.meld(fibonacciHeap49);
        fibonacciHeap33.meld(fibonacciHeap37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap37.insert((int) (byte) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode59 = fibonacciHeap37.new HeapNode(7);
        int int60 = fibonacciHeap37.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap37.insert(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode62);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int15 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap17.insert(0);
        fibonacciHeap14.delete(heapNode20);
        fibonacciHeap4.meld(fibonacciHeap14);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap14.new HeapNode(32);
        int int25 = fibonacciHeap14.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        int[] intArray29 = fibonacciHeap27.countersRep();
        int int30 = fibonacciHeap27.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap27.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap27.insert(100);
        int int35 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap27.insert((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap14.delete(heapNode37);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        fibonacciHeap4.deleteMin();
        int[] intArray8 = fibonacciHeap4.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode12 = fibonacciHeap10.new HeapNode((int) (short) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap10.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode15 = fibonacciHeap10.insert(97);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap16.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap20.meld(fibonacciHeap23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap20.meld(fibonacciHeap26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        fibonacciHeap32.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap32.new HeapNode(0);
        fibonacciHeap20.meld(fibonacciHeap32);
        int[] intArray38 = fibonacciHeap20.countersRep();
        fibonacciHeap16.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap16.new HeapNode((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap16.insert(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int46 = fibonacciHeap45.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap48.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int53 = fibonacciHeap52.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap55.insert(0);
        fibonacciHeap52.delete(heapNode58);
        fibonacciHeap48.delete(heapNode58);
        heapNode58.key = ' ';
        int int63 = heapNode58.getKey();
        fibonacciHeap45.delete(heapNode58);
        heapNode58.key = '4';
        fibonacciHeap16.delete(heapNode58);
        int int68 = heapNode58.getKey();
        fibonacciHeap10.delete(heapNode58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode58);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode4 = fibonacciHeap1.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int7 = fibonacciHeap6.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap6.meld(fibonacciHeap9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap6.meld(fibonacciHeap12);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap15.meld(fibonacciHeap18);
        fibonacciHeap18.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap18.new HeapNode(0);
        fibonacciHeap6.meld(fibonacciHeap18);
        int[] intArray24 = fibonacciHeap18.countersRep();
        boolean boolean25 = fibonacciHeap18.empty();
        fibonacciHeap1.meld(fibonacciHeap18);
        fibonacciHeap18.deleteMin();
        fibonacciHeap18.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int31 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap30.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap30.insert((int) (short) -1);
        int int36 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap30.insert(100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap30.insert((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap18.delete(heapNode40);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(97);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int5 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap7.insert(0);
        fibonacciHeap4.delete(heapNode10);
        heapNode10.key = (short) 1;
        int int14 = heapNode10.getKey();
        int int15 = heapNode10.key;
        int int16 = heapNode10.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap1.new HeapNode((int) (short) 0);
        int int8 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode15 = fibonacciHeap13.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap20.insert(0);
        fibonacciHeap17.delete(heapNode23);
        fibonacciHeap13.delete(heapNode23);
        fibonacciHeap10.delete(heapNode23);
        fibonacciHeap1.delete(heapNode23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int36 = fibonacciHeap35.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap35.meld(fibonacciHeap38);
        fibonacciHeap32.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode42 = fibonacciHeap38.new HeapNode((int) (byte) 100);
        int[] intArray43 = fibonacciHeap38.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap38.new HeapNode(35);
        fibonacciHeap1.delete(heapNode45);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int51 = fibonacciHeap50.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap50.insert(0);
        int int54 = heapNode53.key;
        fibonacciHeap48.delete(heapNode53);
        heapNode53.key = (byte) 10;
        int int58 = heapNode53.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode53);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        int int20 = fibonacciHeap13.size();
        int int21 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap13.new HeapNode((int) '4');
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap26.meld(fibonacciHeap29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap26.meld(fibonacciHeap32);
        int int34 = fibonacciHeap32.potential();
        int int35 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int38 = fibonacciHeap37.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap37.meld(fibonacciHeap40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap37.meld(fibonacciHeap43);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        fibonacciHeap49.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap49.new HeapNode(0);
        fibonacciHeap37.meld(fibonacciHeap49);
        int[] intArray55 = fibonacciHeap49.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap49.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap49.new HeapNode(32);
        fibonacciHeap32.delete(heapNode58);
        boolean boolean60 = fibonacciHeap32.empty();
        fibonacciHeap32.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode63 = fibonacciHeap32.insert((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode63);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(52);
        boolean boolean2 = fibonacciHeap1.empty();
        int int3 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int6 = fibonacciHeap5.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap5.meld(fibonacciHeap8);
        fibonacciHeap8.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode12 = fibonacciHeap8.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap8.insert((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode15 = fibonacciHeap8.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap8.findMin();
        fibonacciHeap1.meld(fibonacciHeap8);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap20.meld(fibonacciHeap23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap26.meld(fibonacciHeap29);
        fibonacciHeap23.meld(fibonacciHeap29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap23.new HeapNode((int) (short) 10);
        heapNode33.key = 2;
        int int36 = heapNode33.getKey();
        int int37 = heapNode33.key;
        heapNode33.key = (-1);
        heapNode33.key = (short) 0;
        fibonacciHeap1.delete(heapNode33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int45 = fibonacciHeap44.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap44.meld(fibonacciHeap47);
        int int49 = fibonacciHeap44.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap44.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode50);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap4.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap11.insert(0);
        fibonacciHeap8.delete(heapNode14);
        fibonacciHeap4.delete(heapNode14);
        fibonacciHeap1.delete(heapNode14);
        int[] intArray18 = fibonacciHeap1.countersRep();
        int int19 = fibonacciHeap1.size();
        int[] intArray20 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap22.meld(fibonacciHeap25);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int29 = fibonacciHeap28.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap28.meld(fibonacciHeap31);
        fibonacciHeap25.meld(fibonacciHeap31);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int36 = fibonacciHeap35.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap38.insert(0);
        fibonacciHeap35.delete(heapNode41);
        fibonacciHeap25.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap35.new HeapNode(32);
        heapNode45.key = 'a';
        int int48 = heapNode45.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode45);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        int int6 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap8.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode(0);
        fibonacciHeap12.meld(fibonacciHeap24);
        int[] intArray30 = fibonacciHeap12.countersRep();
        fibonacciHeap8.meld(fibonacciHeap12);
        fibonacciHeap1.meld(fibonacciHeap8);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap34.meld(fibonacciHeap37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap34.meld(fibonacciHeap40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int44 = fibonacciHeap43.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap43.meld(fibonacciHeap46);
        fibonacciHeap46.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap46.new HeapNode(0);
        fibonacciHeap34.meld(fibonacciHeap46);
        int[] intArray52 = fibonacciHeap46.countersRep();
        boolean boolean53 = fibonacciHeap46.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap46.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap57 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap57.findMin();
        int int59 = heapNode58.key;
        fibonacciHeap46.delete(heapNode58);
        fibonacciHeap1.delete(heapNode58);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap63 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int64 = fibonacciHeap63.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode65 = fibonacciHeap63.findMin();
        fibonacciHeap63.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode68 = fibonacciHeap63.new HeapNode((int) (byte) 10);
        fibonacciHeap1.meld(fibonacciHeap63);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap71 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int72 = fibonacciHeap71.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode73 = fibonacciHeap71.findMin();
        fibonacciHeap71.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode76 = fibonacciHeap71.new HeapNode((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap63.delete(heapNode76);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        boolean boolean20 = fibonacciHeap13.empty();
        fibonacciHeap13.deleteMin();
        int int22 = fibonacciHeap13.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap13.findMin();
        fibonacciHeap13.deleteMin();
        int int25 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap27.new HeapNode((int) (short) 0);
        fibonacciHeap27.deleteMin();
        boolean boolean35 = fibonacciHeap27.empty();
        int int36 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap38.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int45 = fibonacciHeap44.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap44.meld(fibonacciHeap47);
        fibonacciHeap41.meld(fibonacciHeap47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap51 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int52 = fibonacciHeap51.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap54 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int55 = fibonacciHeap54.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap54.insert(0);
        fibonacciHeap51.delete(heapNode57);
        fibonacciHeap41.meld(fibonacciHeap51);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode61 = fibonacciHeap41.new HeapNode(52);
        int int62 = heapNode61.getKey();
        fibonacciHeap27.delete(heapNode61);
        int int64 = heapNode61.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode61);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap1.new HeapNode((int) (short) 0);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        int int15 = fibonacciHeap10.size();
        int[] intArray16 = fibonacciHeap10.countersRep();
        fibonacciHeap1.meld(fibonacciHeap10);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int24 = fibonacciHeap23.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap23.insert(0);
        fibonacciHeap20.delete(heapNode26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode26);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        int int6 = fibonacciHeap1.size();
        boolean boolean7 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int10 = fibonacciHeap9.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap9.meld(fibonacciHeap12);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap15.meld(fibonacciHeap18);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap18.new HeapNode((int) (byte) 100);
        int[] intArray23 = fibonacciHeap18.countersRep();
        int int24 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap18.new HeapNode((-1));
        fibonacciHeap1.meld(fibonacciHeap18);
        fibonacciHeap18.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap32.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap32.new HeapNode(10);
        fibonacciHeap30.delete(heapNode36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap18.delete(heapNode36);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.new HeapNode(10);
        int int6 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        int[] intArray9 = fibonacciHeap8.countersRep();
        fibonacciHeap1.meld(fibonacciHeap8);
        fibonacciHeap8.deleteMin();
        fibonacciHeap8.deleteMin();
        int int13 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap17.meld(fibonacciHeap20);
        fibonacciHeap20.deleteMin();
        int[] intArray23 = fibonacciHeap20.countersRep();
        int int24 = fibonacciHeap20.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap20.new HeapNode(0);
        int int27 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap20.insert((int) (short) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap20.findMin();
        int int31 = heapNode30.key;
        int int32 = heapNode30.key;
        fibonacciHeap15.delete(heapNode30);
        int int34 = heapNode30.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap8.delete(heapNode30);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode4 = fibonacciHeap1.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int7 = fibonacciHeap6.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap6.meld(fibonacciHeap9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap6.meld(fibonacciHeap12);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap15.meld(fibonacciHeap18);
        fibonacciHeap18.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap18.new HeapNode(0);
        fibonacciHeap6.meld(fibonacciHeap18);
        int[] intArray24 = fibonacciHeap18.countersRep();
        boolean boolean25 = fibonacciHeap18.empty();
        fibonacciHeap1.meld(fibonacciHeap18);
        int[] intArray27 = fibonacciHeap18.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap18.new HeapNode(5);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap34.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int42 = fibonacciHeap41.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap41.insert(0);
        fibonacciHeap38.delete(heapNode44);
        fibonacciHeap34.delete(heapNode44);
        heapNode44.key = ' ';
        int int49 = heapNode44.getKey();
        fibonacciHeap31.delete(heapNode44);
        int int51 = fibonacciHeap31.potential();
        boolean boolean52 = fibonacciHeap31.empty();
        fibonacciHeap31.deleteMin();
        fibonacciHeap31.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap31.insert((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap18.delete(heapNode56);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap27.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap34.insert(0);
        fibonacciHeap31.delete(heapNode37);
        fibonacciHeap27.delete(heapNode37);
        fibonacciHeap24.delete(heapNode37);
        fibonacciHeap1.delete(heapNode37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap42.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap46.meld(fibonacciHeap52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap55.meld(fibonacciHeap58);
        fibonacciHeap58.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap58.new HeapNode(0);
        fibonacciHeap46.meld(fibonacciHeap58);
        int[] intArray64 = fibonacciHeap46.countersRep();
        fibonacciHeap42.meld(fibonacciHeap46);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap46.new HeapNode((-1));
        int int68 = heapNode67.getKey();
        fibonacciHeap1.delete(heapNode67);
        int int70 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode71 = fibonacciHeap1.findMin();
        int int72 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap74 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode75 = fibonacciHeap74.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode77 = fibonacciHeap74.insert((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode77);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap0.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int5 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap4.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        fibonacciHeap16.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap16.new HeapNode(0);
        fibonacciHeap4.meld(fibonacciHeap16);
        int[] intArray22 = fibonacciHeap4.countersRep();
        fibonacciHeap0.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap4.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap27.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        fibonacciHeap39.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap39.new HeapNode(0);
        fibonacciHeap27.meld(fibonacciHeap39);
        int[] intArray45 = fibonacciHeap39.countersRep();
        int int46 = fibonacciHeap39.size();
        int int47 = fibonacciHeap39.size();
        fibonacciHeap4.meld(fibonacciHeap39);
        fibonacciHeap4.deleteMin();
        int[] intArray50 = fibonacciHeap4.countersRep();
        boolean boolean51 = fibonacciHeap4.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int54 = fibonacciHeap53.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap56 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap53.meld(fibonacciHeap56);
        fibonacciHeap56.deleteMin();
        int[] intArray59 = fibonacciHeap56.countersRep();
        int int60 = fibonacciHeap56.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap56.new HeapNode(0);
        int int63 = heapNode62.key;
        int int64 = heapNode62.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode62);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        int[] intArray7 = fibonacciHeap4.countersRep();
        int int8 = fibonacciHeap4.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.new HeapNode(0);
        int[] intArray11 = fibonacciHeap4.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap4.new HeapNode((int) '#');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap15.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int20 = fibonacciHeap19.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap22.insert(0);
        fibonacciHeap19.delete(heapNode25);
        fibonacciHeap15.delete(heapNode25);
        boolean boolean28 = fibonacciHeap15.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int31 = fibonacciHeap30.size();
        fibonacciHeap15.meld(fibonacciHeap30);
        int int33 = fibonacciHeap15.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap15.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap15.insert((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode37);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap27.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap34.insert(0);
        fibonacciHeap31.delete(heapNode37);
        fibonacciHeap27.delete(heapNode37);
        fibonacciHeap24.delete(heapNode37);
        fibonacciHeap1.delete(heapNode37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap42.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap46.meld(fibonacciHeap52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap55.meld(fibonacciHeap58);
        fibonacciHeap58.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap58.new HeapNode(0);
        fibonacciHeap46.meld(fibonacciHeap58);
        int[] intArray64 = fibonacciHeap46.countersRep();
        fibonacciHeap42.meld(fibonacciHeap46);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap46.new HeapNode((-1));
        int int68 = heapNode67.getKey();
        fibonacciHeap1.delete(heapNode67);
        int int70 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode71 = fibonacciHeap1.findMin();
        boolean boolean72 = fibonacciHeap1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.deleteMin();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int int19 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        int[] intArray23 = fibonacciHeap21.countersRep();
        int int24 = fibonacciHeap21.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap21.insert(0);
        int int27 = heapNode26.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode26);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        boolean boolean19 = fibonacciHeap13.empty();
        boolean boolean20 = fibonacciHeap13.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap13.findMin();
        int int22 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap13.new HeapNode((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap26.insert(1);
        boolean boolean29 = fibonacciHeap26.empty();
        int int30 = fibonacciHeap26.size();
        int int31 = fibonacciHeap26.size();
        boolean boolean32 = fibonacciHeap26.empty();
        int int33 = fibonacciHeap26.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap26.insert((int) (byte) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int38 = fibonacciHeap37.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap37.meld(fibonacciHeap40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap37.new HeapNode((int) (short) 0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap37.new HeapNode((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode49 = fibonacciHeap47.insert(1);
        boolean boolean50 = fibonacciHeap47.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap47.new HeapNode((int) ' ');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode54 = fibonacciHeap47.new HeapNode((int) '#');
        fibonacciHeap37.delete(heapNode54);
        fibonacciHeap26.delete(heapNode54);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap26.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode60 = fibonacciHeap26.new HeapNode((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode60);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.findMin();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap1.new HeapNode((int) (byte) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap8.meld(fibonacciHeap11);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int15 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap14.meld(fibonacciHeap17);
        fibonacciHeap11.meld(fibonacciHeap17);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap11.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap11.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap24.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode((int) (short) 100);
        fibonacciHeap11.delete(heapNode28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap30.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap34.meld(fibonacciHeap37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap34.meld(fibonacciHeap40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int44 = fibonacciHeap43.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap43.meld(fibonacciHeap46);
        fibonacciHeap46.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap46.new HeapNode(0);
        fibonacciHeap34.meld(fibonacciHeap46);
        int[] intArray52 = fibonacciHeap34.countersRep();
        fibonacciHeap30.meld(fibonacciHeap34);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap30.new HeapNode((int) 'a');
        int int56 = heapNode55.key;
        int int57 = heapNode55.getKey();
        fibonacciHeap11.delete(heapNode55);
        int int59 = heapNode55.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode55);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        boolean boolean20 = fibonacciHeap13.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap13.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap13.insert(100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap26.meld(fibonacciHeap29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap26.meld(fibonacciHeap32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int36 = fibonacciHeap35.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap35.meld(fibonacciHeap38);
        fibonacciHeap38.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode42 = fibonacciHeap38.new HeapNode(0);
        fibonacciHeap26.meld(fibonacciHeap38);
        int[] intArray44 = fibonacciHeap26.countersRep();
        int int45 = fibonacciHeap26.potential();
        fibonacciHeap13.meld(fibonacciHeap26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode48 = fibonacciHeap13.new HeapNode((int) (short) -1);
        int int49 = fibonacciHeap13.size();
        int int50 = fibonacciHeap13.potential();
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int54 = fibonacciHeap53.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap53.insert(0);
        fibonacciHeap53.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int60 = fibonacciHeap59.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap62 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap59.meld(fibonacciHeap62);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap65 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap59.meld(fibonacciHeap65);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap68 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int69 = fibonacciHeap68.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap71 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap68.meld(fibonacciHeap71);
        fibonacciHeap71.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode75 = fibonacciHeap71.new HeapNode(0);
        fibonacciHeap59.meld(fibonacciHeap71);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode78 = fibonacciHeap59.insert((-1));
        fibonacciHeap53.meld(fibonacciHeap59);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode80 = fibonacciHeap53.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode81 = fibonacciHeap53.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode81);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(97);
        fibonacciHeap1.deleteMin();
        boolean boolean3 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int6 = fibonacciHeap5.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap5.meld(fibonacciHeap8);
        fibonacciHeap8.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode12 = fibonacciHeap8.new HeapNode(0);
        int int13 = fibonacciHeap8.size();
        int int14 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap8.new HeapNode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode16);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        int[] intArray7 = fibonacciHeap4.countersRep();
        boolean boolean8 = fibonacciHeap4.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int17 = fibonacciHeap16.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap16.meld(fibonacciHeap19);
        fibonacciHeap13.meld(fibonacciHeap19);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int24 = fibonacciHeap23.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap26.insert(0);
        fibonacciHeap23.delete(heapNode29);
        fibonacciHeap13.meld(fibonacciHeap23);
        fibonacciHeap23.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap23.insert(100);
        int int35 = heapNode34.key;
        heapNode34.key = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode34);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap3.insert(1);
        int int6 = heapNode5.key;
        int int7 = heapNode5.key;
        heapNode5.key = (-1);
        int int10 = heapNode5.getKey();
        fibonacciHeap1.delete(heapNode5);
        int int12 = fibonacciHeap1.size();
        boolean boolean13 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int17 = fibonacciHeap16.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap16.meld(fibonacciHeap19);
        fibonacciHeap19.deleteMin();
        int[] intArray22 = fibonacciHeap19.countersRep();
        int int23 = fibonacciHeap19.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap19.new HeapNode(0);
        boolean boolean26 = fibonacciHeap19.empty();
        fibonacciHeap19.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        fibonacciHeap32.deleteMin();
        int[] intArray35 = fibonacciHeap32.countersRep();
        int int36 = fibonacciHeap32.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap32.new HeapNode(0);
        int int39 = fibonacciHeap32.size();
        int int40 = fibonacciHeap32.size();
        int[] intArray41 = fibonacciHeap32.countersRep();
        int int42 = fibonacciHeap32.potential();
        fibonacciHeap19.meld(fibonacciHeap32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap19.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode45);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap7.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode12 = fibonacciHeap7.new HeapNode(0);
        int int13 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(32);
        boolean boolean16 = fibonacciHeap15.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap15.new HeapNode((int) (byte) -1);
        fibonacciHeap7.delete(heapNode18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap21.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap21.new HeapNode(10);
        int int26 = heapNode25.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap7.delete(heapNode25);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap13.findMin();
        int[] intArray21 = fibonacciHeap13.countersRep();
        boolean boolean22 = fibonacciHeap13.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap27.insert(0);
        fibonacciHeap24.delete(heapNode30);
        heapNode30.key = (short) 1;
        int int34 = heapNode30.key;
        int int35 = heapNode30.key;
        int int36 = heapNode30.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode30);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int6 = fibonacciHeap5.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode11 = fibonacciHeap8.insert(0);
        fibonacciHeap5.delete(heapNode11);
        fibonacciHeap1.delete(heapNode11);
        boolean boolean14 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap1.insert(3);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap18.insert(1);
        int int21 = heapNode20.key;
        int int22 = heapNode20.key;
        heapNode20.key = (-1);
        int int25 = heapNode20.key;
        fibonacciHeap1.delete(heapNode20);
        int[] intArray27 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap29.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap29.new HeapNode((-1));
        fibonacciHeap1.delete(heapNode32);
        int[] intArray34 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap36.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int41 = fibonacciHeap40.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int44 = fibonacciHeap43.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode46 = fibonacciHeap43.insert(0);
        fibonacciHeap40.delete(heapNode46);
        fibonacciHeap36.delete(heapNode46);
        heapNode46.key = ' ';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode46);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap27.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap34.insert(0);
        fibonacciHeap31.delete(heapNode37);
        fibonacciHeap27.delete(heapNode37);
        fibonacciHeap24.delete(heapNode37);
        fibonacciHeap1.delete(heapNode37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap42.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap46.meld(fibonacciHeap52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap55.meld(fibonacciHeap58);
        fibonacciHeap58.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap58.new HeapNode(0);
        fibonacciHeap46.meld(fibonacciHeap58);
        int[] intArray64 = fibonacciHeap46.countersRep();
        fibonacciHeap42.meld(fibonacciHeap46);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap46.new HeapNode((-1));
        int int68 = heapNode67.getKey();
        fibonacciHeap1.delete(heapNode67);
        int int70 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode71 = fibonacciHeap1.findMin();
        boolean boolean72 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode74 = fibonacciHeap1.new HeapNode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.deleteMin();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        int int20 = fibonacciHeap13.size();
        int[] intArray21 = fibonacciHeap13.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap13.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap24.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap24.insert((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode27);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap0.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int5 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap4.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        fibonacciHeap16.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap16.new HeapNode(0);
        fibonacciHeap4.meld(fibonacciHeap16);
        int[] intArray22 = fibonacciHeap4.countersRep();
        fibonacciHeap0.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap4.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap27.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        fibonacciHeap39.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap39.new HeapNode(0);
        fibonacciHeap27.meld(fibonacciHeap39);
        int[] intArray45 = fibonacciHeap39.countersRep();
        int int46 = fibonacciHeap39.size();
        int int47 = fibonacciHeap39.size();
        fibonacciHeap4.meld(fibonacciHeap39);
        fibonacciHeap4.deleteMin();
        int[] intArray50 = fibonacciHeap4.countersRep();
        boolean boolean51 = fibonacciHeap4.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap55.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int60 = fibonacciHeap59.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap62 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int63 = fibonacciHeap62.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode65 = fibonacciHeap62.insert(0);
        fibonacciHeap59.delete(heapNode65);
        fibonacciHeap55.delete(heapNode65);
        boolean boolean68 = fibonacciHeap55.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap70 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int71 = fibonacciHeap70.size();
        fibonacciHeap55.meld(fibonacciHeap70);
        fibonacciHeap53.meld(fibonacciHeap55);
        int int74 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap76 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int77 = fibonacciHeap76.potential();
        fibonacciHeap76.deleteMin();
        int[] intArray79 = fibonacciHeap76.countersRep();
        int int80 = fibonacciHeap76.potential();
        fibonacciHeap55.meld(fibonacciHeap76);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode82 = fibonacciHeap55.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode84 = fibonacciHeap55.new HeapNode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode84);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap0.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int5 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap4.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        fibonacciHeap16.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap16.new HeapNode(0);
        fibonacciHeap4.meld(fibonacciHeap16);
        int[] intArray22 = fibonacciHeap4.countersRep();
        fibonacciHeap0.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap4.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap27.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        fibonacciHeap39.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap39.new HeapNode(0);
        fibonacciHeap27.meld(fibonacciHeap39);
        int[] intArray45 = fibonacciHeap39.countersRep();
        int int46 = fibonacciHeap39.size();
        int int47 = fibonacciHeap39.size();
        fibonacciHeap4.meld(fibonacciHeap39);
        fibonacciHeap4.deleteMin();
        int int50 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap4.findMin();
        boolean boolean52 = fibonacciHeap4.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode54 = fibonacciHeap4.new HeapNode((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap4.new HeapNode((int) (short) 0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        int int59 = fibonacciHeap58.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int62 = fibonacciHeap61.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap64 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap61.meld(fibonacciHeap64);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap67 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int68 = fibonacciHeap67.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap70 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap67.meld(fibonacciHeap70);
        fibonacciHeap64.meld(fibonacciHeap70);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap74 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int75 = fibonacciHeap74.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap77 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int78 = fibonacciHeap77.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode80 = fibonacciHeap77.insert(0);
        fibonacciHeap74.delete(heapNode80);
        fibonacciHeap64.meld(fibonacciHeap74);
        fibonacciHeap74.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode85 = fibonacciHeap74.insert(100);
        fibonacciHeap58.meld(fibonacciHeap74);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode88 = fibonacciHeap58.new HeapNode(100);
        int int89 = heapNode88.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode88);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 100);
        fibonacciHeap1.deleteMin();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int6 = fibonacciHeap5.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap5.meld(fibonacciHeap8);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap5.meld(fibonacciHeap11);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int15 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap14.meld(fibonacciHeap17);
        fibonacciHeap17.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap17.new HeapNode(0);
        fibonacciHeap5.meld(fibonacciHeap17);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int25 = fibonacciHeap24.size();
        fibonacciHeap5.meld(fibonacciHeap24);
        int int27 = fibonacciHeap24.size();
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap24.new HeapNode((int) (short) -1);
        int int31 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap24.insert(7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap24.new HeapNode(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode35);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        int[] intArray7 = fibonacciHeap4.countersRep();
        int int8 = fibonacciHeap4.potential();
        int int9 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap11.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int19 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap18.insert(0);
        fibonacciHeap15.delete(heapNode21);
        fibonacciHeap11.delete(heapNode21);
        boolean boolean24 = fibonacciHeap11.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        fibonacciHeap11.meld(fibonacciHeap26);
        int int29 = fibonacciHeap11.size();
        boolean boolean30 = fibonacciHeap11.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int33 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap32.insert(0);
        fibonacciHeap32.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap38.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap38.meld(fibonacciHeap44);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int48 = fibonacciHeap47.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap47.meld(fibonacciHeap50);
        fibonacciHeap50.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode54 = fibonacciHeap50.new HeapNode(0);
        fibonacciHeap38.meld(fibonacciHeap50);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap38.insert((-1));
        fibonacciHeap32.meld(fibonacciHeap38);
        fibonacciHeap11.meld(fibonacciHeap32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode63 = fibonacciHeap61.new HeapNode(0);
        fibonacciHeap61.deleteMin();
        fibonacciHeap11.meld(fibonacciHeap61);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap11.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap69 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int70 = fibonacciHeap69.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap72 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap69.meld(fibonacciHeap72);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap75 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap69.meld(fibonacciHeap75);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap78 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int79 = fibonacciHeap78.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap81 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap78.meld(fibonacciHeap81);
        fibonacciHeap81.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode85 = fibonacciHeap81.new HeapNode(0);
        fibonacciHeap69.meld(fibonacciHeap81);
        int[] intArray87 = fibonacciHeap69.countersRep();
        int int88 = fibonacciHeap69.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode89 = fibonacciHeap69.findMin();
        int int90 = fibonacciHeap69.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode92 = fibonacciHeap69.new HeapNode(3);
        int int93 = heapNode92.key;
        fibonacciHeap11.delete(heapNode92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode92);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap13.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap13.new HeapNode(32);
        int int23 = fibonacciHeap13.potential();
        int int24 = fibonacciHeap13.potential();
        boolean boolean25 = fibonacciHeap13.empty();
        int[] intArray26 = fibonacciHeap13.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap28.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode31 = fibonacciHeap28.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode31);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode11 = fibonacciHeap1.new HeapNode((int) '4');
        boolean boolean12 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int15 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap14.meld(fibonacciHeap17);
        fibonacciHeap17.deleteMin();
        int[] intArray20 = fibonacciHeap17.countersRep();
        int int21 = fibonacciHeap17.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap17.new HeapNode(0);
        int int24 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap17.insert((int) (short) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap17.findMin();
        int int28 = heapNode27.getKey();
        heapNode27.key = 9;
        heapNode27.key = (short) -1;
        fibonacciHeap1.delete(heapNode27);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap1.findMin();
        int int35 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int38 = fibonacciHeap37.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap37.meld(fibonacciHeap40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap37.meld(fibonacciHeap43);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        fibonacciHeap49.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap49.new HeapNode(0);
        fibonacciHeap37.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap56 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int57 = fibonacciHeap56.size();
        fibonacciHeap37.meld(fibonacciHeap56);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap60 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap37.meld(fibonacciHeap60);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode63 = fibonacciHeap37.insert((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode65 = fibonacciHeap37.new HeapNode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode65);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap3.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap7.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int17 = fibonacciHeap16.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap16.meld(fibonacciHeap19);
        fibonacciHeap19.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap19.new HeapNode(0);
        fibonacciHeap7.meld(fibonacciHeap19);
        int[] intArray25 = fibonacciHeap7.countersRep();
        fibonacciHeap3.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap7.new HeapNode((-1));
        heapNode28.key = 100;
        fibonacciHeap1.delete(heapNode28);
        int[] intArray32 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap33.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int38 = fibonacciHeap37.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap37.meld(fibonacciHeap40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap37.meld(fibonacciHeap43);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        fibonacciHeap49.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap49.new HeapNode(0);
        fibonacciHeap37.meld(fibonacciHeap49);
        int[] intArray55 = fibonacciHeap37.countersRep();
        fibonacciHeap33.meld(fibonacciHeap37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap37.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode60 = fibonacciHeap37.new HeapNode((int) '#');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap37.new HeapNode((int) (short) 1);
        int int63 = heapNode62.getKey();
        heapNode62.key = (byte) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode62);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        int int6 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap8.meld(fibonacciHeap11);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap8.meld(fibonacciHeap14);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap17.meld(fibonacciHeap20);
        fibonacciHeap20.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap20.new HeapNode(0);
        fibonacciHeap8.meld(fibonacciHeap20);
        int[] intArray26 = fibonacciHeap20.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap20.findMin();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap20.new HeapNode(6);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap31.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int36 = fibonacciHeap35.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap35.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap35.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int45 = fibonacciHeap44.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap44.meld(fibonacciHeap47);
        fibonacciHeap47.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap47.new HeapNode(0);
        fibonacciHeap35.meld(fibonacciHeap47);
        int[] intArray53 = fibonacciHeap35.countersRep();
        fibonacciHeap31.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap35.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap35.new HeapNode((int) '#');
        int int59 = fibonacciHeap35.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int62 = fibonacciHeap61.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap64 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap61.meld(fibonacciHeap64);
        int int66 = fibonacciHeap61.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap61.findMin();
        int int68 = heapNode67.getKey();
        fibonacciHeap35.delete(heapNode67);
        heapNode67.key = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap20.delete(heapNode67);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap1.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        fibonacciHeap30.deleteMin();
        int[] intArray33 = fibonacciHeap30.countersRep();
        int int34 = fibonacciHeap30.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap30.new HeapNode(0);
        fibonacciHeap24.delete(heapNode36);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int40 = fibonacciHeap39.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap39.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap39.meld(fibonacciHeap45);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int49 = fibonacciHeap48.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap51 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap48.meld(fibonacciHeap51);
        fibonacciHeap51.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap51.new HeapNode(0);
        fibonacciHeap39.meld(fibonacciHeap51);
        int[] intArray57 = fibonacciHeap51.countersRep();
        int int58 = fibonacciHeap51.size();
        int int59 = fibonacciHeap51.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode61 = fibonacciHeap51.new HeapNode((int) '4');
        int int62 = heapNode61.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap24.delete(heapNode61);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode4 = fibonacciHeap1.insert(0);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap7.insert(1);
        int int10 = heapNode9.key;
        int int11 = heapNode9.key;
        fibonacciHeap1.delete(heapNode9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int15 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap14.meld(fibonacciHeap17);
        int int19 = fibonacciHeap14.size();
        fibonacciHeap1.meld(fibonacciHeap14);
        fibonacciHeap1.deleteMin();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap25.meld(fibonacciHeap28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode31 = fibonacciHeap25.new HeapNode((int) (short) 0);
        fibonacciHeap25.deleteMin();
        boolean boolean33 = fibonacciHeap25.empty();
        int int34 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int43 = fibonacciHeap42.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap42.meld(fibonacciHeap45);
        fibonacciHeap39.meld(fibonacciHeap45);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int50 = fibonacciHeap49.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int53 = fibonacciHeap52.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap52.insert(0);
        fibonacciHeap49.delete(heapNode55);
        fibonacciHeap39.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode59 = fibonacciHeap39.new HeapNode(52);
        int int60 = heapNode59.getKey();
        fibonacciHeap25.delete(heapNode59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode59);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap1.deleteMin();
        fibonacciHeap1.deleteMin();
        fibonacciHeap1.deleteMin();
        int int5 = fibonacciHeap1.potential();
        int[] intArray6 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode11 = fibonacciHeap9.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap9.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        fibonacciHeap9.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode19 = fibonacciHeap15.insert((int) (byte) 0);
        heapNode19.key = 8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode19);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap1.new HeapNode((int) (short) 0);
        int int8 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode15 = fibonacciHeap13.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap20.insert(0);
        fibonacciHeap17.delete(heapNode23);
        fibonacciHeap13.delete(heapNode23);
        fibonacciHeap10.delete(heapNode23);
        fibonacciHeap1.delete(heapNode23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int36 = fibonacciHeap35.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap35.meld(fibonacciHeap38);
        fibonacciHeap32.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode42 = fibonacciHeap38.new HeapNode((int) (byte) 100);
        int[] intArray43 = fibonacciHeap38.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap38.new HeapNode(35);
        fibonacciHeap1.delete(heapNode45);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap48.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int53 = fibonacciHeap52.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap55.insert(0);
        fibonacciHeap52.delete(heapNode58);
        fibonacciHeap48.delete(heapNode58);
        boolean boolean61 = fibonacciHeap48.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode63 = fibonacciHeap48.insert(3);
        int int64 = heapNode63.getKey();
        int int65 = heapNode63.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode63);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap4.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap11.insert(0);
        fibonacciHeap8.delete(heapNode14);
        fibonacciHeap4.delete(heapNode14);
        heapNode14.key = ' ';
        int int19 = heapNode14.getKey();
        fibonacciHeap1.delete(heapNode14);
        int int21 = fibonacciHeap1.potential();
        boolean boolean22 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap1.insert((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap26.deleteMin();
        fibonacciHeap26.deleteMin();
        boolean boolean29 = fibonacciHeap26.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode31 = fibonacciHeap26.insert(100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap26.findMin();
        fibonacciHeap1.delete(heapNode32);
        int[] intArray34 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap36.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int42 = fibonacciHeap41.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap41.meld(fibonacciHeap44);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap41.meld(fibonacciHeap47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int51 = fibonacciHeap50.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap50.meld(fibonacciHeap53);
        fibonacciHeap53.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap53.new HeapNode(0);
        fibonacciHeap41.meld(fibonacciHeap53);
        int[] intArray59 = fibonacciHeap53.countersRep();
        boolean boolean60 = fibonacciHeap53.empty();
        fibonacciHeap36.meld(fibonacciHeap53);
        int[] intArray62 = fibonacciHeap53.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode64 = fibonacciHeap53.new HeapNode(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode64);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap13.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap22.meld(fibonacciHeap25);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap22.meld(fibonacciHeap28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap31.meld(fibonacciHeap34);
        fibonacciHeap34.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap34.new HeapNode(0);
        fibonacciHeap22.meld(fibonacciHeap34);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int42 = fibonacciHeap41.size();
        fibonacciHeap22.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap22.meld(fibonacciHeap45);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int49 = fibonacciHeap48.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap48.insert(0);
        fibonacciHeap48.deleteMin();
        fibonacciHeap45.meld(fibonacciHeap48);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap45.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap45.findMin();
        int[] intArray57 = fibonacciHeap45.countersRep();
        int[] intArray58 = fibonacciHeap45.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap60 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int61 = fibonacciHeap60.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap60.findMin();
        int int63 = fibonacciHeap60.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap64 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode66 = fibonacciHeap64.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode68 = fibonacciHeap64.new HeapNode((int) (short) 100);
        boolean boolean69 = fibonacciHeap64.empty();
        fibonacciHeap60.meld(fibonacciHeap64);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode71 = fibonacciHeap60.findMin();
        int int72 = fibonacciHeap60.size();
        fibonacciHeap45.meld(fibonacciHeap60);
        int int74 = fibonacciHeap45.potential();
        int[] intArray75 = fibonacciHeap45.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode76 = fibonacciHeap45.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode76);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap4.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int17 = fibonacciHeap16.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap16.meld(fibonacciHeap19);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap16.meld(fibonacciHeap22);
        fibonacciHeap4.meld(fibonacciHeap16);
        int int25 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap4.insert(10);
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int31 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap30.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap30.meld(fibonacciHeap36);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int40 = fibonacciHeap39.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap39.meld(fibonacciHeap42);
        fibonacciHeap42.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode46 = fibonacciHeap42.new HeapNode(0);
        fibonacciHeap30.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode48 = fibonacciHeap30.findMin();
        int[] intArray49 = fibonacciHeap30.countersRep();
        fibonacciHeap30.deleteMin();
        fibonacciHeap4.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap30.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap55.meld(fibonacciHeap58);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap55.meld(fibonacciHeap61);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap64 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int65 = fibonacciHeap64.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap67 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap64.meld(fibonacciHeap67);
        fibonacciHeap67.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode71 = fibonacciHeap67.new HeapNode(0);
        fibonacciHeap55.meld(fibonacciHeap67);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap74 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int75 = fibonacciHeap74.size();
        fibonacciHeap55.meld(fibonacciHeap74);
        int int77 = fibonacciHeap74.size();
        fibonacciHeap74.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode80 = fibonacciHeap74.new HeapNode((int) (short) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode82 = fibonacciHeap74.insert(1);
        int int83 = heapNode82.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap30.delete(heapNode82);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        boolean boolean7 = fibonacciHeap4.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap4.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap10.meld(fibonacciHeap16);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int20 = fibonacciHeap19.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap19.meld(fibonacciHeap22);
        fibonacciHeap22.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap22.new HeapNode(0);
        fibonacciHeap10.meld(fibonacciHeap22);
        int[] intArray28 = fibonacciHeap10.countersRep();
        int int29 = fibonacciHeap10.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap34.insert(0);
        fibonacciHeap31.delete(heapNode37);
        fibonacciHeap10.meld(fibonacciHeap31);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap31.new HeapNode(2);
        heapNode41.key = (byte) 10;
        heapNode41.key = 5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode41);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap4.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.insert((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode(0);
        fibonacciHeap12.meld(fibonacciHeap24);
        int[] intArray30 = fibonacciHeap24.countersRep();
        boolean boolean31 = fibonacciHeap24.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap24.insert((int) (byte) 100);
        int[] intArray34 = fibonacciHeap24.countersRep();
        fibonacciHeap4.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int38 = fibonacciHeap37.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap37.findMin();
        fibonacciHeap37.deleteMin();
        fibonacciHeap24.meld(fibonacciHeap37);
        int[] intArray42 = fibonacciHeap37.countersRep();
        int int43 = fibonacciHeap37.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode46 = fibonacciHeap45.findMin();
        int int47 = heapNode46.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap37.delete(heapNode46);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap3.insert(1);
        int int6 = heapNode5.key;
        int int7 = heapNode5.key;
        heapNode5.key = (-1);
        int int10 = heapNode5.getKey();
        fibonacciHeap1.delete(heapNode5);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int20 = fibonacciHeap19.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap19.meld(fibonacciHeap22);
        fibonacciHeap16.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap22.new HeapNode((int) (byte) 100);
        int[] intArray27 = fibonacciHeap22.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap29.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap38.meld(fibonacciHeap41);
        fibonacciHeap41.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap41.new HeapNode(0);
        fibonacciHeap29.meld(fibonacciHeap41);
        int[] intArray47 = fibonacciHeap41.countersRep();
        boolean boolean48 = fibonacciHeap41.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap41.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap41.insert(100);
        fibonacciHeap22.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap55.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode59 = fibonacciHeap55.new HeapNode(10);
        heapNode59.key = 100;
        int int62 = heapNode59.getKey();
        fibonacciHeap22.delete(heapNode59);
        fibonacciHeap1.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode66 = fibonacciHeap22.new HeapNode(35);
        int[] intArray67 = fibonacciHeap22.countersRep();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap22.deleteMin();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        int int23 = fibonacciHeap20.size();
        fibonacciHeap20.deleteMin();
        fibonacciHeap20.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap27.new HeapNode((int) (short) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap27.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap27.insert(97);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap33.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int38 = fibonacciHeap37.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap37.meld(fibonacciHeap40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap37.meld(fibonacciHeap43);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        fibonacciHeap49.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap49.new HeapNode(0);
        fibonacciHeap37.meld(fibonacciHeap49);
        int[] intArray55 = fibonacciHeap37.countersRep();
        fibonacciHeap33.meld(fibonacciHeap37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap33.new HeapNode((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode60 = fibonacciHeap33.insert(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap62 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int63 = fibonacciHeap62.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap65 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap65.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap69 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int70 = fibonacciHeap69.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap72 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int73 = fibonacciHeap72.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode75 = fibonacciHeap72.insert(0);
        fibonacciHeap69.delete(heapNode75);
        fibonacciHeap65.delete(heapNode75);
        heapNode75.key = ' ';
        int int80 = heapNode75.getKey();
        fibonacciHeap62.delete(heapNode75);
        heapNode75.key = '4';
        fibonacciHeap33.delete(heapNode75);
        int int85 = heapNode75.getKey();
        fibonacciHeap27.delete(heapNode75);
        int int87 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode89 = fibonacciHeap27.insert(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap20.delete(heapNode89);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap3.insert(1);
        int int6 = heapNode5.key;
        int int7 = heapNode5.key;
        heapNode5.key = (-1);
        int int10 = heapNode5.getKey();
        fibonacciHeap1.delete(heapNode5);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int20 = fibonacciHeap19.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap19.meld(fibonacciHeap22);
        fibonacciHeap16.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap22.new HeapNode((int) (byte) 100);
        int[] intArray27 = fibonacciHeap22.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap29.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap38.meld(fibonacciHeap41);
        fibonacciHeap41.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap41.new HeapNode(0);
        fibonacciHeap29.meld(fibonacciHeap41);
        int[] intArray47 = fibonacciHeap41.countersRep();
        boolean boolean48 = fibonacciHeap41.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap41.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap41.insert(100);
        fibonacciHeap22.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap55.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode59 = fibonacciHeap55.new HeapNode(10);
        heapNode59.key = 100;
        int int62 = heapNode59.getKey();
        fibonacciHeap22.delete(heapNode59);
        fibonacciHeap1.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode66 = fibonacciHeap1.new HeapNode((int) (short) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap68 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int69 = fibonacciHeap68.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap71 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap68.meld(fibonacciHeap71);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode74 = fibonacciHeap68.new HeapNode((int) (short) 0);
        int int75 = fibonacciHeap68.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode77 = fibonacciHeap68.insert(0);
        int int78 = heapNode77.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode77);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        boolean boolean20 = fibonacciHeap13.empty();
        fibonacciHeap13.deleteMin();
        int int22 = fibonacciHeap13.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap24.meld(fibonacciHeap27);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap24.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int34 = fibonacciHeap33.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap33.meld(fibonacciHeap36);
        fibonacciHeap36.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap36.new HeapNode(0);
        fibonacciHeap24.meld(fibonacciHeap36);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int44 = fibonacciHeap43.size();
        fibonacciHeap36.meld(fibonacciHeap43);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int48 = fibonacciHeap47.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap47.meld(fibonacciHeap50);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap47.meld(fibonacciHeap53);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap56 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int57 = fibonacciHeap56.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap56.meld(fibonacciHeap59);
        fibonacciHeap59.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode63 = fibonacciHeap59.new HeapNode(0);
        fibonacciHeap47.meld(fibonacciHeap59);
        fibonacciHeap43.meld(fibonacciHeap47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap67 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode69 = fibonacciHeap67.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap71 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int72 = fibonacciHeap71.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap74 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int75 = fibonacciHeap74.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode77 = fibonacciHeap74.insert(0);
        fibonacciHeap71.delete(heapNode77);
        fibonacciHeap67.delete(heapNode77);
        boolean boolean80 = fibonacciHeap67.empty();
        fibonacciHeap43.meld(fibonacciHeap67);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode83 = fibonacciHeap43.insert(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode83);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        int int2 = fibonacciHeap1.potential();
        int int3 = fibonacciHeap1.size();
        int[] intArray4 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        int int7 = fibonacciHeap6.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int10 = fibonacciHeap9.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap9.meld(fibonacciHeap12);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap15.meld(fibonacciHeap18);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap25.insert(0);
        fibonacciHeap22.delete(heapNode28);
        fibonacciHeap12.meld(fibonacciHeap22);
        fibonacciHeap22.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap22.insert(100);
        fibonacciHeap6.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap6.new HeapNode(100);
        int int37 = heapNode36.key;
        fibonacciHeap1.delete(heapNode36);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int41 = fibonacciHeap40.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap40.meld(fibonacciHeap43);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap40.meld(fibonacciHeap46);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int50 = fibonacciHeap49.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap49.meld(fibonacciHeap52);
        fibonacciHeap52.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap52.new HeapNode(0);
        fibonacciHeap40.meld(fibonacciHeap52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int60 = fibonacciHeap59.size();
        fibonacciHeap40.meld(fibonacciHeap59);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap63 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap40.meld(fibonacciHeap63);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap66 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int67 = fibonacciHeap66.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap69 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap66.meld(fibonacciHeap69);
        fibonacciHeap69.deleteMin();
        int[] intArray72 = fibonacciHeap69.countersRep();
        int int73 = fibonacciHeap69.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode75 = fibonacciHeap69.new HeapNode(0);
        fibonacciHeap63.delete(heapNode75);
        fibonacciHeap1.meld(fibonacciHeap63);
        int int78 = fibonacciHeap63.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap80 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int81 = fibonacciHeap80.size();
        fibonacciHeap80.deleteMin();
        fibonacciHeap80.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode85 = fibonacciHeap80.new HeapNode((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap63.delete(heapNode85);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap1.deleteMin();
        int int3 = fibonacciHeap1.size();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap1.new HeapNode(2);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap8.meld(fibonacciHeap11);
        int int13 = fibonacciHeap8.size();
        int[] intArray14 = fibonacciHeap8.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap16.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int24 = fibonacciHeap23.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap23.insert(0);
        fibonacciHeap20.delete(heapNode26);
        fibonacciHeap16.delete(heapNode26);
        heapNode26.key = ' ';
        fibonacciHeap8.delete(heapNode26);
        heapNode26.key = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode26);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.new HeapNode(0);
        fibonacciHeap1.deleteMin();
        boolean boolean5 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(52);
        boolean boolean9 = fibonacciHeap8.empty();
        int int10 = fibonacciHeap8.potential();
        int int11 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap8.new HeapNode(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap1.deleteMin();
        fibonacciHeap1.deleteMin();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap1.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap1.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap11.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int19 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap18.insert(0);
        fibonacciHeap15.delete(heapNode21);
        fibonacciHeap11.delete(heapNode21);
        boolean boolean24 = fibonacciHeap11.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        fibonacciHeap11.meld(fibonacciHeap26);
        int int29 = fibonacciHeap11.potential();
        fibonacciHeap11.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap11.new HeapNode((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap11.insert((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode34);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.findMin();
        int int4 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap5.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap5.new HeapNode((int) (short) 100);
        boolean boolean10 = fibonacciHeap5.empty();
        fibonacciHeap1.meld(fibonacciHeap5);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode15 = fibonacciHeap13.insert(1);
        int int16 = heapNode15.key;
        heapNode15.key = 10;
        int int19 = heapNode15.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap5.delete(heapNode15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap3.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap7.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int17 = fibonacciHeap16.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap16.meld(fibonacciHeap19);
        fibonacciHeap19.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap19.new HeapNode(0);
        fibonacciHeap7.meld(fibonacciHeap19);
        int[] intArray25 = fibonacciHeap7.countersRep();
        fibonacciHeap3.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap7.new HeapNode((-1));
        heapNode28.key = 100;
        fibonacciHeap1.delete(heapNode28);
        int[] intArray32 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap34.meld(fibonacciHeap37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap34.meld(fibonacciHeap40);
        int int42 = fibonacciHeap40.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap40.new HeapNode((int) '#');
        int int45 = fibonacciHeap40.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int48 = fibonacciHeap47.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap47.meld(fibonacciHeap50);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap47.meld(fibonacciHeap53);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap56 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int57 = fibonacciHeap56.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap56.meld(fibonacciHeap59);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap62 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int63 = fibonacciHeap62.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap65 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap62.meld(fibonacciHeap65);
        fibonacciHeap59.meld(fibonacciHeap65);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode69 = fibonacciHeap59.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode71 = fibonacciHeap59.new HeapNode(0);
        fibonacciHeap47.delete(heapNode71);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode73 = fibonacciHeap47.findMin();
        fibonacciHeap40.delete(heapNode73);
        int int75 = heapNode73.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode73);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        boolean boolean20 = fibonacciHeap13.empty();
        fibonacciHeap13.deleteMin();
        int int22 = fibonacciHeap13.potential();
        fibonacciHeap13.deleteMin();
        int int24 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap26.meld(fibonacciHeap29);
        boolean boolean31 = fibonacciHeap29.empty();
        int int32 = fibonacciHeap29.size();
        int int33 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap35.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int40 = fibonacciHeap39.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int43 = fibonacciHeap42.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap42.insert(0);
        fibonacciHeap39.delete(heapNode45);
        fibonacciHeap35.delete(heapNode45);
        heapNode45.key = ' ';
        int int50 = heapNode45.getKey();
        int int51 = heapNode45.key;
        heapNode45.key = 0;
        int int54 = heapNode45.key;
        fibonacciHeap29.delete(heapNode45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode45);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap4.new HeapNode((int) (short) 10);
        int int15 = fibonacciHeap4.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap4.insert(97);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap19.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int24 = fibonacciHeap23.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap26.insert(0);
        fibonacciHeap23.delete(heapNode29);
        fibonacciHeap19.delete(heapNode29);
        boolean boolean32 = fibonacciHeap19.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap19.insert(3);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap36.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int42 = fibonacciHeap41.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap41.meld(fibonacciHeap44);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap41.meld(fibonacciHeap47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int51 = fibonacciHeap50.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap50.meld(fibonacciHeap53);
        fibonacciHeap53.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap53.new HeapNode(0);
        fibonacciHeap41.meld(fibonacciHeap53);
        int[] intArray59 = fibonacciHeap53.countersRep();
        boolean boolean60 = fibonacciHeap53.empty();
        fibonacciHeap36.meld(fibonacciHeap53);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap36.findMin();
        fibonacciHeap19.delete(heapNode62);
        fibonacciHeap4.delete(heapNode62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.deleteMin();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        boolean boolean19 = fibonacciHeap13.empty();
        boolean boolean20 = fibonacciHeap13.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap13.findMin();
        int int22 = fibonacciHeap13.size();
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap25.insert(1);
        boolean boolean28 = fibonacciHeap25.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int31 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int34 = fibonacciHeap33.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap33.insert(0);
        fibonacciHeap30.delete(heapNode36);
        heapNode36.key = (short) 1;
        fibonacciHeap25.delete(heapNode36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode36);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        int int9 = fibonacciHeap7.potential();
        int int10 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode(0);
        fibonacciHeap12.meld(fibonacciHeap24);
        int[] intArray30 = fibonacciHeap24.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode31 = fibonacciHeap24.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap24.new HeapNode(32);
        fibonacciHeap7.delete(heapNode33);
        boolean boolean35 = fibonacciHeap7.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int38 = fibonacciHeap37.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap37.meld(fibonacciHeap40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap37.meld(fibonacciHeap43);
        int int45 = fibonacciHeap43.potential();
        int int46 = fibonacciHeap43.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode49 = fibonacciHeap47.new HeapNode((int) '#');
        fibonacciHeap43.delete(heapNode49);
        int int51 = fibonacciHeap43.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap43.new HeapNode((int) 'a');
        heapNode53.key = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap7.delete(heapNode53);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap1.countersRep();
        int int20 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap25.insert(0);
        fibonacciHeap22.delete(heapNode28);
        fibonacciHeap1.meld(fibonacciHeap22);
        boolean boolean31 = fibonacciHeap22.empty();
        fibonacciHeap22.deleteMin();
        boolean boolean33 = fibonacciHeap22.empty();
        boolean boolean34 = fibonacciHeap22.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap36.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int46 = fibonacciHeap45.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap45.meld(fibonacciHeap48);
        fibonacciHeap48.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap48.new HeapNode(0);
        fibonacciHeap36.meld(fibonacciHeap48);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int56 = fibonacciHeap55.size();
        fibonacciHeap36.meld(fibonacciHeap55);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap36.meld(fibonacciHeap59);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap59.new HeapNode(0);
        int int63 = heapNode62.key;
        int int64 = heapNode62.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap22.delete(heapNode62);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        int int9 = fibonacciHeap7.potential();
        int int10 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode(0);
        fibonacciHeap12.meld(fibonacciHeap24);
        int[] intArray30 = fibonacciHeap24.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode31 = fibonacciHeap24.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap24.new HeapNode(32);
        fibonacciHeap7.delete(heapNode33);
        boolean boolean35 = fibonacciHeap7.empty();
        boolean boolean36 = fibonacciHeap7.empty();
        int int37 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int40 = fibonacciHeap39.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap39.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap39.meld(fibonacciHeap45);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap45.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap7.delete(heapNode47);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.new HeapNode(10);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap8.meld(fibonacciHeap11);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap8.new HeapNode((int) (short) 0);
        heapNode14.key = (byte) 100;
        heapNode14.key = (-1);
        fibonacciHeap1.delete(heapNode14);
        int int20 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap22.new HeapNode((int) (short) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap22.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap22.insert(97);
        int[] intArray28 = fibonacciHeap22.countersRep();
        int[] intArray29 = fibonacciHeap22.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap22.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode30);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap0.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode4 = fibonacciHeap0.new HeapNode((int) (short) 100);
        boolean boolean5 = fibonacciHeap0.empty();
        fibonacciHeap0.deleteMin();
        fibonacciHeap0.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int10 = fibonacciHeap9.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap9.meld(fibonacciHeap12);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode15 = fibonacciHeap9.new HeapNode((int) (short) 0);
        fibonacciHeap9.deleteMin();
        boolean boolean17 = fibonacciHeap9.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int20 = fibonacciHeap19.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap19.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap25.meld(fibonacciHeap28);
        fibonacciHeap22.meld(fibonacciHeap28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int33 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int36 = fibonacciHeap35.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap35.insert(0);
        fibonacciHeap32.delete(heapNode38);
        fibonacciHeap22.meld(fibonacciHeap32);
        int[] intArray41 = fibonacciHeap22.countersRep();
        fibonacciHeap9.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap22.new HeapNode(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap0.delete(heapNode44);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap4.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap11.insert(0);
        fibonacciHeap8.delete(heapNode14);
        fibonacciHeap4.delete(heapNode14);
        heapNode14.key = ' ';
        int int19 = heapNode14.getKey();
        fibonacciHeap1.delete(heapNode14);
        int int21 = fibonacciHeap1.potential();
        boolean boolean22 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap1.insert((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap26.insert(1);
        boolean boolean29 = fibonacciHeap26.empty();
        int int30 = fibonacciHeap26.size();
        int int31 = fibonacciHeap26.size();
        boolean boolean32 = fibonacciHeap26.empty();
        int int33 = fibonacciHeap26.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap26.insert((int) (byte) 10);
        fibonacciHeap1.meld(fibonacciHeap26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap38.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int45 = fibonacciHeap44.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap44.meld(fibonacciHeap47);
        fibonacciHeap41.meld(fibonacciHeap47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap41.new HeapNode((int) (short) 10);
        fibonacciHeap26.delete(heapNode51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap26.deleteMin();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.findMin();
        int int4 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap5.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap5.new HeapNode((int) (short) 100);
        boolean boolean10 = fibonacciHeap5.empty();
        fibonacciHeap1.meld(fibonacciHeap5);
        boolean boolean12 = fibonacciHeap5.empty();
        int int13 = fibonacciHeap5.size();
        int int14 = fibonacciHeap5.potential();
        fibonacciHeap5.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap5.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int20 = fibonacciHeap19.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap19.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap25.meld(fibonacciHeap28);
        fibonacciHeap22.meld(fibonacciHeap28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int33 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int36 = fibonacciHeap35.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap35.insert(0);
        fibonacciHeap32.delete(heapNode38);
        fibonacciHeap22.meld(fibonacciHeap32);
        fibonacciHeap32.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap32.insert(100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap32.new HeapNode((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap5.delete(heapNode45);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        int int6 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap8.meld(fibonacciHeap11);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap8.meld(fibonacciHeap14);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap17.meld(fibonacciHeap20);
        fibonacciHeap20.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap20.new HeapNode(0);
        fibonacciHeap8.meld(fibonacciHeap20);
        int[] intArray26 = fibonacciHeap20.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap20.findMin();
        fibonacciHeap1.meld(fibonacciHeap20);
        boolean boolean29 = fibonacciHeap20.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap31.new HeapNode(0);
        fibonacciHeap31.deleteMin();
        fibonacciHeap31.deleteMin();
        fibonacciHeap20.meld(fibonacciHeap31);
        int[] intArray37 = fibonacciHeap20.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap20.insert(100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap41.new HeapNode((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap41.new HeapNode(32);
        fibonacciHeap20.delete(heapNode45);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap48.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int53 = fibonacciHeap52.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap55.insert(0);
        fibonacciHeap52.delete(heapNode58);
        fibonacciHeap48.delete(heapNode58);
        boolean boolean61 = fibonacciHeap48.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode63 = fibonacciHeap48.insert(3);
        int int64 = heapNode63.getKey();
        int int65 = heapNode63.getKey();
        int int66 = heapNode63.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap20.delete(heapNode63);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int17 = fibonacciHeap16.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap16.meld(fibonacciHeap19);
        fibonacciHeap13.meld(fibonacciHeap19);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap13.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.delete(heapNode25);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int29 = fibonacciHeap28.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap28.meld(fibonacciHeap31);
        fibonacciHeap31.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap31.new HeapNode(0);
        int int36 = fibonacciHeap31.size();
        fibonacciHeap31.deleteMin();
        fibonacciHeap1.meld(fibonacciHeap31);
        boolean boolean39 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap43.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int48 = fibonacciHeap47.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int51 = fibonacciHeap50.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap50.insert(0);
        fibonacciHeap47.delete(heapNode53);
        fibonacciHeap43.delete(heapNode53);
        boolean boolean56 = fibonacciHeap43.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int59 = fibonacciHeap58.size();
        fibonacciHeap43.meld(fibonacciHeap58);
        fibonacciHeap41.meld(fibonacciHeap43);
        boolean boolean62 = fibonacciHeap41.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode64 = fibonacciHeap41.new HeapNode((int) (byte) 100);
        int int65 = heapNode64.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode64);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        fibonacciHeap1.deleteMin();
        int int4 = fibonacciHeap1.potential();
        boolean boolean5 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        int[] intArray8 = fibonacciHeap7.countersRep();
        boolean boolean9 = fibonacciHeap7.empty();
        int int10 = fibonacciHeap7.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode12 = fibonacciHeap7.insert(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap4.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap11.insert(0);
        fibonacciHeap8.delete(heapNode14);
        fibonacciHeap4.delete(heapNode14);
        heapNode14.key = ' ';
        int int19 = heapNode14.getKey();
        fibonacciHeap1.delete(heapNode14);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap1.new HeapNode(100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap24.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode(10);
        fibonacciHeap24.deleteMin();
        int int30 = fibonacciHeap24.size();
        boolean boolean31 = fibonacciHeap24.empty();
        fibonacciHeap1.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap34.meld(fibonacciHeap37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap34.meld(fibonacciHeap40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int44 = fibonacciHeap43.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap43.meld(fibonacciHeap46);
        fibonacciHeap46.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap46.new HeapNode(0);
        fibonacciHeap34.meld(fibonacciHeap46);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int54 = fibonacciHeap53.size();
        fibonacciHeap46.meld(fibonacciHeap53);
        fibonacciHeap24.meld(fibonacciHeap53);
        fibonacciHeap24.deleteMin();
        fibonacciHeap24.deleteMin();
        boolean boolean59 = fibonacciHeap24.empty();
        int int60 = fibonacciHeap24.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap62 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int63 = fibonacciHeap62.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap65 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap62.meld(fibonacciHeap65);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode68 = fibonacciHeap62.new HeapNode((int) (short) 0);
        heapNode68.key = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap24.delete(heapNode68);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        int[] intArray7 = fibonacciHeap4.countersRep();
        int int8 = fibonacciHeap4.potential();
        int int9 = fibonacciHeap4.size();
        fibonacciHeap4.deleteMin();
        boolean boolean11 = fibonacciHeap4.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode15 = fibonacciHeap13.findMin();
        int int16 = fibonacciHeap13.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode19 = fibonacciHeap17.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap17.new HeapNode((int) (short) 100);
        boolean boolean22 = fibonacciHeap17.empty();
        fibonacciHeap13.meld(fibonacciHeap17);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap17.insert((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode25);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        boolean boolean4 = fibonacciHeap1.empty();
        int int5 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap6.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap10.meld(fibonacciHeap16);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int20 = fibonacciHeap19.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap19.meld(fibonacciHeap22);
        fibonacciHeap22.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap22.new HeapNode(0);
        fibonacciHeap10.meld(fibonacciHeap22);
        int[] intArray28 = fibonacciHeap10.countersRep();
        fibonacciHeap6.meld(fibonacciHeap10);
        fibonacciHeap1.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int33 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap32.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap32.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap38.findMin();
        heapNode40.key = (short) 100;
        int int43 = heapNode40.key;
        fibonacciHeap1.delete(heapNode40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        int int51 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap46.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap53.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap57 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int58 = fibonacciHeap57.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap60 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap57.meld(fibonacciHeap60);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap63 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap57.meld(fibonacciHeap63);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap66 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int67 = fibonacciHeap66.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap69 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap66.meld(fibonacciHeap69);
        fibonacciHeap69.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode73 = fibonacciHeap69.new HeapNode(0);
        fibonacciHeap57.meld(fibonacciHeap69);
        int[] intArray75 = fibonacciHeap57.countersRep();
        fibonacciHeap53.meld(fibonacciHeap57);
        fibonacciHeap46.meld(fibonacciHeap53);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode79 = fibonacciHeap53.insert((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode79);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap1.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap24.new HeapNode(0);
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int31 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap30.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap30.meld(fibonacciHeap36);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int40 = fibonacciHeap39.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap39.meld(fibonacciHeap42);
        fibonacciHeap42.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode46 = fibonacciHeap42.new HeapNode(0);
        fibonacciHeap30.meld(fibonacciHeap42);
        int[] intArray48 = fibonacciHeap42.countersRep();
        int int49 = fibonacciHeap42.size();
        int int50 = fibonacciHeap42.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap42.new HeapNode((int) '4');
        fibonacciHeap42.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap42.insert(32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap57 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap57.findMin();
        int int59 = heapNode58.getKey();
        fibonacciHeap42.delete(heapNode58);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap42.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap24.delete(heapNode62);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int6 = fibonacciHeap5.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode11 = fibonacciHeap8.insert(0);
        fibonacciHeap5.delete(heapNode11);
        fibonacciHeap1.delete(heapNode11);
        int[] intArray14 = fibonacciHeap1.countersRep();
        int int15 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap17.insert(0);
        fibonacciHeap17.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int24 = fibonacciHeap23.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap23.meld(fibonacciHeap26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap23.meld(fibonacciHeap29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int33 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap32.meld(fibonacciHeap35);
        fibonacciHeap35.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap35.new HeapNode(0);
        fibonacciHeap23.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode42 = fibonacciHeap23.insert((-1));
        fibonacciHeap17.meld(fibonacciHeap23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int46 = fibonacciHeap45.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap45.meld(fibonacciHeap48);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap51 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap45.meld(fibonacciHeap51);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap54 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int55 = fibonacciHeap54.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap57 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap54.meld(fibonacciHeap57);
        fibonacciHeap57.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode61 = fibonacciHeap57.new HeapNode(0);
        fibonacciHeap45.meld(fibonacciHeap57);
        int[] intArray63 = fibonacciHeap57.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode64 = fibonacciHeap57.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode66 = fibonacciHeap57.new HeapNode(32);
        fibonacciHeap17.delete(heapNode66);
        heapNode66.key = '4';
        heapNode66.key = 3;
        fibonacciHeap1.delete(heapNode66);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap74 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int75 = fibonacciHeap74.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap77 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap74.meld(fibonacciHeap77);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap80 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap74.meld(fibonacciHeap80);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap83 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int84 = fibonacciHeap83.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap86 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap83.meld(fibonacciHeap86);
        fibonacciHeap86.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode90 = fibonacciHeap86.new HeapNode(0);
        fibonacciHeap74.meld(fibonacciHeap86);
        int[] intArray92 = fibonacciHeap74.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode93 = fibonacciHeap74.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode94 = fibonacciHeap74.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode94);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap4.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap11.insert(0);
        fibonacciHeap8.delete(heapNode14);
        fibonacciHeap4.delete(heapNode14);
        fibonacciHeap1.delete(heapNode14);
        int[] intArray18 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap20.new HeapNode((int) (short) 1);
        fibonacciHeap1.meld(fibonacciHeap20);
        boolean boolean24 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap26.findMin();
        int int29 = fibonacciHeap26.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap30.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap30.new HeapNode((int) (short) 100);
        boolean boolean35 = fibonacciHeap30.empty();
        fibonacciHeap26.meld(fibonacciHeap30);
        boolean boolean37 = fibonacciHeap30.empty();
        int int38 = fibonacciHeap30.size();
        fibonacciHeap1.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int42 = fibonacciHeap41.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap41.meld(fibonacciHeap44);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap41.meld(fibonacciHeap47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int51 = fibonacciHeap50.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap50.meld(fibonacciHeap53);
        fibonacciHeap53.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap53.new HeapNode(0);
        fibonacciHeap41.meld(fibonacciHeap53);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode60 = fibonacciHeap41.insert((-1));
        fibonacciHeap41.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap41.findMin();
        boolean boolean63 = fibonacciHeap41.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap65 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int66 = fibonacciHeap65.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode68 = fibonacciHeap65.insert(0);
        fibonacciHeap65.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap71 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int72 = fibonacciHeap71.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap74 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap71.meld(fibonacciHeap74);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap77 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap71.meld(fibonacciHeap77);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap80 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int81 = fibonacciHeap80.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap83 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap80.meld(fibonacciHeap83);
        fibonacciHeap83.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode87 = fibonacciHeap83.new HeapNode(0);
        fibonacciHeap71.meld(fibonacciHeap83);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode90 = fibonacciHeap71.insert((-1));
        fibonacciHeap65.meld(fibonacciHeap71);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode93 = fibonacciHeap65.new HeapNode(2);
        fibonacciHeap41.delete(heapNode93);
        int int95 = heapNode93.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap30.delete(heapNode93);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap4.new HeapNode(0);
        int int9 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap14.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int19 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap21.insert(0);
        fibonacciHeap18.delete(heapNode24);
        fibonacciHeap14.delete(heapNode24);
        boolean boolean27 = fibonacciHeap14.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        fibonacciHeap14.meld(fibonacciHeap29);
        fibonacciHeap12.meld(fibonacciHeap14);
        int int33 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int36 = fibonacciHeap35.potential();
        fibonacciHeap35.deleteMin();
        int[] intArray38 = fibonacciHeap35.countersRep();
        int int39 = fibonacciHeap35.potential();
        fibonacciHeap14.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap35.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap35.new HeapNode(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode43);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap4.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap4.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int19 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap18.meld(fibonacciHeap21);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap18.meld(fibonacciHeap24);
        int int26 = fibonacciHeap24.potential();
        int int27 = fibonacciHeap24.size();
        boolean boolean28 = fibonacciHeap24.empty();
        int int29 = fibonacciHeap24.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode31 = fibonacciHeap24.new HeapNode(0);
        int int32 = heapNode31.getKey();
        fibonacciHeap4.delete(heapNode31);
        int int34 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap39.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int44 = fibonacciHeap43.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode49 = fibonacciHeap46.insert(0);
        fibonacciHeap43.delete(heapNode49);
        fibonacciHeap39.delete(heapNode49);
        heapNode49.key = ' ';
        int int54 = heapNode49.getKey();
        fibonacciHeap36.delete(heapNode49);
        int int56 = fibonacciHeap36.potential();
        boolean boolean57 = fibonacciHeap36.empty();
        fibonacciHeap36.deleteMin();
        fibonacciHeap4.meld(fibonacciHeap36);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap61.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode64 = fibonacciHeap61.insert(0);
        heapNode64.key = 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap36.delete(heapNode64);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.new HeapNode(0);
        fibonacciHeap1.deleteMin();
        boolean boolean5 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap1.new HeapNode(100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap1.new HeapNode((int) (byte) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap11.insert(1);
        boolean boolean14 = fibonacciHeap11.empty();
        int int15 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap16.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap20.meld(fibonacciHeap23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap20.meld(fibonacciHeap26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        fibonacciHeap32.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap32.new HeapNode(0);
        fibonacciHeap20.meld(fibonacciHeap32);
        int[] intArray38 = fibonacciHeap20.countersRep();
        fibonacciHeap16.meld(fibonacciHeap20);
        fibonacciHeap11.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode42 = fibonacciHeap20.insert((int) (byte) 0);
        int[] intArray43 = fibonacciHeap20.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap20.new HeapNode((int) (byte) 0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap20.new HeapNode(4);
        int int48 = heapNode47.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode47);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        boolean boolean7 = fibonacciHeap4.empty();
        fibonacciHeap4.deleteMin();
        int int9 = fibonacciHeap4.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.findMin();
        int int11 = fibonacciHeap4.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap13.meld(fibonacciHeap19);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap22.meld(fibonacciHeap25);
        fibonacciHeap25.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap25.new HeapNode(0);
        fibonacciHeap13.meld(fibonacciHeap25);
        int[] intArray31 = fibonacciHeap25.countersRep();
        int int32 = fibonacciHeap25.size();
        int int33 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap25.new HeapNode((int) '4');
        fibonacciHeap25.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap38.new HeapNode((int) (short) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int43 = fibonacciHeap42.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap42.findMin();
        int int45 = fibonacciHeap42.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode48 = fibonacciHeap46.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap46.new HeapNode((int) (short) 100);
        boolean boolean51 = fibonacciHeap46.empty();
        fibonacciHeap42.meld(fibonacciHeap46);
        boolean boolean53 = fibonacciHeap46.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap46.new HeapNode(2);
        heapNode55.key = 35;
        fibonacciHeap38.delete(heapNode55);
        fibonacciHeap25.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode60 = fibonacciHeap38.findMin();
        fibonacciHeap4.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap63 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int64 = fibonacciHeap63.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap66 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap63.meld(fibonacciHeap66);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap69 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap63.meld(fibonacciHeap69);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap72 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int73 = fibonacciHeap72.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap75 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap72.meld(fibonacciHeap75);
        fibonacciHeap75.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode79 = fibonacciHeap75.new HeapNode(0);
        fibonacciHeap63.meld(fibonacciHeap75);
        int[] intArray81 = fibonacciHeap75.countersRep();
        boolean boolean82 = fibonacciHeap75.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode84 = fibonacciHeap75.insert((int) (byte) 100);
        int[] intArray85 = fibonacciHeap75.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode86 = fibonacciHeap75.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode88 = fibonacciHeap75.new HeapNode(5);
        int int89 = heapNode88.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode88);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int int19 = fibonacciHeap13.potential();
        int int20 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap13.insert((int) '4');
        int int23 = fibonacciHeap13.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap25.meld(fibonacciHeap28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode31 = fibonacciHeap25.new HeapNode((int) (short) 0);
        int int32 = fibonacciHeap25.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap37.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int42 = fibonacciHeap41.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int45 = fibonacciHeap44.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap44.insert(0);
        fibonacciHeap41.delete(heapNode47);
        fibonacciHeap37.delete(heapNode47);
        fibonacciHeap34.delete(heapNode47);
        fibonacciHeap25.delete(heapNode47);
        fibonacciHeap13.delete(heapNode47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap54 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap56 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap56.insert(1);
        int int59 = heapNode58.key;
        int int60 = heapNode58.key;
        heapNode58.key = (-1);
        int int63 = heapNode58.getKey();
        fibonacciHeap54.delete(heapNode58);
        int int65 = fibonacciHeap54.size();
        boolean boolean66 = fibonacciHeap54.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap54.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode69 = fibonacciHeap54.insert((int) (short) 0);
        heapNode69.key = 35;
        int int72 = heapNode69.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode69);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.new HeapNode(10);
        int int6 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        int[] intArray9 = fibonacciHeap8.countersRep();
        fibonacciHeap1.meld(fibonacciHeap8);
        fibonacciHeap8.deleteMin();
        fibonacciHeap8.deleteMin();
        int int13 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap14.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int19 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap18.meld(fibonacciHeap21);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap18.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        fibonacciHeap30.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap30.new HeapNode(0);
        fibonacciHeap18.meld(fibonacciHeap30);
        int[] intArray36 = fibonacciHeap18.countersRep();
        fibonacciHeap14.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap14.new HeapNode((int) 'a');
        int int40 = heapNode39.key;
        int int41 = heapNode39.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap8.delete(heapNode39);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.new HeapNode((int) (short) 1);
        int[] intArray4 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap1.insert((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        int[] intArray10 = fibonacciHeap8.countersRep();
        int int11 = fibonacciHeap8.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap8.insert(0);
        fibonacciHeap8.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap8.new HeapNode((int) (short) 10);
        int int17 = heapNode16.getKey();
        heapNode16.key = 4;
        heapNode16.key = 'a';
        heapNode16.key = 8;
        fibonacciHeap1.delete(heapNode16);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int34 = fibonacciHeap33.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap33.meld(fibonacciHeap36);
        fibonacciHeap30.meld(fibonacciHeap36);
        int int39 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap30.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap30.findMin();
        int int42 = heapNode41.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode41);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap4.new HeapNode(0);
        int int9 = fibonacciHeap4.size();
        int int10 = fibonacciHeap4.size();
        fibonacciHeap4.deleteMin();
        int int12 = fibonacciHeap4.size();
        int int13 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap15.insert(1);
        int int18 = heapNode17.key;
        int int19 = heapNode17.key;
        heapNode17.key = (-1);
        int int22 = heapNode17.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode17);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.findMin();
        int int4 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap5.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap5.new HeapNode((int) (short) 100);
        boolean boolean10 = fibonacciHeap5.empty();
        fibonacciHeap1.meld(fibonacciHeap5);
        fibonacciHeap5.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap5.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap15.meld(fibonacciHeap18);
        fibonacciHeap18.deleteMin();
        int[] intArray21 = fibonacciHeap18.countersRep();
        int int22 = fibonacciHeap18.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap18.new HeapNode(0);
        int int25 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap18.insert((int) (short) 1);
        int int28 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int31 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap30.insert(0);
        fibonacciHeap30.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap36.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int46 = fibonacciHeap45.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap45.meld(fibonacciHeap48);
        fibonacciHeap48.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap48.new HeapNode(0);
        fibonacciHeap36.meld(fibonacciHeap48);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap36.insert((-1));
        fibonacciHeap30.meld(fibonacciHeap36);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap36.new HeapNode((int) 'a');
        int int59 = heapNode58.getKey();
        fibonacciHeap18.delete(heapNode58);
        heapNode58.key = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap5.delete(heapNode58);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int2 = fibonacciHeap1.potential();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap5.deleteMin();
        fibonacciHeap5.deleteMin();
        fibonacciHeap5.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap5.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode11 = fibonacciHeap5.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap5.new HeapNode(10);
        int int14 = fibonacciHeap5.potential();
        int int15 = fibonacciHeap5.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap5.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode17);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.new HeapNode(10);
        fibonacciHeap1.deleteMin();
        int int7 = fibonacciHeap1.size();
        fibonacciHeap1.deleteMin();
        int[] intArray9 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap11.meld(fibonacciHeap14);
        fibonacciHeap14.deleteMin();
        int[] intArray17 = fibonacciHeap14.countersRep();
        int int18 = fibonacciHeap14.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap14.new HeapNode(1);
        int int21 = heapNode20.key;
        heapNode20.key = (short) 100;
        int int24 = heapNode20.getKey();
        int int25 = heapNode20.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode20);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.findMin();
        int[] intArray4 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap1.insert((int) '4');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap8.meld(fibonacciHeap11);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap8.new HeapNode((int) (short) 0);
        fibonacciHeap8.deleteMin();
        boolean boolean16 = fibonacciHeap8.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap8.findMin();
        fibonacciHeap1.meld(fibonacciHeap8);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode19 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap21.meld(fibonacciHeap27);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int31 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap30.meld(fibonacciHeap33);
        fibonacciHeap33.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap33.new HeapNode(0);
        fibonacciHeap21.meld(fibonacciHeap33);
        int[] intArray39 = fibonacciHeap21.countersRep();
        int int40 = fibonacciHeap21.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int43 = fibonacciHeap42.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int46 = fibonacciHeap45.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode48 = fibonacciHeap45.insert(0);
        fibonacciHeap42.delete(heapNode48);
        fibonacciHeap21.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap42.new HeapNode(2);
        int int53 = heapNode52.getKey();
        int int54 = heapNode52.key;
        int int55 = heapNode52.getKey();
        int int56 = heapNode52.key;
        fibonacciHeap1.delete(heapNode52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode61 = fibonacciHeap59.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode63 = fibonacciHeap59.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap65 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int66 = fibonacciHeap65.size();
        fibonacciHeap59.meld(fibonacciHeap65);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode69 = fibonacciHeap59.new HeapNode((int) '4');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode70 = fibonacciHeap59.findMin();
        int[] intArray71 = fibonacciHeap59.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap73 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int74 = fibonacciHeap73.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap76 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap73.meld(fibonacciHeap76);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap79 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int80 = fibonacciHeap79.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap82 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap79.meld(fibonacciHeap82);
        fibonacciHeap76.meld(fibonacciHeap82);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode86 = fibonacciHeap76.new HeapNode((int) (short) 10);
        heapNode86.key = 2;
        int int89 = heapNode86.getKey();
        int int90 = heapNode86.key;
        heapNode86.key = (-1);
        heapNode86.key = '4';
        fibonacciHeap59.delete(heapNode86);
        int int96 = fibonacciHeap59.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode97 = fibonacciHeap59.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode97);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap1.countersRep();
        int int20 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap25.insert(0);
        fibonacciHeap22.delete(heapNode28);
        fibonacciHeap1.meld(fibonacciHeap22);
        int[] intArray31 = fibonacciHeap22.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int34 = fibonacciHeap33.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap33.meld(fibonacciHeap36);
        int int38 = fibonacciHeap33.size();
        int[] intArray39 = fibonacciHeap33.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap41.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int46 = fibonacciHeap45.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int49 = fibonacciHeap48.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap48.insert(0);
        fibonacciHeap45.delete(heapNode51);
        fibonacciHeap41.delete(heapNode51);
        heapNode51.key = ' ';
        fibonacciHeap33.delete(heapNode51);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap33.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode60 = fibonacciHeap33.new HeapNode(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap22.delete(heapNode60);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap1.new HeapNode((int) (short) 0);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        int int15 = fibonacciHeap10.size();
        int[] intArray16 = fibonacciHeap10.countersRep();
        fibonacciHeap1.meld(fibonacciHeap10);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap20.meld(fibonacciHeap23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap26.meld(fibonacciHeap29);
        fibonacciHeap23.meld(fibonacciHeap29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap23.new HeapNode((int) (short) 10);
        int int34 = fibonacciHeap23.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap23.insert(97);
        int int37 = fibonacciHeap23.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap23.insert((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode39);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        boolean boolean4 = fibonacciHeap1.empty();
        int int5 = fibonacciHeap1.size();
        int int6 = fibonacciHeap1.size();
        boolean boolean7 = fibonacciHeap1.empty();
        int int8 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap1.insert((int) (byte) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap12.new HeapNode((int) (short) 0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap12.new HeapNode((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap22.insert(1);
        boolean boolean25 = fibonacciHeap22.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap22.new HeapNode((int) ' ');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap22.new HeapNode((int) '#');
        fibonacciHeap12.delete(heapNode29);
        fibonacciHeap1.delete(heapNode29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap1.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap1.new HeapNode((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.deleteMin();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        int[] intArray3 = fibonacciHeap1.countersRep();
        int int4 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int7 = fibonacciHeap6.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap6.findMin();
        int int9 = heapNode8.getKey();
        int int10 = heapNode8.key;
        fibonacciHeap1.delete(heapNode8);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap13.insert(0);
        int int17 = heapNode16.getKey();
        heapNode16.key = (byte) -1;
        heapNode16.key = 35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode16);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.findMin();
        int int4 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap5.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap5.new HeapNode((int) (short) 100);
        boolean boolean10 = fibonacciHeap5.empty();
        fibonacciHeap1.meld(fibonacciHeap5);
        boolean boolean12 = fibonacciHeap5.empty();
        int int13 = fibonacciHeap5.size();
        boolean boolean14 = fibonacciHeap5.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap5.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int19 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap18.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int24 = fibonacciHeap23.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap23.meld(fibonacciHeap26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap23.meld(fibonacciHeap29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int33 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap32.meld(fibonacciHeap35);
        fibonacciHeap35.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap35.new HeapNode(0);
        fibonacciHeap23.meld(fibonacciHeap35);
        int[] intArray41 = fibonacciHeap35.countersRep();
        boolean boolean42 = fibonacciHeap35.empty();
        fibonacciHeap18.meld(fibonacciHeap35);
        boolean boolean44 = fibonacciHeap18.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap46.meld(fibonacciHeap52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap55.meld(fibonacciHeap58);
        fibonacciHeap58.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap58.new HeapNode(0);
        fibonacciHeap46.meld(fibonacciHeap58);
        int[] intArray64 = fibonacciHeap46.countersRep();
        int int65 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode66 = fibonacciHeap46.findMin();
        int int67 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode69 = fibonacciHeap46.new HeapNode(3);
        int int70 = heapNode69.key;
        fibonacciHeap18.delete(heapNode69);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode73 = fibonacciHeap18.insert(7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap5.delete(heapNode73);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(35);
        int int2 = fibonacciHeap1.size();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int6 = fibonacciHeap5.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap5.insert(0);
        fibonacciHeap5.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap11.meld(fibonacciHeap14);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap11.meld(fibonacciHeap17);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap20.meld(fibonacciHeap23);
        fibonacciHeap23.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap23.new HeapNode(0);
        fibonacciHeap11.meld(fibonacciHeap23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap11.insert((-1));
        fibonacciHeap5.meld(fibonacciHeap11);
        int int32 = fibonacciHeap5.potential();
        int int33 = fibonacciHeap5.size();
        fibonacciHeap5.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap36.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int46 = fibonacciHeap45.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap45.meld(fibonacciHeap48);
        fibonacciHeap48.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap48.new HeapNode(0);
        fibonacciHeap36.meld(fibonacciHeap48);
        int[] intArray54 = fibonacciHeap36.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap36.findMin();
        heapNode55.key = 35;
        fibonacciHeap5.delete(heapNode55);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode60 = fibonacciHeap5.insert(97);
        fibonacciHeap5.deleteMin();
        boolean boolean62 = fibonacciHeap5.empty();
        int int63 = fibonacciHeap5.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode64 = fibonacciHeap5.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode64);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        fibonacciHeap13.meld(fibonacciHeap20);
        int int23 = fibonacciHeap20.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap20.new HeapNode(2);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap27.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap34.insert(0);
        fibonacciHeap31.delete(heapNode37);
        fibonacciHeap27.delete(heapNode37);
        boolean boolean40 = fibonacciHeap27.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int43 = fibonacciHeap42.size();
        fibonacciHeap27.meld(fibonacciHeap42);
        int int45 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap27.insert((int) (byte) 100);
        fibonacciHeap20.delete(heapNode47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap50.insert(1);
        boolean boolean53 = fibonacciHeap50.empty();
        int int54 = fibonacciHeap50.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap55.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int60 = fibonacciHeap59.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap62 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap59.meld(fibonacciHeap62);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap65 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap59.meld(fibonacciHeap65);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap68 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int69 = fibonacciHeap68.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap71 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap68.meld(fibonacciHeap71);
        fibonacciHeap71.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode75 = fibonacciHeap71.new HeapNode(0);
        fibonacciHeap59.meld(fibonacciHeap71);
        int[] intArray77 = fibonacciHeap59.countersRep();
        fibonacciHeap55.meld(fibonacciHeap59);
        fibonacciHeap50.meld(fibonacciHeap59);
        fibonacciHeap50.deleteMin();
        int int81 = fibonacciHeap50.potential();
        fibonacciHeap50.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode83 = fibonacciHeap50.findMin();
        int int84 = fibonacciHeap50.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap86 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode87 = fibonacciHeap86.findMin();
        heapNode87.key = (byte) 10;
        fibonacciHeap50.delete(heapNode87);
        fibonacciHeap20.meld(fibonacciHeap50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap50.deleteMin();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.new HeapNode(10);
        int int6 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        int[] intArray9 = fibonacciHeap8.countersRep();
        fibonacciHeap1.meld(fibonacciHeap8);
        fibonacciHeap8.deleteMin();
        fibonacciHeap8.deleteMin();
        int int13 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap15.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap15.new HeapNode((int) (short) 0);
        fibonacciHeap15.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap24.meld(fibonacciHeap27);
        int int29 = fibonacciHeap24.size();
        int[] intArray30 = fibonacciHeap24.countersRep();
        fibonacciHeap15.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap24.new HeapNode(0);
        int int34 = fibonacciHeap24.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap24.findMin();
        boolean boolean36 = fibonacciHeap24.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap24.new HeapNode((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap8.delete(heapNode38);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap1.new HeapNode((int) (short) 0);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        int int15 = fibonacciHeap10.size();
        int[] intArray16 = fibonacciHeap10.countersRep();
        fibonacciHeap1.meld(fibonacciHeap10);
        boolean boolean18 = fibonacciHeap1.empty();
        int int19 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap21.meld(fibonacciHeap27);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int31 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap30.meld(fibonacciHeap33);
        fibonacciHeap33.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap33.new HeapNode(0);
        fibonacciHeap21.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int41 = fibonacciHeap40.size();
        fibonacciHeap33.meld(fibonacciHeap40);
        int int43 = fibonacciHeap40.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap40.new HeapNode(2);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap40.insert(4);
        fibonacciHeap1.delete(heapNode47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int51 = fibonacciHeap50.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap50.meld(fibonacciHeap53);
        fibonacciHeap53.deleteMin();
        int[] intArray56 = fibonacciHeap53.countersRep();
        int int57 = fibonacciHeap53.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode59 = fibonacciHeap53.new HeapNode(0);
        int int60 = fibonacciHeap53.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap53.insert((int) (short) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode63 = fibonacciHeap53.findMin();
        int int64 = heapNode63.key;
        int int65 = heapNode63.key;
        heapNode63.key = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode63);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode4 = fibonacciHeap1.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int7 = fibonacciHeap6.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap6.meld(fibonacciHeap9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap6.meld(fibonacciHeap12);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap15.meld(fibonacciHeap18);
        fibonacciHeap18.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap18.new HeapNode(0);
        fibonacciHeap6.meld(fibonacciHeap18);
        int[] intArray24 = fibonacciHeap18.countersRep();
        boolean boolean25 = fibonacciHeap18.empty();
        fibonacciHeap1.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap18.new HeapNode(0);
        int int29 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap31.meld(fibonacciHeap34);
        fibonacciHeap34.deleteMin();
        int[] intArray37 = fibonacciHeap34.countersRep();
        int int38 = fibonacciHeap34.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap34.new HeapNode(0);
        int int41 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap34.insert((int) (short) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap34.findMin();
        heapNode44.key = 5;
        int int47 = heapNode44.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap18.delete(heapNode44);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap4.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap11.insert(0);
        fibonacciHeap8.delete(heapNode14);
        fibonacciHeap4.delete(heapNode14);
        heapNode14.key = ' ';
        int int19 = heapNode14.getKey();
        fibonacciHeap1.delete(heapNode14);
        int int21 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap25.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap25.new HeapNode(10);
        fibonacciHeap23.delete(heapNode29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap23.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap23);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap1.new HeapNode(32);
        int int37 = fibonacciHeap1.potential();
        int[] intArray38 = fibonacciHeap1.countersRep();
        int int39 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap41.insert(1);
        int int44 = heapNode43.key;
        heapNode43.key = 10;
        int int47 = heapNode43.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode43);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap22.meld(fibonacciHeap25);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap22.meld(fibonacciHeap28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap31.meld(fibonacciHeap34);
        fibonacciHeap34.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap34.new HeapNode(0);
        fibonacciHeap22.meld(fibonacciHeap34);
        int[] intArray40 = fibonacciHeap34.countersRep();
        boolean boolean41 = fibonacciHeap34.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap34.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode46 = fibonacciHeap45.findMin();
        int int47 = heapNode46.key;
        fibonacciHeap34.delete(heapNode46);
        fibonacciHeap1.delete(heapNode46);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap53.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap53.new HeapNode(10);
        int int58 = fibonacciHeap53.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap60 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        int[] intArray61 = fibonacciHeap60.countersRep();
        fibonacciHeap53.meld(fibonacciHeap60);
        fibonacciHeap60.deleteMin();
        fibonacciHeap60.deleteMin();
        int int65 = fibonacciHeap60.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap60.new HeapNode(9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode69 = fibonacciHeap60.insert((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap71 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int72 = fibonacciHeap71.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap74 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap71.meld(fibonacciHeap74);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap77 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap71.meld(fibonacciHeap77);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap80 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int81 = fibonacciHeap80.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap83 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap80.meld(fibonacciHeap83);
        fibonacciHeap83.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode87 = fibonacciHeap83.new HeapNode(0);
        fibonacciHeap71.meld(fibonacciHeap83);
        int[] intArray89 = fibonacciHeap83.countersRep();
        boolean boolean90 = fibonacciHeap83.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode92 = fibonacciHeap83.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode94 = fibonacciHeap83.insert(100);
        fibonacciHeap60.delete(heapNode94);
        int int96 = heapNode94.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode94);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        int int6 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap8.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode(0);
        fibonacciHeap12.meld(fibonacciHeap24);
        int[] intArray30 = fibonacciHeap12.countersRep();
        fibonacciHeap8.meld(fibonacciHeap12);
        fibonacciHeap1.meld(fibonacciHeap8);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap34.meld(fibonacciHeap37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap34.meld(fibonacciHeap40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int44 = fibonacciHeap43.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap43.meld(fibonacciHeap46);
        fibonacciHeap46.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap46.new HeapNode(0);
        fibonacciHeap34.meld(fibonacciHeap46);
        int[] intArray52 = fibonacciHeap46.countersRep();
        boolean boolean53 = fibonacciHeap46.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap46.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap57 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap57.findMin();
        int int59 = heapNode58.key;
        fibonacciHeap46.delete(heapNode58);
        fibonacciHeap1.delete(heapNode58);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap63 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode65 = fibonacciHeap63.insert((int) (short) -1);
        fibonacciHeap1.delete(heapNode65);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap68 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int69 = fibonacciHeap68.size();
        int int70 = fibonacciHeap68.potential();
        int int71 = fibonacciHeap68.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap73 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode75 = fibonacciHeap73.insert(1);
        boolean boolean76 = fibonacciHeap73.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode78 = fibonacciHeap73.new HeapNode((int) ' ');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode80 = fibonacciHeap73.insert(35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode82 = fibonacciHeap73.new HeapNode(6);
        fibonacciHeap68.delete(heapNode82);
        fibonacciHeap1.delete(heapNode82);
        int int85 = fibonacciHeap1.potential();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.deleteMin();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int6 = fibonacciHeap5.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode11 = fibonacciHeap8.insert(0);
        fibonacciHeap5.delete(heapNode11);
        fibonacciHeap1.delete(heapNode11);
        boolean boolean14 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap1.insert(3);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap18.insert(1);
        int int21 = heapNode20.key;
        int int22 = heapNode20.key;
        heapNode20.key = (-1);
        int int25 = heapNode20.key;
        fibonacciHeap1.delete(heapNode20);
        int[] intArray27 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap29.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap29.new HeapNode((-1));
        fibonacciHeap1.delete(heapNode32);
        int[] intArray34 = fibonacciHeap1.countersRep();
        int[] intArray35 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap37.findMin();
        heapNode38.key = (byte) 10;
        int int41 = heapNode38.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode38);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int2 = fibonacciHeap1.size();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode4 = fibonacciHeap1.findMin();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap7.insert(1);
        int int10 = heapNode9.getKey();
        int int11 = heapNode9.key;
        heapNode9.key = (byte) 10;
        heapNode9.key = 3;
        int int16 = heapNode9.key;
        heapNode9.key = 7;
        heapNode9.key = 5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        int[] intArray7 = fibonacciHeap4.countersRep();
        int int8 = fibonacciHeap4.potential();
        int[] intArray9 = fibonacciHeap4.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap11.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode15 = fibonacciHeap11.new HeapNode(10);
        int int16 = fibonacciHeap11.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        int[] intArray19 = fibonacciHeap18.countersRep();
        fibonacciHeap11.meld(fibonacciHeap18);
        fibonacciHeap18.deleteMin();
        fibonacciHeap18.deleteMin();
        int int23 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap18.new HeapNode(9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap18.insert((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap29.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap38.meld(fibonacciHeap41);
        fibonacciHeap41.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap41.new HeapNode(0);
        fibonacciHeap29.meld(fibonacciHeap41);
        int[] intArray47 = fibonacciHeap41.countersRep();
        boolean boolean48 = fibonacciHeap41.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap41.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap41.insert(100);
        fibonacciHeap18.delete(heapNode52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode52);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.new HeapNode(10);
        int int6 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        int[] intArray9 = fibonacciHeap8.countersRep();
        fibonacciHeap1.meld(fibonacciHeap8);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode(0);
        fibonacciHeap12.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        fibonacciHeap24.meld(fibonacciHeap31);
        int int34 = fibonacciHeap31.size();
        fibonacciHeap1.meld(fibonacciHeap31);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap31.new HeapNode((int) (byte) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap31.new HeapNode(2);
        fibonacciHeap31.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap31.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int44 = fibonacciHeap43.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap43.meld(fibonacciHeap46);
        fibonacciHeap46.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap46.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap46.insert((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap54 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int55 = fibonacciHeap54.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap57 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap54.meld(fibonacciHeap57);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap60 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap54.meld(fibonacciHeap60);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap63 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int64 = fibonacciHeap63.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap66 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap63.meld(fibonacciHeap66);
        fibonacciHeap66.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode70 = fibonacciHeap66.new HeapNode(0);
        fibonacciHeap54.meld(fibonacciHeap66);
        int[] intArray72 = fibonacciHeap66.countersRep();
        boolean boolean73 = fibonacciHeap66.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode75 = fibonacciHeap66.insert((int) (byte) 100);
        int[] intArray76 = fibonacciHeap66.countersRep();
        fibonacciHeap46.meld(fibonacciHeap66);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap79 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int80 = fibonacciHeap79.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode81 = fibonacciHeap79.findMin();
        fibonacciHeap79.deleteMin();
        fibonacciHeap66.meld(fibonacciHeap79);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode85 = fibonacciHeap66.insert(7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode87 = fibonacciHeap66.insert(0);
        heapNode87.key = 100;
        int int90 = heapNode87.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap31.delete(heapNode87);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        int int6 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap1.findMin();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap10.meld(fibonacciHeap16);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int20 = fibonacciHeap19.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap19.meld(fibonacciHeap22);
        fibonacciHeap22.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap22.new HeapNode(0);
        fibonacciHeap10.meld(fibonacciHeap22);
        int[] intArray28 = fibonacciHeap10.countersRep();
        int int29 = fibonacciHeap10.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap34.insert(0);
        fibonacciHeap31.delete(heapNode37);
        fibonacciHeap10.meld(fibonacciHeap31);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap31.new HeapNode(2);
        fibonacciHeap1.delete(heapNode41);
        fibonacciHeap1.deleteMin();
        int int44 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap46.meld(fibonacciHeap52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap55.meld(fibonacciHeap58);
        fibonacciHeap58.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap58.new HeapNode(0);
        fibonacciHeap46.meld(fibonacciHeap58);
        int[] intArray64 = fibonacciHeap58.countersRep();
        boolean boolean65 = fibonacciHeap58.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap58.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode69 = fibonacciHeap58.insert(100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap71 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int72 = fibonacciHeap71.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap74 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap71.meld(fibonacciHeap74);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap77 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap71.meld(fibonacciHeap77);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap80 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int81 = fibonacciHeap80.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap83 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap80.meld(fibonacciHeap83);
        fibonacciHeap83.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode87 = fibonacciHeap83.new HeapNode(0);
        fibonacciHeap71.meld(fibonacciHeap83);
        int[] intArray89 = fibonacciHeap71.countersRep();
        int int90 = fibonacciHeap71.potential();
        fibonacciHeap58.meld(fibonacciHeap71);
        int int92 = fibonacciHeap58.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode94 = fibonacciHeap58.new HeapNode((int) (short) 1);
        int int95 = heapNode94.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode94);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap1.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap27.insert(0);
        fibonacciHeap27.deleteMin();
        fibonacciHeap24.meld(fibonacciHeap27);
        fibonacciHeap27.deleteMin();
        boolean boolean34 = fibonacciHeap27.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap36.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap36.new HeapNode(10);
        int int41 = fibonacciHeap36.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        int[] intArray44 = fibonacciHeap43.countersRep();
        fibonacciHeap36.meld(fibonacciHeap43);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap43.new HeapNode((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap27.delete(heapNode47);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.new HeapNode(0);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int7 = fibonacciHeap6.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap6.meld(fibonacciHeap9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap6.meld(fibonacciHeap12);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap15.meld(fibonacciHeap18);
        fibonacciHeap18.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap18.new HeapNode(0);
        fibonacciHeap6.meld(fibonacciHeap18);
        int[] intArray24 = fibonacciHeap18.countersRep();
        int int25 = fibonacciHeap18.size();
        int int26 = fibonacciHeap18.size();
        fibonacciHeap18.deleteMin();
        int[] intArray28 = fibonacciHeap18.countersRep();
        int[] intArray29 = fibonacciHeap18.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap31.meld(fibonacciHeap34);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap31.meld(fibonacciHeap37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int41 = fibonacciHeap40.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap40.meld(fibonacciHeap43);
        fibonacciHeap43.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap43.new HeapNode(0);
        fibonacciHeap31.meld(fibonacciHeap43);
        int[] intArray49 = fibonacciHeap31.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap31.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int53 = fibonacciHeap52.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap52.meld(fibonacciHeap55);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap52.meld(fibonacciHeap58);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int62 = fibonacciHeap61.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap64 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap61.meld(fibonacciHeap64);
        fibonacciHeap64.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode68 = fibonacciHeap64.new HeapNode(0);
        fibonacciHeap52.meld(fibonacciHeap64);
        int[] intArray70 = fibonacciHeap64.countersRep();
        boolean boolean71 = fibonacciHeap64.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode73 = fibonacciHeap64.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap75 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode76 = fibonacciHeap75.findMin();
        int int77 = heapNode76.key;
        fibonacciHeap64.delete(heapNode76);
        fibonacciHeap31.delete(heapNode76);
        int int80 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode82 = fibonacciHeap31.insert(0);
        fibonacciHeap18.meld(fibonacciHeap31);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode85 = fibonacciHeap18.insert(6);
        int int86 = heapNode85.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode85);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        boolean boolean20 = fibonacciHeap13.empty();
        fibonacciHeap13.deleteMin();
        int int22 = fibonacciHeap13.potential();
        fibonacciHeap13.deleteMin();
        int int24 = fibonacciHeap13.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap13.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap30.insert(1);
        int int33 = heapNode32.key;
        int int34 = heapNode32.key;
        heapNode32.key = (-1);
        int int37 = heapNode32.getKey();
        fibonacciHeap28.delete(heapNode32);
        int int39 = fibonacciHeap28.size();
        boolean boolean40 = fibonacciHeap28.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int43 = fibonacciHeap42.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap42.meld(fibonacciHeap45);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int49 = fibonacciHeap48.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap51 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap48.meld(fibonacciHeap51);
        fibonacciHeap45.meld(fibonacciHeap51);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap45.new HeapNode((int) (short) 10);
        fibonacciHeap28.meld(fibonacciHeap45);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int59 = fibonacciHeap58.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap58.meld(fibonacciHeap61);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap64 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap58.meld(fibonacciHeap64);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap67 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int68 = fibonacciHeap67.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap70 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap67.meld(fibonacciHeap70);
        fibonacciHeap70.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode74 = fibonacciHeap70.new HeapNode(0);
        fibonacciHeap58.meld(fibonacciHeap70);
        int[] intArray76 = fibonacciHeap58.countersRep();
        int int77 = fibonacciHeap58.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode78 = fibonacciHeap58.findMin();
        fibonacciHeap28.meld(fibonacciHeap58);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode80 = fibonacciHeap28.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode82 = fibonacciHeap28.new HeapNode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode82);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap4.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap11.insert(0);
        fibonacciHeap8.delete(heapNode14);
        fibonacciHeap4.delete(heapNode14);
        heapNode14.key = ' ';
        int int19 = heapNode14.getKey();
        fibonacciHeap1.delete(heapNode14);
        int int21 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap25.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap25.new HeapNode(10);
        fibonacciHeap23.delete(heapNode29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap23.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int36 = fibonacciHeap35.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap35.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap35.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int45 = fibonacciHeap44.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap44.meld(fibonacciHeap47);
        fibonacciHeap47.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap47.new HeapNode(0);
        fibonacciHeap35.meld(fibonacciHeap47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap54 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int55 = fibonacciHeap54.size();
        fibonacciHeap47.meld(fibonacciHeap54);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int59 = fibonacciHeap58.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap58.meld(fibonacciHeap61);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap64 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap58.meld(fibonacciHeap64);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap67 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int68 = fibonacciHeap67.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap70 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap67.meld(fibonacciHeap70);
        fibonacciHeap70.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode74 = fibonacciHeap70.new HeapNode(0);
        fibonacciHeap58.meld(fibonacciHeap70);
        fibonacciHeap54.meld(fibonacciHeap58);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode78 = fibonacciHeap58.insert((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap23.delete(heapNode78);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        int int6 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap8.meld(fibonacciHeap11);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap8.meld(fibonacciHeap14);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap17.meld(fibonacciHeap20);
        fibonacciHeap20.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap20.new HeapNode(0);
        fibonacciHeap8.meld(fibonacciHeap20);
        int[] intArray26 = fibonacciHeap20.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap20.findMin();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap30.insert((int) (byte) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap30.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int36 = fibonacciHeap35.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap35.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int42 = fibonacciHeap41.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap41.meld(fibonacciHeap44);
        fibonacciHeap38.meld(fibonacciHeap44);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int49 = fibonacciHeap48.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap51 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int52 = fibonacciHeap51.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode54 = fibonacciHeap51.insert(0);
        fibonacciHeap48.delete(heapNode54);
        fibonacciHeap38.meld(fibonacciHeap48);
        int[] intArray57 = fibonacciHeap38.countersRep();
        fibonacciHeap30.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode60 = fibonacciHeap30.new HeapNode((int) (byte) 10);
        int int61 = heapNode60.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap20.delete(heapNode60);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int6 = fibonacciHeap5.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode11 = fibonacciHeap8.insert(0);
        fibonacciHeap5.delete(heapNode11);
        fibonacciHeap1.delete(heapNode11);
        boolean boolean14 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int17 = fibonacciHeap16.size();
        fibonacciHeap1.meld(fibonacciHeap16);
        fibonacciHeap16.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap16.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap16.new HeapNode((int) '#');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap24.meld(fibonacciHeap27);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap24.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int34 = fibonacciHeap33.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap33.meld(fibonacciHeap36);
        fibonacciHeap36.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap36.new HeapNode(0);
        fibonacciHeap24.meld(fibonacciHeap36);
        int[] intArray42 = fibonacciHeap36.countersRep();
        boolean boolean43 = fibonacciHeap36.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap36.insert((int) (byte) 100);
        int[] intArray46 = fibonacciHeap36.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap36.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode49 = fibonacciHeap36.new HeapNode(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap16.delete(heapNode49);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        boolean boolean6 = fibonacciHeap4.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap4.new HeapNode(35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap4.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap11.meld(fibonacciHeap14);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap11.meld(fibonacciHeap17);
        int int19 = fibonacciHeap17.potential();
        int int20 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap22.meld(fibonacciHeap25);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap22.meld(fibonacciHeap28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap31.meld(fibonacciHeap34);
        fibonacciHeap34.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap34.new HeapNode(0);
        fibonacciHeap22.meld(fibonacciHeap34);
        int[] intArray40 = fibonacciHeap34.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap34.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap34.new HeapNode(32);
        fibonacciHeap17.delete(heapNode43);
        boolean boolean45 = fibonacciHeap17.empty();
        fibonacciHeap17.deleteMin();
        boolean boolean47 = fibonacciHeap17.empty();
        int[] intArray48 = fibonacciHeap17.countersRep();
        fibonacciHeap4.meld(fibonacciHeap17);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap51 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap51.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int59 = fibonacciHeap58.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode61 = fibonacciHeap58.insert(0);
        fibonacciHeap55.delete(heapNode61);
        fibonacciHeap51.delete(heapNode61);
        int[] intArray64 = fibonacciHeap51.countersRep();
        int[] intArray65 = fibonacciHeap51.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode66 = fibonacciHeap51.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode68 = fibonacciHeap51.insert((int) (byte) 1);
        int[] intArray69 = fibonacciHeap51.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap71 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int72 = fibonacciHeap71.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap74 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap71.meld(fibonacciHeap74);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap77 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int78 = fibonacciHeap77.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap80 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap77.meld(fibonacciHeap80);
        fibonacciHeap74.meld(fibonacciHeap80);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode84 = fibonacciHeap74.new HeapNode((int) (short) 10);
        int int85 = fibonacciHeap74.size();
        int[] intArray86 = fibonacciHeap74.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode88 = fibonacciHeap74.insert((int) (byte) 100);
        heapNode88.key = 2;
        fibonacciHeap51.delete(heapNode88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap17.delete(heapNode88);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        int int23 = fibonacciHeap20.size();
        fibonacciHeap20.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap20.new HeapNode((int) (short) -1);
        int int27 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap20.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int31 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap30.meld(fibonacciHeap33);
        int int35 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap30.findMin();
        int int37 = heapNode36.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap20.delete(heapNode36);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap7.meld(fibonacciHeap10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap10.new HeapNode((int) (byte) 100);
        int[] intArray15 = fibonacciHeap10.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap16.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap20.meld(fibonacciHeap23);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap20.meld(fibonacciHeap26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        fibonacciHeap32.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap32.new HeapNode(0);
        fibonacciHeap20.meld(fibonacciHeap32);
        int[] intArray38 = fibonacciHeap20.countersRep();
        fibonacciHeap16.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap16.new HeapNode((int) 'a');
        fibonacciHeap10.delete(heapNode41);
        fibonacciHeap10.deleteMin();
        int[] intArray44 = fibonacciHeap10.countersRep();
        int int45 = fibonacciHeap10.size();
        int[] intArray46 = fibonacciHeap10.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int49 = fibonacciHeap48.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap48.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap48.insert((int) (short) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap55.meld(fibonacciHeap58);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap55.meld(fibonacciHeap61);
        int int63 = fibonacciHeap61.potential();
        int int64 = fibonacciHeap61.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap66 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int67 = fibonacciHeap66.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap69 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap66.meld(fibonacciHeap69);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap72 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap66.meld(fibonacciHeap72);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap75 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int76 = fibonacciHeap75.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap78 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap75.meld(fibonacciHeap78);
        fibonacciHeap78.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode82 = fibonacciHeap78.new HeapNode(0);
        fibonacciHeap66.meld(fibonacciHeap78);
        int[] intArray84 = fibonacciHeap78.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode85 = fibonacciHeap78.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode87 = fibonacciHeap78.new HeapNode(32);
        fibonacciHeap61.delete(heapNode87);
        int int89 = heapNode87.key;
        fibonacciHeap48.delete(heapNode87);
        int int91 = heapNode87.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap10.delete(heapNode87);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        boolean boolean4 = fibonacciHeap1.empty();
        int int5 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap6.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap10.meld(fibonacciHeap16);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int20 = fibonacciHeap19.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap19.meld(fibonacciHeap22);
        fibonacciHeap22.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap22.new HeapNode(0);
        fibonacciHeap10.meld(fibonacciHeap22);
        int[] intArray28 = fibonacciHeap10.countersRep();
        fibonacciHeap6.meld(fibonacciHeap10);
        fibonacciHeap1.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int33 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap32.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap32.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap38.findMin();
        heapNode40.key = (short) 100;
        int int43 = heapNode40.key;
        fibonacciHeap1.delete(heapNode40);
        int int45 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode49 = fibonacciHeap47.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap51 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int52 = fibonacciHeap51.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap54 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int55 = fibonacciHeap54.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap54.insert(0);
        fibonacciHeap51.delete(heapNode57);
        fibonacciHeap47.delete(heapNode57);
        boolean boolean60 = fibonacciHeap47.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap47.insert(3);
        int int63 = heapNode62.getKey();
        int int64 = heapNode62.getKey();
        int int65 = heapNode62.key;
        heapNode62.key = (byte) 10;
        heapNode62.key = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode62);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap4.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap11.insert(0);
        fibonacciHeap8.delete(heapNode14);
        fibonacciHeap4.delete(heapNode14);
        fibonacciHeap1.delete(heapNode14);
        int[] intArray18 = fibonacciHeap1.countersRep();
        int int19 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap1.new HeapNode((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap24.findMin();
        int int27 = fibonacciHeap24.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap29.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap38.meld(fibonacciHeap41);
        fibonacciHeap41.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap41.new HeapNode(0);
        fibonacciHeap29.meld(fibonacciHeap41);
        int[] intArray47 = fibonacciHeap29.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode48 = fibonacciHeap29.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int51 = fibonacciHeap50.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap50.meld(fibonacciHeap53);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap56 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap50.meld(fibonacciHeap56);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int60 = fibonacciHeap59.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap62 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap59.meld(fibonacciHeap62);
        fibonacciHeap62.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode66 = fibonacciHeap62.new HeapNode(0);
        fibonacciHeap50.meld(fibonacciHeap62);
        int[] intArray68 = fibonacciHeap62.countersRep();
        boolean boolean69 = fibonacciHeap62.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode71 = fibonacciHeap62.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap73 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode74 = fibonacciHeap73.findMin();
        int int75 = heapNode74.key;
        fibonacciHeap62.delete(heapNode74);
        fibonacciHeap29.delete(heapNode74);
        fibonacciHeap24.meld(fibonacciHeap29);
        int int79 = fibonacciHeap29.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode81 = fibonacciHeap29.insert((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode81);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.new HeapNode(10);
        fibonacciHeap1.deleteMin();
        int int7 = fibonacciHeap1.size();
        boolean boolean8 = fibonacciHeap1.empty();
        fibonacciHeap1.deleteMin();
        int int10 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        int[] intArray13 = fibonacciHeap12.countersRep();
        boolean boolean14 = fibonacciHeap12.empty();
        int int15 = fibonacciHeap12.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap12.insert(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode17);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        boolean boolean7 = fibonacciHeap4.empty();
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap4.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap11.insert(0);
        fibonacciHeap11.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode19 = fibonacciHeap17.insert(1);
        int int20 = heapNode19.key;
        int int21 = heapNode19.key;
        fibonacciHeap11.delete(heapNode19);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap24.meld(fibonacciHeap27);
        int int29 = fibonacciHeap24.size();
        fibonacciHeap11.meld(fibonacciHeap24);
        int int31 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap11.insert(3);
        int int34 = fibonacciHeap11.potential();
        int[] intArray35 = fibonacciHeap11.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap11.findMin();
        int int37 = heapNode36.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode36);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap3.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap10.insert(0);
        fibonacciHeap7.delete(heapNode13);
        fibonacciHeap3.delete(heapNode13);
        boolean boolean16 = fibonacciHeap3.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int19 = fibonacciHeap18.size();
        fibonacciHeap3.meld(fibonacciHeap18);
        fibonacciHeap1.meld(fibonacciHeap3);
        int int22 = fibonacciHeap3.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int25 = fibonacciHeap24.potential();
        fibonacciHeap24.deleteMin();
        int[] intArray27 = fibonacciHeap24.countersRep();
        int int28 = fibonacciHeap24.potential();
        fibonacciHeap3.meld(fibonacciHeap24);
        int int30 = fibonacciHeap24.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int33 = fibonacciHeap32.size();
        fibonacciHeap32.deleteMin();
        int int35 = fibonacciHeap32.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int38 = fibonacciHeap37.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap37.meld(fibonacciHeap40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap37.meld(fibonacciHeap43);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        fibonacciHeap49.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap49.new HeapNode(0);
        fibonacciHeap37.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap56 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int57 = fibonacciHeap56.size();
        fibonacciHeap49.meld(fibonacciHeap56);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap60 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int61 = fibonacciHeap60.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap63 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap60.meld(fibonacciHeap63);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap66 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap60.meld(fibonacciHeap66);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap69 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int70 = fibonacciHeap69.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap72 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap69.meld(fibonacciHeap72);
        fibonacciHeap72.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode76 = fibonacciHeap72.new HeapNode(0);
        fibonacciHeap60.meld(fibonacciHeap72);
        fibonacciHeap56.meld(fibonacciHeap60);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap80 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode82 = fibonacciHeap80.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap84 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int85 = fibonacciHeap84.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap87 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int88 = fibonacciHeap87.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode90 = fibonacciHeap87.insert(0);
        fibonacciHeap84.delete(heapNode90);
        fibonacciHeap80.delete(heapNode90);
        boolean boolean93 = fibonacciHeap80.empty();
        fibonacciHeap56.meld(fibonacciHeap80);
        fibonacciHeap32.meld(fibonacciHeap56);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode96 = fibonacciHeap56.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap24.delete(heapNode96);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode4 = fibonacciHeap1.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int7 = fibonacciHeap6.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap6.meld(fibonacciHeap9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap6.meld(fibonacciHeap12);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap15.meld(fibonacciHeap18);
        fibonacciHeap18.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap18.new HeapNode(0);
        fibonacciHeap6.meld(fibonacciHeap18);
        int[] intArray24 = fibonacciHeap18.countersRep();
        boolean boolean25 = fibonacciHeap18.empty();
        fibonacciHeap1.meld(fibonacciHeap18);
        int int27 = fibonacciHeap18.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap18.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap18.new HeapNode((int) (short) 0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap32.insert(1);
        boolean boolean35 = fibonacciHeap32.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap32.new HeapNode((int) ' ');
        int int38 = heapNode37.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap18.delete(heapNode37);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap0.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int5 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap4.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        fibonacciHeap16.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap16.new HeapNode(0);
        fibonacciHeap4.meld(fibonacciHeap16);
        int[] intArray22 = fibonacciHeap4.countersRep();
        fibonacciHeap0.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap25.meld(fibonacciHeap28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode31 = fibonacciHeap25.new HeapNode((int) (short) 0);
        int int32 = fibonacciHeap25.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap37.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int42 = fibonacciHeap41.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int45 = fibonacciHeap44.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap44.insert(0);
        fibonacciHeap41.delete(heapNode47);
        fibonacciHeap37.delete(heapNode47);
        fibonacciHeap34.delete(heapNode47);
        fibonacciHeap25.delete(heapNode47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int54 = fibonacciHeap53.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap56 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap53.meld(fibonacciHeap56);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int60 = fibonacciHeap59.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap62 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap59.meld(fibonacciHeap62);
        fibonacciHeap56.meld(fibonacciHeap62);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode66 = fibonacciHeap62.new HeapNode((int) (byte) 100);
        int[] intArray67 = fibonacciHeap62.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode69 = fibonacciHeap62.new HeapNode(35);
        fibonacciHeap25.delete(heapNode69);
        int[] intArray71 = fibonacciHeap25.countersRep();
        int int72 = fibonacciHeap25.potential();
        fibonacciHeap0.meld(fibonacciHeap25);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap75 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode77 = fibonacciHeap75.insert(1);
        boolean boolean78 = fibonacciHeap75.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode80 = fibonacciHeap75.new HeapNode(3);
        fibonacciHeap75.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode82 = fibonacciHeap75.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode84 = fibonacciHeap75.new HeapNode((int) (byte) -1);
        int int85 = heapNode84.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap25.delete(heapNode84);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap20.new HeapNode((int) (byte) 10);
        fibonacciHeap20.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap27.insert(0);
        fibonacciHeap27.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap33.insert(1);
        int int36 = heapNode35.key;
        int int37 = heapNode35.key;
        fibonacciHeap27.delete(heapNode35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap20.delete(heapNode35);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap4.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap11.insert(0);
        fibonacciHeap8.delete(heapNode14);
        fibonacciHeap4.delete(heapNode14);
        heapNode14.key = ' ';
        int int19 = heapNode14.getKey();
        fibonacciHeap1.delete(heapNode14);
        int int21 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap25.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap25.new HeapNode(10);
        fibonacciHeap23.delete(heapNode29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap23.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap23);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap1.new HeapNode(32);
        int int37 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap39.deleteMin();
        fibonacciHeap39.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int44 = fibonacciHeap43.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap43.meld(fibonacciHeap46);
        int int48 = fibonacciHeap43.size();
        fibonacciHeap39.meld(fibonacciHeap43);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap39.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap39.new HeapNode(100);
        int int54 = heapNode53.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode53);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.new HeapNode((int) (short) 1);
        fibonacciHeap1.deleteMin();
        int int5 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        int[] intArray9 = fibonacciHeap7.countersRep();
        int int10 = fibonacciHeap7.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap14.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int19 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap21.insert(0);
        fibonacciHeap18.delete(heapNode24);
        fibonacciHeap14.delete(heapNode24);
        boolean boolean27 = fibonacciHeap14.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        fibonacciHeap14.meld(fibonacciHeap29);
        fibonacciHeap12.meld(fibonacciHeap14);
        boolean boolean33 = fibonacciHeap12.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap12.new HeapNode((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap12.insert(35);
        fibonacciHeap7.meld(fibonacciHeap12);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap12.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap12.insert(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode41);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        boolean boolean7 = fibonacciHeap4.empty();
        fibonacciHeap4.deleteMin();
        int int9 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.findMin();
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap16.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int24 = fibonacciHeap23.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap23.insert(0);
        fibonacciHeap20.delete(heapNode26);
        fibonacciHeap16.delete(heapNode26);
        fibonacciHeap13.delete(heapNode26);
        int[] intArray30 = fibonacciHeap13.countersRep();
        boolean boolean31 = fibonacciHeap13.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap13.insert(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode33);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        int int9 = fibonacciHeap7.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap11.meld(fibonacciHeap14);
        fibonacciHeap14.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap14.new HeapNode(0);
        int int19 = fibonacciHeap14.size();
        int int20 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap14.new HeapNode((int) '4');
        heapNode22.key = 0;
        fibonacciHeap7.delete(heapNode22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap27.insert(1);
        boolean boolean30 = fibonacciHeap27.empty();
        int int31 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode34 = fibonacciHeap32.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap36.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int46 = fibonacciHeap45.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap45.meld(fibonacciHeap48);
        fibonacciHeap48.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap48.new HeapNode(0);
        fibonacciHeap36.meld(fibonacciHeap48);
        int[] intArray54 = fibonacciHeap36.countersRep();
        fibonacciHeap32.meld(fibonacciHeap36);
        fibonacciHeap27.meld(fibonacciHeap36);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap36.new HeapNode((int) (short) 100);
        int int59 = heapNode58.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap7.delete(heapNode58);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int21 = fibonacciHeap20.size();
        fibonacciHeap13.meld(fibonacciHeap20);
        int int23 = fibonacciHeap20.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap20.new HeapNode(2);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap27.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap34.insert(0);
        fibonacciHeap31.delete(heapNode37);
        fibonacciHeap27.delete(heapNode37);
        boolean boolean40 = fibonacciHeap27.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int43 = fibonacciHeap42.size();
        fibonacciHeap27.meld(fibonacciHeap42);
        int int45 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap27.insert((int) (byte) 100);
        fibonacciHeap20.delete(heapNode47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap50.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap54 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int55 = fibonacciHeap54.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap54.findMin();
        fibonacciHeap50.delete(heapNode56);
        int int58 = fibonacciHeap50.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode60 = fibonacciHeap50.insert(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap20.delete(heapNode60);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        boolean boolean4 = fibonacciHeap1.empty();
        int int5 = fibonacciHeap1.size();
        int int6 = fibonacciHeap1.size();
        boolean boolean7 = fibonacciHeap1.empty();
        int int8 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap1.insert((int) (byte) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap12.new HeapNode((int) (short) 0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap12.new HeapNode((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap22.insert(1);
        boolean boolean25 = fibonacciHeap22.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap22.new HeapNode((int) ' ');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap22.new HeapNode((int) '#');
        fibonacciHeap12.delete(heapNode29);
        fibonacciHeap1.delete(heapNode29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap1.new HeapNode(10);
        int int34 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap36.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int46 = fibonacciHeap45.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap45.meld(fibonacciHeap48);
        fibonacciHeap48.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode52 = fibonacciHeap48.new HeapNode(0);
        fibonacciHeap36.meld(fibonacciHeap48);
        int int54 = fibonacciHeap48.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap48.new HeapNode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode56);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap1.findMin();
        int int3 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int6 = fibonacciHeap5.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap5.meld(fibonacciHeap8);
        fibonacciHeap8.deleteMin();
        int[] intArray11 = fibonacciHeap8.countersRep();
        int int12 = fibonacciHeap8.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap8.new HeapNode(0);
        int int15 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap8.insert((int) (short) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap8.findMin();
        int int19 = heapNode18.key;
        int int20 = heapNode18.key;
        heapNode18.key = (short) 1;
        fibonacciHeap1.delete(heapNode18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap25.deleteMin();
        fibonacciHeap25.deleteMin();
        fibonacciHeap25.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        int[] intArray31 = fibonacciHeap30.countersRep();
        fibonacciHeap25.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap34.meld(fibonacciHeap37);
        fibonacciHeap37.deleteMin();
        boolean boolean40 = fibonacciHeap37.empty();
        fibonacciHeap37.deleteMin();
        int int42 = fibonacciHeap37.size();
        boolean boolean43 = fibonacciHeap37.empty();
        fibonacciHeap37.deleteMin();
        int int45 = fibonacciHeap37.size();
        fibonacciHeap25.meld(fibonacciHeap37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode48 = fibonacciHeap37.new HeapNode((int) (byte) 1);
        int int49 = heapNode48.getKey();
        int int50 = heapNode48.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode48);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        int[] intArray3 = fibonacciHeap1.countersRep();
        int int4 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap1.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap1.insert(100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode12 = fibonacciHeap10.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap10.new HeapNode(10);
        fibonacciHeap10.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int18 = fibonacciHeap17.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap17.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap17.new HeapNode((int) (short) 0);
        heapNode23.key = (byte) 100;
        heapNode23.key = (-1);
        fibonacciHeap10.delete(heapNode23);
        fibonacciHeap10.deleteMin();
        fibonacciHeap1.meld(fibonacciHeap10);
        int[] intArray31 = fibonacciHeap10.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap10.new HeapNode(9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int36 = fibonacciHeap35.size();
        int[] intArray37 = fibonacciHeap35.countersRep();
        int int38 = fibonacciHeap35.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap35.insert(0);
        fibonacciHeap35.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap35.new HeapNode((int) (short) 10);
        int int44 = heapNode43.getKey();
        heapNode43.key = 4;
        heapNode43.key = 'a';
        heapNode43.key = 8;
        int int51 = heapNode43.getKey();
        int int52 = heapNode43.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap10.delete(heapNode43);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 100);
        fibonacciHeap10.deleteMin();
        fibonacciHeap10.deleteMin();
        int int13 = fibonacciHeap10.potential();
        fibonacciHeap10.deleteMin();
        fibonacciHeap7.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode19 = fibonacciHeap17.new HeapNode((int) (short) 1);
        fibonacciHeap17.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap17.insert((int) (short) 0);
        heapNode22.key = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap10.delete(heapNode22);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap22.meld(fibonacciHeap25);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap22.meld(fibonacciHeap28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap31.meld(fibonacciHeap34);
        fibonacciHeap34.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap34.new HeapNode(0);
        fibonacciHeap22.meld(fibonacciHeap34);
        int[] intArray40 = fibonacciHeap34.countersRep();
        boolean boolean41 = fibonacciHeap34.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap34.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap45 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode46 = fibonacciHeap45.findMin();
        int int47 = heapNode46.key;
        fibonacciHeap34.delete(heapNode46);
        fibonacciHeap1.delete(heapNode46);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode51 = fibonacciHeap1.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int54 = fibonacciHeap53.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap56 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap53.meld(fibonacciHeap56);
        int int58 = fibonacciHeap53.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode59 = fibonacciHeap53.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap60 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap60.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap64 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int65 = fibonacciHeap64.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap67 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap64.meld(fibonacciHeap67);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap70 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap64.meld(fibonacciHeap70);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap73 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int74 = fibonacciHeap73.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap76 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap73.meld(fibonacciHeap76);
        fibonacciHeap76.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode80 = fibonacciHeap76.new HeapNode(0);
        fibonacciHeap64.meld(fibonacciHeap76);
        int[] intArray82 = fibonacciHeap64.countersRep();
        fibonacciHeap60.meld(fibonacciHeap64);
        fibonacciHeap53.meld(fibonacciHeap60);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap86 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode88 = fibonacciHeap86.insert(1);
        boolean boolean89 = fibonacciHeap86.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode91 = fibonacciHeap86.new HeapNode((int) ' ');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode93 = fibonacciHeap86.new HeapNode((int) '#');
        fibonacciHeap53.delete(heapNode93);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode96 = fibonacciHeap53.insert(2);
        int int97 = heapNode96.key;
        int int98 = heapNode96.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode96);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int6 = fibonacciHeap5.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode11 = fibonacciHeap8.insert(0);
        fibonacciHeap5.delete(heapNode11);
        fibonacciHeap1.delete(heapNode11);
        boolean boolean14 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int17 = fibonacciHeap16.size();
        fibonacciHeap1.meld(fibonacciHeap16);
        fibonacciHeap16.deleteMin();
        fibonacciHeap16.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap22.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap29.insert(0);
        fibonacciHeap26.delete(heapNode32);
        fibonacciHeap22.delete(heapNode32);
        heapNode32.key = ' ';
        heapNode32.key = (short) -1;
        heapNode32.key = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap16.delete(heapNode32);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(4);
        int int2 = fibonacciHeap1.size();
        fibonacciHeap1.deleteMin();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int7 = fibonacciHeap6.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap6.meld(fibonacciHeap9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap6.meld(fibonacciHeap12);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap15.meld(fibonacciHeap18);
        fibonacciHeap18.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap18.new HeapNode(0);
        fibonacciHeap6.meld(fibonacciHeap18);
        int[] intArray24 = fibonacciHeap18.countersRep();
        boolean boolean25 = fibonacciHeap18.empty();
        fibonacciHeap18.deleteMin();
        int int27 = fibonacciHeap18.potential();
        fibonacciHeap18.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap18.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int33 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap32.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap38.meld(fibonacciHeap41);
        fibonacciHeap35.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap35.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap35.new HeapNode(0);
        int[] intArray48 = fibonacciHeap35.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap35.insert(100);
        fibonacciHeap18.delete(heapNode50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode50);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap1.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap24.new HeapNode(0);
        fibonacciHeap24.deleteMin();
        int int29 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap34.insert(0);
        fibonacciHeap31.delete(heapNode37);
        heapNode37.key = (short) 1;
        int int41 = heapNode37.key;
        int int42 = heapNode37.key;
        int int43 = heapNode37.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap24.delete(heapNode37);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(0);
        int[] intArray2 = fibonacciHeap1.countersRep();
        int[] intArray3 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int6 = fibonacciHeap5.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap5.meld(fibonacciHeap8);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap5.meld(fibonacciHeap11);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap14 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int15 = fibonacciHeap14.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap14.meld(fibonacciHeap17);
        fibonacciHeap17.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap17.new HeapNode(0);
        fibonacciHeap5.meld(fibonacciHeap17);
        int[] intArray23 = fibonacciHeap5.countersRep();
        int int24 = fibonacciHeap5.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int27 = fibonacciHeap26.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap29.insert(0);
        fibonacciHeap26.delete(heapNode32);
        fibonacciHeap5.meld(fibonacciHeap26);
        int[] intArray35 = fibonacciHeap26.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap26.new HeapNode(97);
        int int38 = fibonacciHeap26.potential();
        fibonacciHeap1.meld(fibonacciHeap26);
        int int40 = fibonacciHeap26.potential();
        int[] intArray41 = fibonacciHeap26.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap43.insert((int) (short) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int48 = fibonacciHeap47.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap47.meld(fibonacciHeap50);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap47.meld(fibonacciHeap53);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap56 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int57 = fibonacciHeap56.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap56.meld(fibonacciHeap59);
        fibonacciHeap59.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode63 = fibonacciHeap59.new HeapNode(0);
        fibonacciHeap47.meld(fibonacciHeap59);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap66 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int67 = fibonacciHeap66.size();
        fibonacciHeap59.meld(fibonacciHeap66);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap70 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int71 = fibonacciHeap70.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap73 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap70.meld(fibonacciHeap73);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap76 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap70.meld(fibonacciHeap76);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap79 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int80 = fibonacciHeap79.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap82 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap79.meld(fibonacciHeap82);
        fibonacciHeap82.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode86 = fibonacciHeap82.new HeapNode(0);
        fibonacciHeap70.meld(fibonacciHeap82);
        fibonacciHeap66.meld(fibonacciHeap70);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode90 = fibonacciHeap70.insert((int) (byte) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode92 = fibonacciHeap70.new HeapNode(7);
        fibonacciHeap43.meld(fibonacciHeap70);
        int[] intArray94 = fibonacciHeap70.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode96 = fibonacciHeap70.new HeapNode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap26.delete(heapNode96);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        boolean boolean7 = fibonacciHeap4.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap4.insert(97);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap11.insert(1);
        int int14 = heapNode13.key;
        heapNode13.key = '4';
        heapNode13.key = 1;
        fibonacciHeap4.delete(heapNode13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap21.deleteMin();
        fibonacciHeap21.deleteMin();
        fibonacciHeap21.deleteMin();
        int int25 = fibonacciHeap21.potential();
        int[] intArray26 = fibonacciHeap21.countersRep();
        int int27 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int30 = fibonacciHeap29.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap29.meld(fibonacciHeap32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap29.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap38.meld(fibonacciHeap41);
        fibonacciHeap41.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode45 = fibonacciHeap41.new HeapNode(0);
        fibonacciHeap29.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int49 = fibonacciHeap48.size();
        fibonacciHeap29.meld(fibonacciHeap48);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap29.meld(fibonacciHeap52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode58 = fibonacciHeap55.insert(0);
        fibonacciHeap55.deleteMin();
        fibonacciHeap52.meld(fibonacciHeap55);
        fibonacciHeap21.meld(fibonacciHeap52);
        int[] intArray62 = fibonacciHeap52.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode64 = fibonacciHeap52.new HeapNode(9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode66 = fibonacciHeap52.insert((int) (short) 100);
        int int67 = heapNode66.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode66);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.findMin();
        int int4 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap5.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap5.new HeapNode((int) (short) 100);
        boolean boolean10 = fibonacciHeap5.empty();
        fibonacciHeap1.meld(fibonacciHeap5);
        boolean boolean12 = fibonacciHeap5.empty();
        int int13 = fibonacciHeap5.size();
        int int14 = fibonacciHeap5.potential();
        fibonacciHeap5.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap5.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode19 = fibonacciHeap5.new HeapNode(100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap21.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap21.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        fibonacciHeap21.meld(fibonacciHeap27);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap27.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap27.new HeapNode(0);
        int int33 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(32);
        boolean boolean36 = fibonacciHeap35.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode38 = fibonacciHeap35.new HeapNode((int) (byte) -1);
        fibonacciHeap27.delete(heapNode38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap5.delete(heapNode38);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) ' ');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int4 = fibonacciHeap3.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap3.insert(0);
        fibonacciHeap3.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int10 = fibonacciHeap9.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap9.meld(fibonacciHeap12);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int16 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap15.meld(fibonacciHeap18);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap12.new HeapNode((int) (short) 10);
        fibonacciHeap3.meld(fibonacciHeap12);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap12.new HeapNode(35);
        fibonacciHeap1.meld(fibonacciHeap12);
        int int27 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 1);
        int int30 = fibonacciHeap29.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int33 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap32.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap32.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int42 = fibonacciHeap41.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap41.meld(fibonacciHeap44);
        fibonacciHeap44.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode48 = fibonacciHeap44.new HeapNode(0);
        fibonacciHeap32.meld(fibonacciHeap44);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap51 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int52 = fibonacciHeap51.size();
        fibonacciHeap44.meld(fibonacciHeap51);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap55.meld(fibonacciHeap58);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap55.meld(fibonacciHeap61);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap64 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int65 = fibonacciHeap64.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap67 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap64.meld(fibonacciHeap67);
        fibonacciHeap67.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode71 = fibonacciHeap67.new HeapNode(0);
        fibonacciHeap55.meld(fibonacciHeap67);
        fibonacciHeap51.meld(fibonacciHeap55);
        int[] intArray74 = fibonacciHeap55.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode75 = fibonacciHeap55.findMin();
        int int76 = fibonacciHeap55.potential();
        fibonacciHeap29.meld(fibonacciHeap55);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode79 = fibonacciHeap29.new HeapNode(8);
        fibonacciHeap1.delete(heapNode79);
        int[] intArray81 = fibonacciHeap1.countersRep();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.deleteMin();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap0.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode4 = fibonacciHeap0.new HeapNode((int) (short) 100);
        boolean boolean5 = fibonacciHeap0.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap0.insert(7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int10 = fibonacciHeap9.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap9.meld(fibonacciHeap12);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap9.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int19 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap18.meld(fibonacciHeap21);
        fibonacciHeap21.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap21.new HeapNode(0);
        fibonacciHeap9.meld(fibonacciHeap21);
        int[] intArray27 = fibonacciHeap9.countersRep();
        int int28 = fibonacciHeap9.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int31 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int34 = fibonacciHeap33.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap33.insert(0);
        fibonacciHeap30.delete(heapNode36);
        fibonacciHeap9.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap30.new HeapNode(2);
        heapNode40.key = (byte) 10;
        int int43 = heapNode40.getKey();
        int int44 = heapNode40.getKey();
        fibonacciHeap0.delete(heapNode40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode46 = fibonacciHeap0.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode49 = fibonacciHeap47.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap51 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int52 = fibonacciHeap51.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap54 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap51.meld(fibonacciHeap54);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap57 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap51.meld(fibonacciHeap57);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap60 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int61 = fibonacciHeap60.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap63 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap60.meld(fibonacciHeap63);
        fibonacciHeap63.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap63.new HeapNode(0);
        fibonacciHeap51.meld(fibonacciHeap63);
        int[] intArray69 = fibonacciHeap51.countersRep();
        fibonacciHeap47.meld(fibonacciHeap51);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode72 = fibonacciHeap51.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode74 = fibonacciHeap51.new HeapNode((int) '#');
        int int75 = heapNode74.getKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap0.delete(heapNode74);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap0.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int5 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap4.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        fibonacciHeap16.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap16.new HeapNode(0);
        fibonacciHeap4.meld(fibonacciHeap16);
        int[] intArray22 = fibonacciHeap4.countersRep();
        fibonacciHeap0.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap4.new HeapNode((-1));
        int int26 = fibonacciHeap4.size();
        fibonacciHeap4.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap4.insert(52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap30.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap34.meld(fibonacciHeap37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap34.meld(fibonacciHeap40);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int44 = fibonacciHeap43.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap43.meld(fibonacciHeap46);
        fibonacciHeap46.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode50 = fibonacciHeap46.new HeapNode(0);
        fibonacciHeap34.meld(fibonacciHeap46);
        int[] intArray52 = fibonacciHeap34.countersRep();
        fibonacciHeap30.meld(fibonacciHeap34);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap30.new HeapNode((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode57 = fibonacciHeap30.insert(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int60 = fibonacciHeap59.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap62 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode64 = fibonacciHeap62.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap66 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int67 = fibonacciHeap66.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap69 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int70 = fibonacciHeap69.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode72 = fibonacciHeap69.insert(0);
        fibonacciHeap66.delete(heapNode72);
        fibonacciHeap62.delete(heapNode72);
        heapNode72.key = ' ';
        int int77 = heapNode72.getKey();
        fibonacciHeap59.delete(heapNode72);
        heapNode72.key = '4';
        fibonacciHeap30.delete(heapNode72);
        int int82 = heapNode72.key;
        fibonacciHeap4.delete(heapNode72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.deleteMin();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap13.countersRep();
        boolean boolean20 = fibonacciHeap13.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap13.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap24.findMin();
        int int27 = fibonacciHeap24.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap28.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap28.new HeapNode((int) (short) 100);
        boolean boolean33 = fibonacciHeap28.empty();
        fibonacciHeap24.meld(fibonacciHeap28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap24.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap24.findMin();
        int int37 = heapNode36.getKey();
        fibonacciHeap13.delete(heapNode36);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int41 = fibonacciHeap40.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap40.meld(fibonacciHeap43);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap40.meld(fibonacciHeap46);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int50 = fibonacciHeap49.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap49.meld(fibonacciHeap52);
        fibonacciHeap52.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap52.new HeapNode(0);
        fibonacciHeap40.meld(fibonacciHeap52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode59 = fibonacciHeap40.insert((-1));
        fibonacciHeap40.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode61 = fibonacciHeap40.findMin();
        boolean boolean62 = fibonacciHeap40.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode63 = fibonacciHeap40.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap13.delete(heapNode63);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int[] intArray19 = fibonacciHeap1.countersRep();
        int int20 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int23 = fibonacciHeap22.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap25.insert(0);
        fibonacciHeap22.delete(heapNode28);
        fibonacciHeap1.meld(fibonacciHeap22);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap22.new HeapNode(2);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap22.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap34.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int39 = fibonacciHeap38.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap38.meld(fibonacciHeap41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap38.meld(fibonacciHeap44);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int48 = fibonacciHeap47.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap50 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap47.meld(fibonacciHeap50);
        fibonacciHeap50.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode54 = fibonacciHeap50.new HeapNode(0);
        fibonacciHeap38.meld(fibonacciHeap50);
        int[] intArray56 = fibonacciHeap38.countersRep();
        fibonacciHeap34.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode59 = fibonacciHeap38.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode61 = fibonacciHeap38.insert((int) ' ');
        int int62 = fibonacciHeap38.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode64 = fibonacciHeap38.new HeapNode((int) (byte) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode66 = fibonacciHeap38.new HeapNode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap22.delete(heapNode66);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.findMin();
        int int4 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode7 = fibonacciHeap5.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap5.new HeapNode((int) (short) 100);
        boolean boolean10 = fibonacciHeap5.empty();
        fibonacciHeap1.meld(fibonacciHeap5);
        fibonacciHeap5.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap5.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap15.deleteMin();
        fibonacciHeap15.deleteMin();
        boolean boolean18 = fibonacciHeap15.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap15.insert(100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap15.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap15.insert((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap5.delete(heapNode23);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap27.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int32 = fibonacciHeap31.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode37 = fibonacciHeap34.insert(0);
        fibonacciHeap31.delete(heapNode37);
        fibonacciHeap27.delete(heapNode37);
        fibonacciHeap24.delete(heapNode37);
        fibonacciHeap1.delete(heapNode37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap42.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int47 = fibonacciHeap46.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap46.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap46.meld(fibonacciHeap52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap55.meld(fibonacciHeap58);
        fibonacciHeap58.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode62 = fibonacciHeap58.new HeapNode(0);
        fibonacciHeap46.meld(fibonacciHeap58);
        int[] intArray64 = fibonacciHeap46.countersRep();
        fibonacciHeap42.meld(fibonacciHeap46);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap46.new HeapNode((-1));
        int int68 = heapNode67.getKey();
        fibonacciHeap1.delete(heapNode67);
        int int70 = fibonacciHeap1.potential();
        int int71 = fibonacciHeap1.potential();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.deleteMin();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(32);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap3 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int4 = fibonacciHeap3.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap3.meld(fibonacciHeap6);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap9 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap3.meld(fibonacciHeap9);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        fibonacciHeap15.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode19 = fibonacciHeap15.new HeapNode(0);
        fibonacciHeap3.meld(fibonacciHeap15);
        boolean boolean21 = fibonacciHeap15.empty();
        boolean boolean22 = fibonacciHeap15.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap15.findMin();
        int int24 = fibonacciHeap15.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap15.new HeapNode((int) (short) 100);
        fibonacciHeap1.delete(heapNode26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap1.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int31 = fibonacciHeap30.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap30.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap30.meld(fibonacciHeap36);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int40 = fibonacciHeap39.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap42 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap39.meld(fibonacciHeap42);
        fibonacciHeap42.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode46 = fibonacciHeap42.new HeapNode(0);
        fibonacciHeap30.meld(fibonacciHeap42);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int50 = fibonacciHeap49.size();
        fibonacciHeap30.meld(fibonacciHeap49);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap53 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap30.meld(fibonacciHeap53);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode55 = fibonacciHeap30.findMin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode55);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        int int23 = fibonacciHeap20.size();
        fibonacciHeap20.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap20.new HeapNode((int) (short) -1);
        int int27 = fibonacciHeap20.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap20.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode30 = fibonacciHeap20.new HeapNode((int) (short) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap34.insert(1);
        int int37 = heapNode36.key;
        int int38 = heapNode36.key;
        heapNode36.key = (-1);
        int int41 = heapNode36.getKey();
        fibonacciHeap32.delete(heapNode36);
        int int43 = fibonacciHeap32.size();
        int int44 = fibonacciHeap32.size();
        int int45 = fibonacciHeap32.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode47 = fibonacciHeap32.new HeapNode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap20.delete(heapNode47);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap4.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap11 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int12 = fibonacciHeap11.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap11.insert(0);
        fibonacciHeap8.delete(heapNode14);
        fibonacciHeap4.delete(heapNode14);
        heapNode14.key = ' ';
        int int19 = heapNode14.getKey();
        fibonacciHeap1.delete(heapNode14);
        int int21 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap25.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap25.new HeapNode(10);
        fibonacciHeap23.delete(heapNode29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap23.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap23);
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap1.new HeapNode(32);
        int int37 = fibonacciHeap1.potential();
        int[] intArray38 = fibonacciHeap1.countersRep();
        int int39 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int42 = fibonacciHeap41.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode46 = fibonacciHeap44.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap48 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int49 = fibonacciHeap48.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap51 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int52 = fibonacciHeap51.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode54 = fibonacciHeap51.insert(0);
        fibonacciHeap48.delete(heapNode54);
        fibonacciHeap44.delete(heapNode54);
        heapNode54.key = ' ';
        int int59 = heapNode54.getKey();
        fibonacciHeap41.delete(heapNode54);
        int int61 = fibonacciHeap41.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap63 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap65 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode67 = fibonacciHeap65.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode69 = fibonacciHeap65.new HeapNode(10);
        fibonacciHeap63.delete(heapNode69);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode72 = fibonacciHeap63.new HeapNode(0);
        fibonacciHeap41.meld(fibonacciHeap63);
        fibonacciHeap41.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode76 = fibonacciHeap41.new HeapNode(32);
        int int77 = heapNode76.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode76);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        int[] intArray7 = fibonacciHeap4.countersRep();
        int int8 = fibonacciHeap4.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.new HeapNode(0);
        int[] intArray11 = fibonacciHeap4.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode13 = fibonacciHeap4.new HeapNode((int) '#');
        int int14 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode15 = fibonacciHeap4.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap17 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode19 = fibonacciHeap17.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap24.insert(0);
        fibonacciHeap21.delete(heapNode27);
        fibonacciHeap17.delete(heapNode27);
        boolean boolean30 = fibonacciHeap17.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap17.insert(3);
        boolean boolean33 = fibonacciHeap17.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap17.insert((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode35);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        boolean boolean4 = fibonacciHeap1.empty();
        int int5 = fibonacciHeap1.size();
        int int6 = fibonacciHeap1.size();
        boolean boolean7 = fibonacciHeap1.empty();
        int int8 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap1.insert((int) (byte) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap12.new HeapNode((int) (short) 0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap12.new HeapNode((int) (short) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap22 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode24 = fibonacciHeap22.insert(1);
        boolean boolean25 = fibonacciHeap22.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap22.new HeapNode((int) ' ');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode29 = fibonacciHeap22.new HeapNode((int) '#');
        fibonacciHeap12.delete(heapNode29);
        fibonacciHeap1.delete(heapNode29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.deleteMin();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(4);
        int int2 = fibonacciHeap1.size();
        int int3 = fibonacciHeap1.potential();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap6 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int7 = fibonacciHeap6.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode8 = fibonacciHeap6.findMin();
        int int9 = fibonacciHeap6.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode12 = fibonacciHeap10.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode14 = fibonacciHeap10.new HeapNode((int) (short) 100);
        boolean boolean15 = fibonacciHeap10.empty();
        fibonacciHeap6.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap6.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap6.findMin();
        int int19 = heapNode18.getKey();
        int int20 = heapNode18.getKey();
        heapNode18.key = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode18);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap20 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        int int21 = fibonacciHeap20.size();
        fibonacciHeap1.meld(fibonacciHeap20);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        fibonacciHeap1.meld(fibonacciHeap24);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        fibonacciHeap30.deleteMin();
        int[] intArray33 = fibonacciHeap30.countersRep();
        int int34 = fibonacciHeap30.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode36 = fibonacciHeap30.new HeapNode(0);
        fibonacciHeap24.delete(heapNode36);
        boolean boolean38 = fibonacciHeap24.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap40 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int41 = fibonacciHeap40.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap43 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap40.meld(fibonacciHeap43);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap46 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap40.meld(fibonacciHeap46);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int50 = fibonacciHeap49.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap49.meld(fibonacciHeap52);
        fibonacciHeap52.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode56 = fibonacciHeap52.new HeapNode(0);
        fibonacciHeap40.meld(fibonacciHeap52);
        boolean boolean58 = fibonacciHeap52.empty();
        boolean boolean59 = fibonacciHeap52.empty();
        int int60 = fibonacciHeap52.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode61 = fibonacciHeap52.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode63 = fibonacciHeap52.new HeapNode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap24.delete(heapNode63);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap1.insert((-1));
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode22 = fibonacciHeap1.findMin();
        boolean boolean23 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap25 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int26 = fibonacciHeap25.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap28 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap25.meld(fibonacciHeap28);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap31 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap25.meld(fibonacciHeap31);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap34 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int35 = fibonacciHeap34.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap37 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap34.meld(fibonacciHeap37);
        fibonacciHeap37.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap37.new HeapNode(0);
        fibonacciHeap25.meld(fibonacciHeap37);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap25.insert((-1));
        fibonacciHeap25.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap47 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode49 = fibonacciHeap47.insert(1);
        boolean boolean50 = fibonacciHeap47.empty();
        int int51 = fibonacciHeap47.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode54 = fibonacciHeap52.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap56 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int57 = fibonacciHeap56.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap59 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap56.meld(fibonacciHeap59);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap62 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap56.meld(fibonacciHeap62);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap65 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int66 = fibonacciHeap65.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap68 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap65.meld(fibonacciHeap68);
        fibonacciHeap68.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode72 = fibonacciHeap68.new HeapNode(0);
        fibonacciHeap56.meld(fibonacciHeap68);
        int[] intArray74 = fibonacciHeap56.countersRep();
        fibonacciHeap52.meld(fibonacciHeap56);
        fibonacciHeap47.meld(fibonacciHeap56);
        fibonacciHeap47.deleteMin();
        fibonacciHeap25.meld(fibonacciHeap47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode79 = fibonacciHeap47.findMin();
        fibonacciHeap1.meld(fibonacciHeap47);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode81 = fibonacciHeap47.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap83 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) 0);
        int int84 = fibonacciHeap83.size();
        int[] intArray85 = fibonacciHeap83.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode87 = fibonacciHeap83.insert((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap47.delete(heapNode87);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap5 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int6 = fibonacciHeap5.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int9 = fibonacciHeap8.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode11 = fibonacciHeap8.insert(0);
        fibonacciHeap5.delete(heapNode11);
        fibonacciHeap1.delete(heapNode11);
        boolean boolean14 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode16 = fibonacciHeap1.insert(3);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int19 = fibonacciHeap18.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap18.insert(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap23 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int24 = fibonacciHeap23.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap23.meld(fibonacciHeap26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap29 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap23.meld(fibonacciHeap29);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap32 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int33 = fibonacciHeap32.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap32.meld(fibonacciHeap35);
        fibonacciHeap35.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode39 = fibonacciHeap35.new HeapNode(0);
        fibonacciHeap23.meld(fibonacciHeap35);
        int[] intArray41 = fibonacciHeap35.countersRep();
        boolean boolean42 = fibonacciHeap35.empty();
        fibonacciHeap18.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode44 = fibonacciHeap18.findMin();
        fibonacciHeap1.delete(heapNode44);
        fibonacciHeap1.deleteMin();
        fibonacciHeap1.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap49 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int50 = fibonacciHeap49.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap52 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap49.meld(fibonacciHeap52);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap49.meld(fibonacciHeap55);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap58 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int59 = fibonacciHeap58.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap61 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap58.meld(fibonacciHeap61);
        fibonacciHeap61.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode65 = fibonacciHeap61.new HeapNode(0);
        fibonacciHeap49.meld(fibonacciHeap61);
        int[] intArray67 = fibonacciHeap61.countersRep();
        boolean boolean68 = fibonacciHeap61.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode70 = fibonacciHeap61.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode72 = fibonacciHeap61.insert(100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap74 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int75 = fibonacciHeap74.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap77 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap74.meld(fibonacciHeap77);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap80 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap74.meld(fibonacciHeap80);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap83 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int84 = fibonacciHeap83.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap86 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap83.meld(fibonacciHeap86);
        fibonacciHeap86.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode90 = fibonacciHeap86.new HeapNode(0);
        fibonacciHeap74.meld(fibonacciHeap86);
        int[] intArray92 = fibonacciHeap74.countersRep();
        int int93 = fibonacciHeap74.potential();
        fibonacciHeap61.meld(fibonacciHeap74);
        int int95 = fibonacciHeap61.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode97 = fibonacciHeap61.new HeapNode((int) (short) 1);
        int int98 = heapNode97.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode97);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        fibonacciHeap4.deleteMin();
        int[] intArray7 = fibonacciHeap4.countersRep();
        int int8 = fibonacciHeap4.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode10 = fibonacciHeap4.new HeapNode(0);
        int int11 = fibonacciHeap4.potential();
        int[] intArray12 = fibonacciHeap4.countersRep();
        boolean boolean13 = fibonacciHeap4.empty();
        boolean boolean14 = fibonacciHeap4.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode18 = fibonacciHeap16.new HeapNode((int) (short) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode19 = fibonacciHeap16.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap16.insert(97);
        int int22 = fibonacciHeap16.size();
        boolean boolean23 = fibonacciHeap16.empty();
        int[] intArray24 = fibonacciHeap16.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode26 = fibonacciHeap16.insert(97);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap16.new HeapNode(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode28);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        boolean boolean4 = fibonacciHeap1.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode6 = fibonacciHeap1.new HeapNode((int) ' ');
        int[] intArray7 = fibonacciHeap1.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap8 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode9 = fibonacciHeap8.findMin();
        boolean boolean10 = fibonacciHeap8.empty();
        fibonacciHeap1.meld(fibonacciHeap8);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (short) -1);
        int[] intArray14 = fibonacciHeap13.countersRep();
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.insert(8);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap19 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode21 = fibonacciHeap19.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode23 = fibonacciHeap19.new HeapNode(10);
        int int24 = fibonacciHeap19.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap26 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        int[] intArray27 = fibonacciHeap26.countersRep();
        fibonacciHeap19.meld(fibonacciHeap26);
        fibonacciHeap26.deleteMin();
        fibonacciHeap26.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode32 = fibonacciHeap26.new HeapNode(35);
        fibonacciHeap13.meld(fibonacciHeap26);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap26.insert((int) (byte) 1);
        int int36 = heapNode35.key;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap8.delete(heapNode35);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap0 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode2 = fibonacciHeap0.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int5 = fibonacciHeap4.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap4.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap4.meld(fibonacciHeap10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int14 = fibonacciHeap13.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap16 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap13.meld(fibonacciHeap16);
        fibonacciHeap16.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode20 = fibonacciHeap16.new HeapNode(0);
        fibonacciHeap4.meld(fibonacciHeap16);
        int[] intArray22 = fibonacciHeap4.countersRep();
        fibonacciHeap0.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode25 = fibonacciHeap4.new HeapNode((-1));
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap27 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int28 = fibonacciHeap27.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap30 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap27.meld(fibonacciHeap30);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap33 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap27.meld(fibonacciHeap33);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap36 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int37 = fibonacciHeap36.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap39 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap36.meld(fibonacciHeap39);
        fibonacciHeap39.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode43 = fibonacciHeap39.new HeapNode(0);
        fibonacciHeap27.meld(fibonacciHeap39);
        int[] intArray45 = fibonacciHeap39.countersRep();
        int int46 = fibonacciHeap39.size();
        int int47 = fibonacciHeap39.size();
        fibonacciHeap4.meld(fibonacciHeap39);
        fibonacciHeap4.deleteMin();
        int int50 = fibonacciHeap4.size();
        boolean boolean51 = fibonacciHeap4.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode53 = fibonacciHeap4.new HeapNode(97);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap55 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int56 = fibonacciHeap55.size();
        int int57 = fibonacciHeap55.potential();
        int int58 = fibonacciHeap55.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap60 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int61 = fibonacciHeap60.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap63 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap60.meld(fibonacciHeap63);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap66 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int67 = fibonacciHeap66.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap69 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap66.meld(fibonacciHeap69);
        fibonacciHeap63.meld(fibonacciHeap69);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode73 = fibonacciHeap63.new HeapNode((int) (short) 10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap75 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int76 = fibonacciHeap75.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap78 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap75.meld(fibonacciHeap78);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap81 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap75.meld(fibonacciHeap81);
        fibonacciHeap63.meld(fibonacciHeap75);
        fibonacciHeap55.meld(fibonacciHeap75);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap86 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) (byte) -1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode88 = fibonacciHeap86.new HeapNode(100);
        fibonacciHeap55.meld(fibonacciHeap86);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode90 = fibonacciHeap86.findMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode92 = fibonacciHeap86.new HeapNode((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap4.delete(heapNode92);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int2 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap4 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap1.meld(fibonacciHeap4);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap1.meld(fibonacciHeap7);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap10 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int11 = fibonacciHeap10.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap13 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap10.meld(fibonacciHeap13);
        fibonacciHeap13.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode17 = fibonacciHeap13.new HeapNode(0);
        fibonacciHeap1.meld(fibonacciHeap13);
        int int19 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int25 = fibonacciHeap24.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode27 = fibonacciHeap24.insert(0);
        fibonacciHeap21.delete(heapNode27);
        heapNode27.key = (short) 1;
        int int31 = heapNode27.key;
        fibonacciHeap1.delete(heapNode27);
        int int33 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode35 = fibonacciHeap1.insert((int) (byte) 1);
        int int36 = fibonacciHeap1.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(5);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode40 = fibonacciHeap38.new HeapNode(0);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode41 = fibonacciHeap38.findMin();
        fibonacciHeap1.delete(heapNode41);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode46 = fibonacciHeap44.new HeapNode((int) (short) 1);
        int[] intArray47 = fibonacciHeap44.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode49 = fibonacciHeap44.insert((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap1.delete(heapNode49);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap1 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode3 = fibonacciHeap1.insert(1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode5 = fibonacciHeap1.new HeapNode(10);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap7 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int8 = fibonacciHeap7.size();
        fibonacciHeap1.meld(fibonacciHeap7);
        int int10 = fibonacciHeap1.potential();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap12 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int13 = fibonacciHeap12.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap15 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap12.meld(fibonacciHeap15);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap18 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap12.meld(fibonacciHeap18);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap21 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int22 = fibonacciHeap21.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap24 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap21.meld(fibonacciHeap24);
        fibonacciHeap24.deleteMin();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode28 = fibonacciHeap24.new HeapNode(0);
        fibonacciHeap12.meld(fibonacciHeap24);
        int[] intArray30 = fibonacciHeap24.countersRep();
        boolean boolean31 = fibonacciHeap24.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode33 = fibonacciHeap24.insert((int) (byte) 100);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap35 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int36 = fibonacciHeap35.size();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap38 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((int) 'a');
        fibonacciHeap35.meld(fibonacciHeap38);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap41 = new com.thealgorithms.datastructures.heaps.FibonacciHeap(10);
        fibonacciHeap35.meld(fibonacciHeap41);
        fibonacciHeap24.meld(fibonacciHeap35);
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap44 = new com.thealgorithms.datastructures.heaps.FibonacciHeap();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode46 = fibonacciHeap44.new HeapNode((int) (byte) 1);
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode48 = fibonacciHeap44.new HeapNode((int) (short) 100);
        int int49 = fibonacciHeap44.size();
        fibonacciHeap24.meld(fibonacciHeap44);
        fibonacciHeap1.meld(fibonacciHeap44);
        boolean boolean52 = fibonacciHeap44.empty();
        com.thealgorithms.datastructures.heaps.FibonacciHeap fibonacciHeap54 = new com.thealgorithms.datastructures.heaps.FibonacciHeap((-1));
        int int55 = fibonacciHeap54.size();
        fibonacciHeap54.deleteMin();
        int int57 = fibonacciHeap54.potential();
        int[] intArray58 = fibonacciHeap54.countersRep();
        com.thealgorithms.datastructures.heaps.FibonacciHeap.HeapNode heapNode60 = fibonacciHeap54.new HeapNode(3);
        heapNode60.key = 7;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fibonacciHeap44.delete(heapNode60);
    }
}

