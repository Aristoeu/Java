package queues;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1501");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.enQueue((int) '#');
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
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
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        circularQueue1.enQueue(10);
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int10 = circularQueue1.deQueue();
        boolean boolean11 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.deQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (byte) 100);
        circularQueue1.enQueue((int) (short) 10);
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = circularQueue1.peek();
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
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
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        circularQueue1.enQueue((int) (short) 1);
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.enQueue(1);
        circularQueue1.enQueue((int) (short) 1);
        circularQueue1.enQueue(10);
        int int13 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = circularQueue1.deQueue();
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
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
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = circularQueue1.deQueue();
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
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
        int int13 = circularQueue1.peek();
        boolean boolean14 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        circularQueue1.enQueue((int) (short) 1);
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        boolean boolean8 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = circularQueue1.deQueue();
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
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
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        circularQueue1.enQueue(10);
        circularQueue1.enQueue((int) (byte) 100);
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = circularQueue1.deQueue();
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.enQueue((int) (byte) 0);
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.enQueue((-1));
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = circularQueue1.deQueue();
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        int int2 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
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
        int int11 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        boolean boolean14 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
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
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
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
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
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
        boolean boolean11 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (byte) 10);
        circularQueue1.enQueue((int) (byte) 100);
        circularQueue1.enQueue(10);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
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
        circularQueue1.deleteQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        int int2 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
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
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
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
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
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
        int int13 = circularQueue1.deQueue();
        int int14 = circularQueue1.peek();
        int int15 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
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
        int int14 = circularQueue1.peek();
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int12 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int14 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isFull();
        boolean boolean12 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.deQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int13 = circularQueue1.deQueue();
        boolean boolean14 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) '4');
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
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
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isEmpty();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
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
        boolean boolean11 = circularQueue1.isFull();
        boolean boolean12 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
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
        boolean boolean12 = circularQueue1.isFull();
        int int13 = circularQueue1.peek();
        int int14 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean16 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int10 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int12 = circularQueue1.deQueue();
        int int13 = circularQueue1.peek();
        boolean boolean14 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
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
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
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
        boolean boolean14 = circularQueue1.isFull();
        boolean boolean15 = circularQueue1.isFull();
        int int16 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 10);
        int int2 = circularQueue1.peek();
        circularQueue1.enQueue((int) (byte) 1);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
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
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
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
        int int13 = circularQueue1.deQueue();
        int int14 = circularQueue1.peek();
        boolean boolean15 = circularQueue1.isEmpty();
        int int16 = circularQueue1.peek();
        boolean boolean17 = circularQueue1.isEmpty();
        boolean boolean18 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
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
        int int11 = circularQueue1.peek();
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
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
        boolean boolean13 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
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
        int int11 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean13 = circularQueue1.isFull();
        int int14 = circularQueue1.deQueue();
        int int15 = circularQueue1.peek();
        boolean boolean16 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
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
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.enQueue(1);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = circularQueue1.peek();
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        circularQueue1.enQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
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
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
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
        boolean boolean17 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) (short) 0);
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.deQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 10);
        int int2 = circularQueue1.peek();
        circularQueue1.enQueue((int) (byte) 1);
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
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
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
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
        int int12 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int14 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        circularQueue1.enQueue(10);
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
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
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (short) 1);
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (short) 100);
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (byte) 10);
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
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
        int int13 = circularQueue1.deQueue();
        int int14 = circularQueue1.peek();
        boolean boolean15 = circularQueue1.isEmpty();
        int int16 = circularQueue1.peek();
        boolean boolean17 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.deQueue();
        boolean boolean11 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
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
        boolean boolean12 = circularQueue1.isEmpty();
        int int13 = circularQueue1.deQueue();
        boolean boolean14 = circularQueue1.isEmpty();
        boolean boolean15 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
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
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int15 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        boolean boolean3 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (byte) 1);
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (byte) -1);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = circularQueue1.deQueue();
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = circularQueue1.peek();
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.deQueue();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        int int11 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(10);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) '4');
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = circularQueue1.peek();
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
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
        boolean boolean17 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
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
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
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
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
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
        int int14 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isFull();
        boolean boolean12 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
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
        int int13 = circularQueue1.peek();
        int int14 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
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
        int int19 = circularQueue1.deQueue();
        boolean boolean20 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
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
        boolean boolean13 = circularQueue1.isFull();
        boolean boolean14 = circularQueue1.isFull();
        int int15 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isEmpty();
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.deQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (byte) 100);
        circularQueue1.enQueue((int) (short) 10);
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = circularQueue1.deQueue();
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.deQueue();
        boolean boolean12 = circularQueue1.isFull();
        int int13 = circularQueue1.peek();
        boolean boolean14 = circularQueue1.isEmpty();
        boolean boolean15 = circularQueue1.isEmpty();
        boolean boolean16 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        circularQueue1.enQueue(10);
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
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
        circularQueue1.deleteQueue();
        boolean boolean16 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        int int4 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.peek();
        boolean boolean12 = circularQueue1.isFull();
        int int13 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (byte) 10);
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isEmpty();
        boolean boolean12 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = circularQueue1.deQueue();
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean12 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
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
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        boolean boolean10 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int12 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        circularQueue1.enQueue((int) (short) 0);
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = circularQueue1.peek();
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(10);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.peek();
        boolean boolean12 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
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
        int int14 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean16 = circularQueue1.isEmpty();
        boolean boolean17 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = circularQueue1.deQueue();
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 1);
        int int2 = circularQueue1.peek();
        circularQueue1.enQueue((int) ' ');
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = circularQueue1.deQueue();
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.deQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        boolean boolean12 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean12 = circularQueue1.isFull();
        int int13 = circularQueue1.peek();
        int int14 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 1);
        int int2 = circularQueue1.peek();
        circularQueue1.enQueue((int) ' ');
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = circularQueue1.deQueue();
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
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
        circularQueue1.deleteQueue();
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isFull();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
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
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
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
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
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
        boolean boolean12 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.enQueue(97);
        boolean boolean10 = circularQueue1.isFull();
        int int11 = circularQueue1.deQueue();
        circularQueue1.enQueue(0);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
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
        int int12 = circularQueue1.deQueue();
        int int13 = circularQueue1.deQueue();
        int int14 = circularQueue1.deQueue();
        boolean boolean15 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        boolean boolean2 = circularQueue1.isFull();
        int int3 = circularQueue1.deQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
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
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.enQueue(32);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
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
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isFull();
        boolean boolean10 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
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
        int int13 = circularQueue1.peek();
        int int14 = circularQueue1.peek();
        boolean boolean15 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
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
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        boolean boolean2 = circularQueue1.isFull();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isEmpty();
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.peek();
        int int13 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        int int3 = circularQueue1.deQueue();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 10);
        int int2 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(52);
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
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
        int int12 = circularQueue1.deQueue();
        int int13 = circularQueue1.peek();
        boolean boolean14 = circularQueue1.isFull();
        boolean boolean15 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
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
        int int11 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
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
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        boolean boolean3 = circularQueue1.isFull();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (byte) 0);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = circularQueue1.peek();
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
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
        boolean boolean14 = circularQueue1.isFull();
        int int15 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 1);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
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
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 100);
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 100);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
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
        int int12 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        int int2 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        int int2 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
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
        circularQueue1.deleteQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
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
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
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
        int int14 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 0);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean12 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean14 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        int int2 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) 'a');
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
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
        boolean boolean11 = circularQueue1.isFull();
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isFull();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.peek();
        boolean boolean9 = circularQueue1.isEmpty();
        int int10 = circularQueue1.peek();
        boolean boolean11 = circularQueue1.isEmpty();
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean12 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        boolean boolean2 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int12 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        int int6 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.deQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) (byte) 100);
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = circularQueue1.deQueue();
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 10);
        int int2 = circularQueue1.peek();
        circularQueue1.enQueue((int) (byte) 1);
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = circularQueue1.peek();
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        boolean boolean2 = circularQueue1.isFull();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        int int8 = circularQueue1.peek();
        int int9 = circularQueue1.peek();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.peek();
        boolean boolean12 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.peek();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.deQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean10 = circularQueue1.isEmpty();
        int int11 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(52);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
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
        int int11 = circularQueue1.peek();
        int int12 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
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
        boolean boolean11 = circularQueue1.isEmpty();
        boolean boolean12 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        circularQueue1.enQueue((int) (short) 1);
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) ' ');
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (short) 1);
        boolean boolean12 = circularQueue1.isEmpty();
        int int13 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = circularQueue1.deQueue();
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.deQueue();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
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
        boolean boolean12 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isFull();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int8 = circularQueue1.deQueue();
        boolean boolean9 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(97);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
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
        int int11 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean13 = circularQueue1.isEmpty();
        boolean boolean14 = circularQueue1.isFull();
        boolean boolean15 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(100);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.enQueue((int) (short) -1);
        circularQueue1.enQueue(97);
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = circularQueue1.deQueue();
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
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
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (byte) 100);
        int int2 = circularQueue1.deQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        int int5 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(0);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.peek();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        int int2 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        boolean boolean9 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        boolean boolean2 = circularQueue1.isEmpty();
        int int3 = circularQueue1.deQueue();
        circularQueue1.enQueue((-1));
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isEmpty();
        boolean boolean8 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
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
        int int13 = circularQueue1.peek();
        boolean boolean14 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
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
        int int12 = circularQueue1.peek();
        int int13 = circularQueue1.peek();
        int int14 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((-1));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int11 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        boolean boolean13 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 0);
        circularQueue1.deleteQueue();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isEmpty();
        int int6 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        int int2 = circularQueue1.deQueue();
        boolean boolean3 = circularQueue1.isFull();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        int int6 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(35);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        circularQueue1.enQueue((int) (byte) 0);
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isEmpty();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.peek();
        int int11 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(10);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(32);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) ' ');
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (short) 1);
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.enQueue((int) (short) 100);
        boolean boolean9 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = circularQueue1.deQueue();
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
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
        boolean boolean12 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isEmpty();
        int int5 = circularQueue1.peek();
        boolean boolean6 = circularQueue1.isFull();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 0);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isFull();
        boolean boolean9 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        boolean boolean2 = circularQueue1.isFull();
        boolean boolean3 = circularQueue1.isEmpty();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.enQueue((-1));
        int int7 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean9 = circularQueue1.isFull();
        int int10 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) -1);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
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
        boolean boolean14 = circularQueue1.isFull();
        int int15 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(0);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        boolean boolean4 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.peek();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) 'a');
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '4');
        boolean boolean2 = circularQueue1.isEmpty();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.deQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 10);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
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
        boolean boolean13 = circularQueue1.isFull();
        int int14 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '4');
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(1);
        boolean boolean2 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean6 = circularQueue1.isEmpty();
        int int7 = circularQueue1.peek();
        boolean boolean8 = circularQueue1.isFull();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.deQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) ' ');
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue(52);
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.enQueue((int) ' ');
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 100);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) '#');
        int int2 = circularQueue1.deQueue();
        int int3 = circularQueue1.peek();
        int int4 = circularQueue1.peek();
        boolean boolean5 = circularQueue1.isEmpty();
        boolean boolean6 = circularQueue1.isFull();
        boolean boolean7 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        int int9 = circularQueue1.deQueue();
        boolean boolean10 = circularQueue1.isFull();
        boolean boolean11 = circularQueue1.isFull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(1);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 1);
        circularQueue1.enQueue((int) '#');
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        int int6 = circularQueue1.peek();
        int int7 = circularQueue1.deQueue();
        int int8 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int10 = circularQueue1.deQueue();
        boolean boolean11 = circularQueue1.isEmpty();
        boolean boolean12 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (short) 10);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        circularQueue1.deleteQueue();
        boolean boolean5 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        boolean boolean7 = circularQueue1.isFull();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) -1);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        boolean boolean3 = circularQueue1.isEmpty();
        int int4 = circularQueue1.peek();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        boolean boolean8 = circularQueue1.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue(32);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
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
        circularQueue1.enQueue((int) (short) 1);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) 'a');
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        boolean boolean4 = circularQueue1.isEmpty();
        boolean boolean5 = circularQueue1.isFull();
        boolean boolean6 = circularQueue1.isFull();
        circularQueue1.deleteQueue();
        circularQueue1.deleteQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) (byte) 100);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        com.thealgorithms.datastructures.queues.CircularQueue circularQueue1 = new com.thealgorithms.datastructures.queues.CircularQueue((int) (short) 10);
        int int2 = circularQueue1.peek();
        int int3 = circularQueue1.deQueue();
        circularQueue1.deleteQueue();
        int int5 = circularQueue1.deQueue();
        int int6 = circularQueue1.peek();
        boolean boolean7 = circularQueue1.isEmpty();
        int int8 = circularQueue1.deQueue();
        int int9 = circularQueue1.deQueue();
        int int10 = circularQueue1.deQueue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        circularQueue1.enQueue((int) '#');
    }
}

