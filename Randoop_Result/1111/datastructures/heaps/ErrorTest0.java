package datastructures.heaps;

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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
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
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
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
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
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
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
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
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
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
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
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
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
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
}

