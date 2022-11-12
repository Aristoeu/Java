package datastructures.queues;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isFull();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        int int2 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) (short) -1);
        circularQueue1.enQueue((int) 'a');
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isFull();
        boolean boolean11 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        int int2 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.peek();
        boolean boolean12 = circularQueue1.isFull();
        boolean boolean13 = circularQueue1.isFull();
        int int14 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) (short) 1);
        boolean boolean8 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (short) 10);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = circularQueue1.deQueue();
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (short) 1);
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = circularQueue1.deQueue();
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.deQueue();
        int int12 = circularQueue1.peek();
        boolean boolean13 = circularQueue1.isFull();
        boolean boolean14 = circularQueue1.isEmpty();
        int int15 = circularQueue1.deQueue();
        boolean boolean16 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 100);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(10);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) '#');
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = circularQueue1.deQueue();
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(52);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int4 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.deQueue();
        int int13 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.deQueue();
        int int12 = circularQueue1.deQueue();
        int int13 = circularQueue1.peek();
        boolean boolean14 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        int int11 = circularQueue1.deQueue();
        boolean boolean12 = circularQueue1.isFull();
        int int13 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.deQueue();
        boolean boolean13 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int10 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isFull();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean11 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.deQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        boolean boolean14 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        circularQueue1.enQueue(10);
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = circularQueue1.deQueue();
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (short) 1);
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = circularQueue1.deQueue();
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.enQueue(1);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = circularQueue1.deQueue();
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (byte) 10);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isEmpty();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 100);
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.deQueue();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int12 = circularQueue1.deQueue();
        int int13 = circularQueue1.peek();
        int int14 = circularQueue1.deQueue();
        int int15 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (short) -1);
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isEmpty();
        int int12 = circularQueue1.deQueue();
        boolean boolean13 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        int int11 = circularQueue1.deQueue();
        boolean boolean12 = circularQueue1.isFull();
        int int13 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int14 = circularQueue1.deQueue();
        boolean boolean15 = circularQueue1.isEmpty();
        boolean boolean16 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        circularQueue1.enQueue((int) (short) 1);
        int int4 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.peek();
        boolean boolean12 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean13 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        circularQueue1.enQueue((int) (short) -1);
        circularQueue1.enQueue((int) (byte) 10);
        int int13 = circularQueue1.peek();
        boolean boolean14 = circularQueue1.isEmpty();
        boolean boolean15 = circularQueue1.isFull();
        int int16 = circularQueue1.deQueue();
        boolean boolean17 = circularQueue1.isFull();
        int int18 = circularQueue1.peek();
        circularQueue1.enQueue((int) '4');
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = circularQueue1.deQueue();
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.deQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        int int12 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isFull();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(32);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (byte) 10);
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        boolean boolean14 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = circularQueue1.deQueue();
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isEmpty();
        boolean boolean12 = circularQueue1.isEmpty();
        int int13 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) '4');
        int int14 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = circularQueue1.peek();
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isEmpty();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) '4');
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = circularQueue1.peek();
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        int int2 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isFull();
        boolean boolean12 = circularQueue1.isEmpty();
        boolean boolean13 = circularQueue1.isFull();
        boolean boolean14 = circularQueue1.isFull();
        int int15 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        circularQueue1.enQueue(10);
        int int4 = circularQueue1.peek();
        circularQueue1.enQueue((-1));
        circularQueue1.enQueue(52);
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = circularQueue1.peek();
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.deQueue();
        boolean boolean11 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isFull();
        boolean boolean11 = circularQueue1.isFull();
        boolean boolean12 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = circularQueue1.deQueue();
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.deQueue();
        boolean boolean12 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (byte) 100);
        circularQueue1.enQueue((int) (byte) 10);
        circularQueue1.deleteQueue();
        boolean boolean18 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = circularQueue1.peek();
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        circularQueue1.enQueue((int) (short) 1);
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        circularQueue1.enQueue(0);
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = circularQueue1.peek();
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean11 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.deQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (byte) 100);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = circularQueue1.peek();
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isFull();
        boolean boolean11 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.enQueue(1);
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = circularQueue1.deQueue();
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) '4');
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = circularQueue1.peek();
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 10);
        int int2 = circularQueue1.peek();
        circularQueue1.enQueue((int) (byte) 1);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = circularQueue1.peek();
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        int int3 = circularQueue1.deQueue();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(52);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean15 = circularQueue1.isEmpty();
        int int16 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(10);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(52);
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        circularQueue1.enQueue((int) (short) 1);
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.enQueue(1);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int10 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.deQueue();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.deQueue();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean12 = circularQueue1.isFull();
        int int13 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isEmpty();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.deQueue();
        int int13 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(32);
        circularQueue1.enQueue((int) 'a');
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = circularQueue1.peek();
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) ' ');
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(10);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (byte) 1);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 10);
        int int2 = circularQueue1.peek();
        circularQueue1.enQueue((int) (byte) 1);
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = circularQueue1.deQueue();
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int13 = circularQueue1.deQueue();
        int int14 = circularQueue1.peek();
        int int15 = circularQueue1.peek();
        boolean boolean16 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isEmpty();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.deQueue();
        int int12 = circularQueue1.deQueue();
        int int13 = circularQueue1.peek();
        boolean boolean14 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = circularQueue1.peek();
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.deQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        boolean boolean14 = circularQueue1.isEmpty();
        boolean boolean15 = circularQueue1.isEmpty();
        int int16 = circularQueue1.deQueue();
        int int17 = circularQueue1.peek();
        int int18 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isEmpty();
        int int3 = circularQueue1.deQueue();
        circularQueue1.enQueue((-1));
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = circularQueue1.deQueue();
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) ' ');
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = circularQueue1.peek();
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int10 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (byte) 100);
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = circularQueue1.peek();
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int10 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int13 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isFull();
        circularQueue1.enQueue((int) '4');
        boolean boolean11 = circularQueue1.isEmpty();
        boolean boolean12 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = circularQueue1.peek();
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 100);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean12 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (byte) 10);
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        boolean boolean12 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.enQueue((int) (byte) 0);
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.deQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.deQueue();
        int int12 = circularQueue1.peek();
        boolean boolean13 = circularQueue1.isFull();
        boolean boolean14 = circularQueue1.isEmpty();
        boolean boolean15 = circularQueue1.isEmpty();
        boolean boolean16 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.deQueue();
        boolean boolean12 = circularQueue1.isEmpty();
        boolean boolean13 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isFull();
        boolean boolean12 = circularQueue1.isEmpty();
        boolean boolean13 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) (short) -1);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        circularQueue1.enQueue((int) ' ');
        boolean boolean11 = circularQueue1.isFull();
        boolean boolean12 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (short) 1);
        circularQueue1.enQueue((int) '#');
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = circularQueue1.peek();
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        circularQueue1.enQueue((int) (short) 1);
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (short) 0);
        circularQueue1.enQueue((int) (short) 1);
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean12 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = circularQueue1.deQueue();
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int13 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int12 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) (short) -1);
        circularQueue1.enQueue((int) 'a');
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (short) 0);
        int int13 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.deQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.deQueue();
        int int12 = circularQueue1.deQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        int int14 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) '4');
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = circularQueue1.peek();
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        int int11 = circularQueue1.deQueue();
        boolean boolean12 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        circularQueue1.enQueue(10);
        int int4 = circularQueue1.peek();
        circularQueue1.enQueue((-1));
        circularQueue1.enQueue(52);
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean12 = circularQueue1.isEmpty();
        int int13 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int12 = circularQueue1.deQueue();
        int int13 = circularQueue1.peek();
        int int14 = circularQueue1.deQueue();
        int int15 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 10);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int12 = circularQueue1.deQueue();
        int int13 = circularQueue1.peek();
        int int14 = circularQueue1.deQueue();
        boolean boolean15 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        boolean boolean12 = circularQueue1.isFull();
        boolean boolean13 = circularQueue1.isEmpty();
        int int14 = circularQueue1.deQueue();
        int int15 = circularQueue1.peek();
        boolean boolean16 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int10 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (byte) 10);
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (short) 100);
        int int12 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = circularQueue1.deQueue();
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.peek();
        boolean boolean12 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean14 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean16 = circularQueue1.isFull();
        boolean boolean17 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.peek();
        boolean boolean12 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isEmpty();
        int int12 = circularQueue1.deQueue();
        boolean boolean13 = circularQueue1.isFull();
        int int14 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.enQueue(1);
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = circularQueue1.deQueue();
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isEmpty();
        int int3 = circularQueue1.deQueue();
        circularQueue1.enQueue((-1));
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) (short) 100);
        circularQueue1.deleteQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isFull();
        boolean boolean11 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.deQueue();
        boolean boolean12 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int14 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        circularQueue1.enQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = circularQueue1.deQueue();
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        circularQueue1.enQueue((int) (byte) 100);
        circularQueue1.deleteQueue();
        boolean boolean12 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = circularQueue1.deQueue();
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int10 = circularQueue1.deQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.deQueue();
        int int12 = circularQueue1.peek();
        boolean boolean13 = circularQueue1.isFull();
        boolean boolean14 = circularQueue1.isEmpty();
        int int15 = circularQueue1.deQueue();
        int int16 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        circularQueue1.enQueue((int) (short) -1);
        circularQueue1.enQueue((int) (byte) 10);
        int int13 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean15 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = circularQueue1.deQueue();
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        circularQueue1.enQueue(10);
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 100);
        int int2 = circularQueue1.deQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.peek();
        boolean boolean12 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean14 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean16 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = circularQueue1.peek();
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.deQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        boolean boolean14 = circularQueue1.isFull();
        int int15 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.deQueue();
        int int12 = circularQueue1.peek();
        boolean boolean13 = circularQueue1.isFull();
        boolean boolean14 = circularQueue1.isEmpty();
        boolean boolean15 = circularQueue1.isEmpty();
        int int16 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        circularQueue1.enQueue((int) (short) 1);
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.enQueue(1);
        circularQueue1.enQueue((int) (short) 1);
        circularQueue1.enQueue((int) (byte) 1);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = circularQueue1.deQueue();
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        boolean boolean2 = circularQueue1.isFull();
        int int3 = circularQueue1.deQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        boolean boolean11 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 10);
        int int2 = circularQueue1.peek();
        circularQueue1.enQueue((int) (byte) 1);
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = circularQueue1.peek();
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.peek();
        boolean boolean12 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        circularQueue1.enQueue((int) ' ');
        boolean boolean11 = circularQueue1.isFull();
        boolean boolean12 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (short) 1);
        circularQueue1.enQueue((int) '#');
        boolean boolean17 = circularQueue1.isEmpty();
        boolean boolean18 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = circularQueue1.deQueue();
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) (short) 1);
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = circularQueue1.deQueue();
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(10);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        circularQueue1.enQueue((int) (short) 1);
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.peek();
        boolean boolean13 = circularQueue1.isFull();
        boolean boolean14 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = circularQueue1.deQueue();
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean12 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int10 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.deQueue();
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 100);
        int int2 = circularQueue1.deQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isFull();
        boolean boolean12 = circularQueue1.isFull();
        boolean boolean13 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        int int2 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.deQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        boolean boolean14 = circularQueue1.isEmpty();
        boolean boolean15 = circularQueue1.isEmpty();
        int int16 = circularQueue1.deQueue();
        int int17 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) (short) -1);
        circularQueue1.enQueue((int) 'a');
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isFull();
        boolean boolean11 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (short) 1);
        boolean boolean14 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = circularQueue1.deQueue();
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.deQueue();
        int int12 = circularQueue1.deQueue();
        boolean boolean13 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.deQueue();
        int int11 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int10 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 10);
        int int2 = circularQueue1.peek();
        circularQueue1.enQueue((int) (byte) 1);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = circularQueue1.peek();
    }
}

