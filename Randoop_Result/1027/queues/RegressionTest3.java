package queues;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.enqueue((-1));
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.peekRear();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.peekRear();
        int int12 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 1);
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.peekRear();
        int int15 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        int int17 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.enqueue((int) (short) 100);
        int int12 = linkedQueue0.dequeue();
        int int13 = linkedQueue0.size();
        boolean boolean14 = linkedQueue0.isEmpty();
        java.lang.String str15 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        java.lang.String str11 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str13 = linkedQueue0.toString();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0, 100]" + "'", str11, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        java.lang.String str6 = linkedQueue0.toString();
        int int7 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.enqueue(0);
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
        java.lang.String str10 = linkedQueue0.toString();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean14 = linkedQueue0.enqueue((int) '#');
        int int15 = linkedQueue0.size();
        java.lang.String str16 = linkedQueue0.toString();
        java.lang.String str17 = linkedQueue0.toString();
        int int18 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass19 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 100, 32, 35]" + "'", str16, "[0, 100, 32, 35]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[0, 100, 32, 35]" + "'", str17, "[0, 100, 32, 35]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[32]" + "'", str5, "[32]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.dequeue();
        boolean boolean10 = linkedQueue0.enqueue(4);
        int int11 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.enqueue(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 10);
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) -1);
        boolean boolean14 = linkedQueue0.enqueue(32);
        boolean boolean16 = linkedQueue0.enqueue((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue((int) (short) 0);
        int int16 = linkedQueue0.peekRear();
        int int17 = linkedQueue0.size();
        boolean boolean19 = linkedQueue0.enqueue(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 1);
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        boolean boolean8 = linkedQueue0.enqueue((int) (byte) 0);
        int int9 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.isEmpty();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        linkedQueue0.clear();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.dequeue();
        java.lang.String str9 = linkedQueue0.toString();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0]" + "'", str9, "[0]");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.enqueue((int) (short) 100);
        int int12 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0, 0]" + "'", str10, "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (short) 100);
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue(5);
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) '#');
        java.lang.String str13 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[10, 100, 5, 35]" + "'", str13, "[10, 100, 5, 35]");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) -1);
        int int14 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.peekFront();
        int int14 = linkedQueue0.dequeue();
        java.lang.String str15 = linkedQueue0.toString();
        int int16 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[-1]" + "'", str15, "[-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekFront();
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.peekFront();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) (short) -1);
        int int13 = linkedQueue0.peekFront();
        int int14 = linkedQueue0.peekFront();
        boolean boolean16 = linkedQueue0.enqueue(6);
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 1);
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.peekRear();
        int int15 = linkedQueue0.peekFront();
        int int16 = linkedQueue0.peekRear();
        int int17 = linkedQueue0.peekFront();
        int int18 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass19 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str13 = linkedQueue0.toString();
        boolean boolean14 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100]" + "'", str10, "[100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean15 = linkedQueue0.isEmpty();
        int int16 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        java.lang.String str18 = linkedQueue0.toString();
        java.lang.String str19 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 10);
        int int12 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.enqueue(2);
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.enqueue((-1));
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 1);
        int int14 = linkedQueue0.size();
        boolean boolean15 = linkedQueue0.isEmpty();
        java.lang.String str16 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 100, -1, 1]" + "'", str16, "[0, 100, -1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 10);
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        boolean boolean6 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        int int11 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.enqueue((int) (short) -1);
        int int14 = linkedQueue0.dequeue();
        int int15 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        boolean boolean8 = linkedQueue0.enqueue(100);
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.dequeue();
        int int12 = linkedQueue0.peekRear();
        int int13 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[2, 100]" + "'", str9, "[2, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.dequeue();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) -1);
        int int12 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean12 = linkedQueue0.enqueue((int) '4');
        linkedQueue0.clear();
        boolean boolean15 = linkedQueue0.enqueue(4);
        boolean boolean17 = linkedQueue0.enqueue((int) (short) 0);
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue((int) (short) 0);
        int int16 = linkedQueue0.peekFront();
        int int17 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.dequeue();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        int int13 = linkedQueue0.peekRear();
        int int14 = linkedQueue0.peekRear();
        int int15 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.size();
        int int5 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        java.lang.String str12 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.enqueue(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[100]" + "'", str9, "[100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        int int5 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 1);
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 1);
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.peekRear();
        int int15 = linkedQueue0.peekFront();
        int int16 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.peekFront();
        java.lang.String str8 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str10 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        java.lang.String str11 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean15 = linkedQueue0.enqueue(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str12 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.size();
        java.lang.String str11 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0]" + "'", str8, "[0, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 0]" + "'", str9, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        boolean boolean11 = linkedQueue0.enqueue((int) (short) 1);
        int int12 = linkedQueue0.dequeue();
        int int13 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 1);
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.peekRear();
        boolean boolean13 = linkedQueue0.isEmpty();
        int int14 = linkedQueue0.peekFront();
        boolean boolean16 = linkedQueue0.enqueue(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean11 = linkedQueue0.enqueue(100);
        boolean boolean13 = linkedQueue0.enqueue(35);
        boolean boolean15 = linkedQueue0.enqueue((int) '4');
        boolean boolean17 = linkedQueue0.enqueue(10);
        java.lang.String str18 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[0, 100, 35, 52, 10]" + "'", str18, "[0, 100, 35, 52, 10]");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.size();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.enqueue(0);
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        java.lang.String str1 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str3 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean13 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.size();
        java.lang.String str11 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean13 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[100]" + "'", str11, "[100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        boolean boolean7 = linkedQueue0.enqueue((int) (byte) 10);
        int int8 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.peekRear();
        int int13 = linkedQueue0.peekRear();
        int int14 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        int int14 = linkedQueue0.peekFront();
        int int15 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
        java.lang.String str10 = linkedQueue0.toString();
        java.lang.String str11 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.enqueue((int) (short) 0);
        int int15 = linkedQueue0.peekRear();
        boolean boolean17 = linkedQueue0.enqueue((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue((int) (byte) 0);
        int int16 = linkedQueue0.peekRear();
        int int17 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean7 = linkedQueue0.isEmpty();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 100);
        linkedQueue0.clear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        int int10 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.enqueue((int) ' ');
        int int14 = linkedQueue0.dequeue();
        int int15 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) -1);
        int int8 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) 1);
        int int13 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.size();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean18 = linkedQueue0.enqueue((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 0]" + "'", str13, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        boolean boolean10 = linkedQueue0.enqueue(3);
        int int11 = linkedQueue0.peekRear();
        int int12 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.dequeue();
        int int13 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.peekFront();
        boolean boolean14 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 1);
        int int14 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.dequeue();
        int int12 = linkedQueue0.peekRear();
        int int13 = linkedQueue0.dequeue();
        boolean boolean14 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean14 = linkedQueue0.enqueue((int) '#');
        int int15 = linkedQueue0.size();
        int int16 = linkedQueue0.size();
        java.lang.String str17 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[0, 100, 32, 35]" + "'", str17, "[0, 100, 32, 35]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.enqueue(0);
        boolean boolean13 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 10);
        int int10 = linkedQueue0.peekFront();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean14 = linkedQueue0.enqueue(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekRear();
        int int12 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100]" + "'", str10, "[100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean14 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean6 = linkedQueue0.isEmpty();
        boolean boolean8 = linkedQueue0.enqueue((int) '4');
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean11 = linkedQueue0.enqueue(100);
        boolean boolean13 = linkedQueue0.enqueue(35);
        int int14 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.dequeue();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        linkedQueue0.clear();
        java.lang.String str14 = linkedQueue0.toString();
        int int15 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekRear();
        boolean boolean12 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 10);
        int int10 = linkedQueue0.dequeue();
        boolean boolean11 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) 'a');
        int int10 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        java.lang.String str12 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.enqueue(0);
        boolean boolean13 = linkedQueue0.enqueue(35);
        boolean boolean15 = linkedQueue0.enqueue(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.dequeue();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.dequeue();
        boolean boolean10 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean7 = linkedQueue0.isEmpty();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 100);
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0]" + "'", str8, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        java.lang.String str12 = linkedQueue0.toString();
        int int13 = linkedQueue0.peekFront();
        int int14 = linkedQueue0.size();
        int int15 = linkedQueue0.peekRear();
        int int16 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 0, 32]" + "'", str12, "[0, 0, 32]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.enqueue(0);
        java.lang.String str14 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 0]" + "'", str9, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0, 0, 0]" + "'", str14, "[0, 0, 0]");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue(3);
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.peekFront();
        int int15 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        int int15 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        java.lang.String str13 = linkedQueue0.toString();
        java.lang.String str14 = linkedQueue0.toString();
        boolean boolean15 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[2]" + "'", str13, "[2]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[2]" + "'", str14, "[2]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        int int11 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.enqueue(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.enqueue((int) (short) 100);
        boolean boolean13 = linkedQueue0.enqueue((int) (short) 100);
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean15 = linkedQueue0.isEmpty();
        int int16 = linkedQueue0.peekFront();
        boolean boolean18 = linkedQueue0.enqueue((int) (byte) 0);
        java.lang.String str19 = linkedQueue0.toString();
        int int20 = linkedQueue0.size();
        int int21 = linkedQueue0.size();
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[0, 0, 32, 0, 0]" + "'", str19, "[0, 0, 32, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        int int12 = linkedQueue0.dequeue();
        java.lang.String str13 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 32]" + "'", str13, "[0, 32]");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean12 = linkedQueue0.enqueue((int) '4');
        int int13 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.isEmpty();
        int int9 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.peekRear();
        boolean boolean14 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.peekRear();
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) -1);
        int int10 = linkedQueue0.peekFront();
        boolean boolean12 = linkedQueue0.enqueue((int) '4');
        boolean boolean14 = linkedQueue0.enqueue((int) (byte) 0);
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        java.lang.String str3 = linkedQueue0.toString();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean6 = linkedQueue0.isEmpty();
        boolean boolean8 = linkedQueue0.enqueue((int) '4');
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.enqueue((int) (byte) 10);
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        linkedQueue0.clear();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekFront();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.enqueue((-1));
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue((int) ' ');
        int int11 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean8 = linkedQueue0.enqueue(4);
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekFront();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 1);
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.dequeue();
        int int14 = linkedQueue0.size();
        int int15 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) -1);
        java.lang.String str13 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[-1]" + "'", str13, "[-1]");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.size();
        java.lang.String str10 = linkedQueue0.toString();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean14 = linkedQueue0.enqueue((int) (byte) -1);
        boolean boolean16 = linkedQueue0.enqueue((int) '4');
        int int17 = linkedQueue0.dequeue();
        int int18 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.enqueue(32);
        int int11 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean8 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        java.lang.String str1 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean4 = linkedQueue0.enqueue(2);
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.size();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekRear();
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.size();
        java.lang.String str14 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean17 = linkedQueue0.enqueue((int) '4');
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 0]" + "'", str9, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0, 0]" + "'", str14, "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        int int10 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue(2);
        int int8 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) ' ');
        int int10 = linkedQueue0.peekRear();
        int int11 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.enqueue((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean8 = linkedQueue0.enqueue(4);
        java.lang.String str9 = linkedQueue0.toString();
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int12 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[4]" + "'", str9, "[4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.peekFront();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.enqueue(10);
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean7 = linkedQueue0.isEmpty();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 100);
        boolean boolean10 = linkedQueue0.isEmpty();
        java.lang.String str11 = linkedQueue0.toString();
        java.lang.String str12 = linkedQueue0.toString();
        int int13 = linkedQueue0.peekRear();
        java.lang.String str14 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[100]" + "'", str11, "[100]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[100]" + "'", str12, "[100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[100]" + "'", str14, "[100]");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        int int11 = linkedQueue0.dequeue();
        java.lang.String str12 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 0]" + "'", str12, "[0, 0]");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue(2);
        java.lang.String str8 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[2]" + "'", str8, "[2]");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.peekRear();
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.peekFront();
        int int14 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekRear();
        boolean boolean13 = linkedQueue0.enqueue((int) 'a');
        boolean boolean15 = linkedQueue0.enqueue((int) '#');
        int int16 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekFront();
        java.lang.String str11 = linkedQueue0.toString();
        int int12 = linkedQueue0.peekFront();
        boolean boolean14 = linkedQueue0.enqueue((int) (byte) -1);
        int int15 = linkedQueue0.peekRear();
        int int16 = linkedQueue0.peekFront();
        int int17 = linkedQueue0.dequeue();
        java.lang.String str18 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[100]" + "'", str11, "[100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[-1]" + "'", str18, "[-1]");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        int int10 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.dequeue();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) 0);
        int int13 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue((int) (byte) 100);
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.size();
        int int6 = linkedQueue0.peekFront();
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 0);
        int int14 = linkedQueue0.peekFront();
        boolean boolean16 = linkedQueue0.enqueue(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.enqueue((int) (short) 100);
        boolean boolean13 = linkedQueue0.enqueue((int) (short) 100);
        int int14 = linkedQueue0.peekRear();
        boolean boolean15 = linkedQueue0.isEmpty();
        int int16 = linkedQueue0.peekFront();
        boolean boolean17 = linkedQueue0.isEmpty();
        boolean boolean18 = linkedQueue0.isEmpty();
        int int19 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 1);
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.size();
        java.lang.String str14 = linkedQueue0.toString();
        boolean boolean15 = linkedQueue0.isEmpty();
        int int16 = linkedQueue0.dequeue();
        boolean boolean17 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0, 0, 1]" + "'", str14, "[0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) '#');
        boolean boolean13 = linkedQueue0.enqueue(2);
        java.lang.String str14 = linkedQueue0.toString();
        boolean boolean15 = linkedQueue0.isEmpty();
        boolean boolean17 = linkedQueue0.enqueue(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[35, 2]" + "'", str14, "[35, 2]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.enqueue(0);
        int int11 = linkedQueue0.peekFront();
        java.lang.String str12 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0]" + "'", str12, "[0]");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue(4);
        int int16 = linkedQueue0.peekRear();
        int int17 = linkedQueue0.peekFront();
        int int18 = linkedQueue0.peekRear();
        boolean boolean19 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.enqueue((int) (short) 100);
        boolean boolean13 = linkedQueue0.enqueue((int) (short) 100);
        int int14 = linkedQueue0.peekRear();
        boolean boolean15 = linkedQueue0.isEmpty();
        int int16 = linkedQueue0.peekFront();
        boolean boolean17 = linkedQueue0.isEmpty();
        boolean boolean18 = linkedQueue0.isEmpty();
        int int19 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.peekRear();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean12 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekRear();
        int int12 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 1);
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        java.lang.String str16 = linkedQueue0.toString();
        boolean boolean17 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        java.lang.String str10 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.peekRear();
        int int10 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue(4);
        int int16 = linkedQueue0.peekRear();
        int int17 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean11 = linkedQueue0.enqueue(100);
        boolean boolean13 = linkedQueue0.enqueue(35);
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        int int9 = linkedQueue0.peekRear();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.peekRear();
        int int12 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.enqueue((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0]" + "'", str9, "[0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean14 = linkedQueue0.enqueue((int) '#');
        int int15 = linkedQueue0.size();
        java.lang.String str16 = linkedQueue0.toString();
        boolean boolean18 = linkedQueue0.enqueue((int) (byte) 0);
        int int19 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 100, 32, 35]" + "'", str16, "[0, 100, 32, 35]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean11 = linkedQueue0.enqueue(100);
        boolean boolean13 = linkedQueue0.enqueue(35);
        boolean boolean15 = linkedQueue0.enqueue((int) '4');
        boolean boolean17 = linkedQueue0.enqueue(10);
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekFront();
        boolean boolean10 = linkedQueue0.enqueue((int) (byte) 0);
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean11 = linkedQueue0.enqueue(100);
        int int12 = linkedQueue0.peekRear();
        int int13 = linkedQueue0.peekFront();
        int int14 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.size();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean18 = linkedQueue0.enqueue(0);
        int int19 = linkedQueue0.dequeue();
        int int20 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 0]" + "'", str13, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.peekRear();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.dequeue();
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue((int) (short) -1);
        java.lang.String str16 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[-1]" + "'", str16, "[-1]");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        int int9 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        int int14 = linkedQueue0.dequeue();
        int int15 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        int int17 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.dequeue();
        java.lang.String str13 = linkedQueue0.toString();
        boolean boolean15 = linkedQueue0.enqueue((int) '#');
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.enqueue((-1));
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 1);
        int int14 = linkedQueue0.size();
        boolean boolean15 = linkedQueue0.isEmpty();
        int int16 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        java.lang.String str9 = linkedQueue0.toString();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.size();
        java.lang.String str12 = linkedQueue0.toString();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[2]" + "'", str9, "[2]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[2]" + "'", str10, "[2]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[2]" + "'", str12, "[2]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[2]" + "'", str13, "[2]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (short) 100);
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.enqueue(1);
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        int int13 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        boolean boolean15 = linkedQueue0.isEmpty();
        boolean boolean16 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekFront();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) 1);
        boolean boolean14 = linkedQueue0.enqueue((int) (byte) 0);
        int int15 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        boolean boolean8 = linkedQueue0.enqueue(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        int int10 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean12 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.peekRear();
        int int14 = linkedQueue0.dequeue();
        boolean boolean16 = linkedQueue0.enqueue((int) (short) 1);
        int int17 = linkedQueue0.peekFront();
        boolean boolean18 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.enqueue((int) (short) 100);
        int int12 = linkedQueue0.dequeue();
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.dequeue();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        int int13 = linkedQueue0.peekRear();
        int int14 = linkedQueue0.peekRear();
        boolean boolean15 = linkedQueue0.isEmpty();
        boolean boolean16 = linkedQueue0.isEmpty();
        int int17 = linkedQueue0.size();
        int int18 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (short) 100);
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean8 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[10, 100]" + "'", str7, "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean12 = linkedQueue0.enqueue((int) '4');
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) -1);
        boolean boolean8 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue(3);
        java.lang.String str16 = linkedQueue0.toString();
        boolean boolean18 = linkedQueue0.enqueue((int) (byte) 10);
        boolean boolean19 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass21 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 100, 32, 3]" + "'", str16, "[0, 100, 32, 3]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.enqueue(0);
        int int12 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekRear();
        boolean boolean12 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str14 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 0]" + "'", str9, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.enqueue((int) (byte) -1);
        int int9 = linkedQueue0.peekRear();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.dequeue();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.dequeue();
        java.lang.String str11 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.isEmpty();
        java.lang.String str10 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.enqueue(52);
        int int14 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.size();
        java.lang.String str10 = linkedQueue0.toString();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekRear();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        int int14 = linkedQueue0.dequeue();
        int int15 = linkedQueue0.dequeue();
        int int16 = linkedQueue0.dequeue();
        int int17 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) -1);
        int int8 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.enqueue((int) '4');
        int int14 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean12 = linkedQueue0.enqueue((int) '4');
        linkedQueue0.clear();
        boolean boolean15 = linkedQueue0.enqueue(4);
        boolean boolean17 = linkedQueue0.enqueue((int) (short) 0);
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.enqueue(0);
        int int12 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        java.lang.String str12 = linkedQueue0.toString();
        boolean boolean13 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 0, 32]" + "'", str12, "[0, 0, 32]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        java.lang.String str8 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.enqueue((int) 'a');
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.size();
        java.lang.String str11 = linkedQueue0.toString();
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.peekFront();
        java.lang.String str14 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[100]" + "'", str11, "[100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[100]" + "'", str14, "[100]");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        boolean boolean12 = linkedQueue0.isEmpty();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.size();
        int int15 = linkedQueue0.peekFront();
        int int16 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 0, 32]" + "'", str13, "[0, 0, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        boolean boolean7 = linkedQueue0.enqueue((int) (byte) 10);
        boolean boolean9 = linkedQueue0.enqueue(2);
        linkedQueue0.clear();
        java.lang.String str11 = linkedQueue0.toString();
        boolean boolean12 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        java.lang.String str12 = linkedQueue0.toString();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean16 = linkedQueue0.enqueue((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 100, 0]" + "'", str12, "[0, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekRear();
        boolean boolean12 = linkedQueue0.enqueue(32);
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.size();
        int int6 = linkedQueue0.size();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        java.lang.String str12 = linkedQueue0.toString();
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.isEmpty();
        boolean boolean16 = linkedQueue0.enqueue((int) '4');
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 100, 0]" + "'", str12, "[0, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.peekFront();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) 1);
        boolean boolean13 = linkedQueue0.isEmpty();
        int int14 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue((int) (byte) 10);
        int int11 = linkedQueue0.dequeue();
        boolean boolean12 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.dequeue();
        java.lang.String str11 = linkedQueue0.toString();
        boolean boolean13 = linkedQueue0.enqueue((int) (short) 10);
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 1);
        int int11 = linkedQueue0.dequeue();
        int int12 = linkedQueue0.peekFront();
        java.lang.String str13 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[1]" + "'", str13, "[1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0]" + "'", str8, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.dequeue();
        boolean boolean16 = linkedQueue0.enqueue(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 0]" + "'", str13, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.dequeue();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        int int13 = linkedQueue0.peekRear();
        int int14 = linkedQueue0.peekRear();
        int int15 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean18 = linkedQueue0.enqueue(1);
        int int19 = linkedQueue0.dequeue();
        int int20 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.isEmpty();
        int int14 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.enqueue(10);
        int int11 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.enqueue((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.dequeue();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0]" + "'", str9, "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (short) 100);
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[10, 100]" + "'", str8, "[10, 100]");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) '#');
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        int int11 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.enqueue((int) (short) -1);
        int int14 = linkedQueue0.dequeue();
        int int15 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue(0);
        int int11 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.enqueue((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue(100);
        boolean boolean13 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean16 = linkedQueue0.isEmpty();
        int int17 = linkedQueue0.peekFront();
        int int18 = linkedQueue0.peekFront();
        boolean boolean20 = linkedQueue0.enqueue(1);
        java.lang.Class<?> wildcardClass21 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (short) 100);
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue(0);
        int int10 = linkedQueue0.peekRear();
        int int11 = linkedQueue0.size();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) -1);
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 0]" + "'", str9, "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        int int13 = linkedQueue0.peekRear();
        boolean boolean15 = linkedQueue0.enqueue(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekRear();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) 10);
        boolean boolean14 = linkedQueue0.enqueue(6);
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.size();
        boolean boolean7 = linkedQueue0.enqueue((int) (byte) 10);
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.size();
        boolean boolean11 = linkedQueue0.enqueue(4);
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.enqueue((int) (short) 1);
        int int15 = linkedQueue0.dequeue();
        int int16 = linkedQueue0.dequeue();
        boolean boolean17 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str10 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean14 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 1);
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.enqueue((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.enqueue((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.enqueue((int) '4');
        int int14 = linkedQueue0.size();
        boolean boolean15 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.enqueue((int) (byte) -1);
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        java.lang.String str12 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.peekFront();
        boolean boolean8 = linkedQueue0.isEmpty();
        int int9 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        int int2 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.enqueue(1);
        boolean boolean9 = linkedQueue0.enqueue(6);
        java.lang.String str10 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[1, 6]" + "'", str10, "[1, 6]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.peekRear();
        java.lang.String str11 = linkedQueue0.toString();
        int int12 = linkedQueue0.peekRear();
        boolean boolean13 = linkedQueue0.isEmpty();
        int int14 = linkedQueue0.dequeue();
        int int15 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0, 100]" + "'", str11, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0, 0]" + "'", str10, "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean7 = linkedQueue0.isEmpty();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 100);
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        int int10 = linkedQueue0.size();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekFront();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) 1);
        int int13 = linkedQueue0.dequeue();
        int int14 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        java.lang.String str6 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[10]" + "'", str6, "[10]");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) -1);
        boolean boolean10 = linkedQueue0.enqueue(2);
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekFront();
        boolean boolean10 = linkedQueue0.enqueue((int) (byte) 0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) -1);
        int int14 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue(2);
        int int8 = linkedQueue0.dequeue();
        boolean boolean10 = linkedQueue0.enqueue((int) '4');
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.dequeue();
        int int14 = linkedQueue0.peekFront();
        int int15 = linkedQueue0.peekRear();
        boolean boolean17 = linkedQueue0.enqueue((int) '#');
        boolean boolean18 = linkedQueue0.isEmpty();
        boolean boolean20 = linkedQueue0.enqueue((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str10 = linkedQueue0.toString();
        java.lang.String str11 = linkedQueue0.toString();
        java.lang.String str12 = linkedQueue0.toString();
        boolean boolean13 = linkedQueue0.isEmpty();
        int int14 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        java.lang.String str14 = linkedQueue0.toString();
        int int15 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean18 = linkedQueue0.enqueue((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0]" + "'", str14, "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        int int11 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.enqueue((int) (short) -1);
        int int14 = linkedQueue0.size();
        int int15 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        int int10 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100]" + "'", str7, "[100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.enqueue(0);
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.peekRear();
        int int15 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) (short) -1);
        int int13 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean16 = linkedQueue0.enqueue((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue(2);
        int int8 = linkedQueue0.peekFront();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[2]" + "'", str9, "[2]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.dequeue();
        java.lang.String str11 = linkedQueue0.toString();
        boolean boolean12 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean9 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        java.lang.String str14 = linkedQueue0.toString();
        boolean boolean16 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean17 = linkedQueue0.isEmpty();
        boolean boolean18 = linkedQueue0.isEmpty();
        int int19 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0]" + "'", str14, "[0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str12 = linkedQueue0.toString();
        boolean boolean14 = linkedQueue0.enqueue(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0]" + "'", str8, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.enqueue(0);
        java.lang.String str12 = linkedQueue0.toString();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean17 = linkedQueue0.enqueue((int) '#');
        int int18 = linkedQueue0.peekRear();
        boolean boolean20 = linkedQueue0.enqueue(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 0, 0]" + "'", str12, "[0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 0, 0]" + "'", str13, "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.size();
        boolean boolean7 = linkedQueue0.enqueue((int) (byte) 10);
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.size();
        boolean boolean11 = linkedQueue0.enqueue(4);
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.enqueue((int) (short) 1);
        java.lang.String str15 = linkedQueue0.toString();
        int int16 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[10, 10, 4, 1]" + "'", str15, "[10, 10, 4, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.isEmpty();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.size();
        java.lang.String str12 = linkedQueue0.toString();
        boolean boolean14 = linkedQueue0.enqueue(2);
        boolean boolean16 = linkedQueue0.enqueue((int) (byte) 10);
        boolean boolean17 = linkedQueue0.isEmpty();
        int int18 = linkedQueue0.peekRear();
        boolean boolean20 = linkedQueue0.enqueue(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        boolean boolean14 = linkedQueue0.enqueue((int) (short) -1);
        java.lang.String str15 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[2, -1]" + "'", str15, "[2, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.enqueue((int) (short) 100);
        int int12 = linkedQueue0.dequeue();
        int int13 = linkedQueue0.size();
        boolean boolean14 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.String str13 = linkedQueue0.toString();
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.dequeue();
        boolean boolean10 = linkedQueue0.enqueue(52);
        boolean boolean12 = linkedQueue0.enqueue(3);
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        int int9 = linkedQueue0.size();
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int12 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        java.lang.String str10 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekRear();
        boolean boolean13 = linkedQueue0.enqueue((int) 'a');
        boolean boolean14 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.enqueue(0);
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.enqueue(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.enqueue(0);
        int int11 = linkedQueue0.peekFront();
        boolean boolean12 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int14 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.isEmpty();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.enqueue(2);
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.isEmpty();
        java.lang.String str14 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.enqueue(0);
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        boolean boolean13 = linkedQueue0.enqueue((int) ' ');
        int int14 = linkedQueue0.size();
        java.lang.String str15 = linkedQueue0.toString();
        int int16 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str18 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[32]" + "'", str15, "[32]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) ' ');
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.size();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[32, 100]" + "'", str13, "[32, 100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.size();
        boolean boolean7 = linkedQueue0.enqueue((int) (byte) 10);
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.size();
        boolean boolean11 = linkedQueue0.enqueue(4);
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.enqueue((int) (short) 1);
        int int15 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        java.lang.String str3 = linkedQueue0.toString();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.enqueue(0);
        boolean boolean14 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 0]" + "'", str9, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.peekRear();
        int int12 = linkedQueue0.peekRear();
        java.lang.String str13 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 100]" + "'", str13, "[0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        java.lang.String str12 = linkedQueue0.toString();
        int int13 = linkedQueue0.dequeue();
        int int14 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 100, 0]" + "'", str12, "[0, 100, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int10 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.peekRear();
        java.lang.String str11 = linkedQueue0.toString();
        int int12 = linkedQueue0.peekRear();
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue(3);
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0, 100]" + "'", str11, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        java.lang.String str10 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.size();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.dequeue();
        java.lang.String str12 = linkedQueue0.toString();
        boolean boolean13 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100]" + "'", str10, "[100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        int int12 = linkedQueue0.dequeue();
        boolean boolean13 = linkedQueue0.isEmpty();
        int int14 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        java.lang.String str12 = linkedQueue0.toString();
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.peekFront();
        int int16 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 100, 0]" + "'", str12, "[0, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        boolean boolean4 = linkedQueue0.enqueue(10);
        int int5 = linkedQueue0.peekFront();
        int int6 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        java.lang.String str3 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean5 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.peekRear();
        int int14 = linkedQueue0.dequeue();
        boolean boolean16 = linkedQueue0.enqueue((int) (short) 1);
        int int17 = linkedQueue0.peekFront();
        int int18 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.dequeue();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue(0);
        int int11 = linkedQueue0.peekRear();
        int int12 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        java.lang.String str14 = linkedQueue0.toString();
        int int15 = linkedQueue0.peekRear();
        int int16 = linkedQueue0.peekRear();
        java.lang.String str17 = linkedQueue0.toString();
        int int18 = linkedQueue0.peekRear();
        boolean boolean20 = linkedQueue0.enqueue((int) (byte) -1);
        boolean boolean22 = linkedQueue0.enqueue((int) ' ');
        int int23 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0]" + "'", str14, "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[0]" + "'", str17, "[0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0]" + "'", str8, "[0, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 0]" + "'", str9, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.dequeue();
        boolean boolean14 = linkedQueue0.isEmpty();
        java.lang.String str15 = linkedQueue0.toString();
        int int16 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[100, 0]" + "'", str15, "[100, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        int int2 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean4 = linkedQueue0.isEmpty();
        java.lang.String str5 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekRear();
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.dequeue();
        int int15 = linkedQueue0.dequeue();
        int int16 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.String str11 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekRear();
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.peekFront();
        int int14 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean13 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str10 = linkedQueue0.toString();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) 10);
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.enqueue(0);
        int int14 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.size();
        boolean boolean7 = linkedQueue0.enqueue(3);
        java.lang.String str8 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[3]" + "'", str8, "[3]");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        int int9 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.String str11 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean14 = linkedQueue0.enqueue((int) (byte) 100);
        int int15 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean18 = linkedQueue0.enqueue((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekRear();
        java.lang.String str12 = linkedQueue0.toString();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100]" + "'", str10, "[100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[100]" + "'", str12, "[100]");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.enqueue(10);
        boolean boolean10 = linkedQueue0.isEmpty();
        java.lang.String str11 = linkedQueue0.toString();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[32, 100, 10]" + "'", str11, "[32, 100, 10]");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.dequeue();
        int int14 = linkedQueue0.dequeue();
        java.lang.String str15 = linkedQueue0.toString();
        int int16 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean19 = linkedQueue0.enqueue((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0]" + "'", str15, "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.size();
        linkedQueue0.clear();
        int int11 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0]" + "'", str8, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) -1);
        int int14 = linkedQueue0.peekRear();
        boolean boolean15 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean12 = linkedQueue0.isEmpty();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.peekFront();
        boolean boolean16 = linkedQueue0.enqueue(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[100]" + "'", str13, "[100]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.enqueue(0);
        int int11 = linkedQueue0.peekFront();
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.size();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean12 = linkedQueue0.enqueue((int) '4');
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean15 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.peekFront();
        boolean boolean15 = linkedQueue0.enqueue((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.enqueue((int) (short) 100);
        int int12 = linkedQueue0.size();
        boolean boolean14 = linkedQueue0.enqueue(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 1);
        int int14 = linkedQueue0.size();
        boolean boolean15 = linkedQueue0.isEmpty();
        int int16 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (short) 100);
        int int7 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.enqueue(1);
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.dequeue();
        boolean boolean13 = linkedQueue0.enqueue(52);
        int int14 = linkedQueue0.peekFront();
        boolean boolean15 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        linkedQueue0.clear();
        int int11 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.enqueue((int) '4');
        int int14 = linkedQueue0.dequeue();
        java.lang.String str15 = linkedQueue0.toString();
        boolean boolean17 = linkedQueue0.enqueue((int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[100, 0, 52]" + "'", str15, "[100, 0, 52]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekRear();
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.isEmpty();
        int int14 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.peekFront();
        boolean boolean14 = linkedQueue0.enqueue((int) '#');
        int int15 = linkedQueue0.dequeue();
        int int16 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.peekFront();
        java.lang.String str13 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0]" + "'", str13, "[0]");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.enqueue((-1));
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 1);
        int int14 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekRear();
        java.lang.String str11 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[100]" + "'", str11, "[100]");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.String str13 = linkedQueue0.toString();
        boolean boolean15 = linkedQueue0.enqueue((int) (short) -1);
        int int16 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.dequeue();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean12 = linkedQueue0.isEmpty();
        java.lang.String str13 = linkedQueue0.toString();
        boolean boolean14 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[100]" + "'", str13, "[100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.enqueue(2);
        int int11 = linkedQueue0.peekRear();
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean2 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int4 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass5 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.size();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        int int10 = linkedQueue0.size();
        java.lang.String str11 = linkedQueue0.toString();
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0]" + "'", str11, "[0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekRear();
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.peekFront();
        int int14 = linkedQueue0.size();
        int int15 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.peekFront();
        java.lang.String str10 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 100]" + "'", str10, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) -1);
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean14 = linkedQueue0.enqueue((int) (byte) 100);
        int int15 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean17 = linkedQueue0.isEmpty();
        boolean boolean18 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) 1);
        int int13 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.size();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.dequeue();
        boolean boolean14 = linkedQueue0.enqueue(0);
        int int15 = linkedQueue0.peekFront();
        int int16 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0]" + "'", str8, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 10);
        int int14 = linkedQueue0.size();
        int int15 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) ' ');
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean12 = linkedQueue0.enqueue((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        int int11 = linkedQueue0.size();
        java.lang.String str12 = linkedQueue0.toString();
        int int13 = linkedQueue0.dequeue();
        int int14 = linkedQueue0.dequeue();
        boolean boolean15 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 100, 0]" + "'", str12, "[0, 100, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        int int11 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekFront();
        java.lang.String str10 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 10);
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) -1);
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.size();
        int int15 = linkedQueue0.peekRear();
        boolean boolean16 = linkedQueue0.isEmpty();
        int int17 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.enqueue(2);
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 1);
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 1);
        int int12 = linkedQueue0.dequeue();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.dequeue();
        boolean boolean16 = linkedQueue0.enqueue((int) (short) 10);
        int int17 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 1]" + "'", str13, "[0, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekRear();
        int int12 = linkedQueue0.size();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.size();
        java.lang.String str10 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.size();
        java.lang.String str10 = linkedQueue0.toString();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean13 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean12 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.size();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[-1]" + "'", str13, "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.enqueue(0);
        java.lang.String str12 = linkedQueue0.toString();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean17 = linkedQueue0.enqueue((int) '#');
        int int18 = linkedQueue0.peekRear();
        int int19 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 0, 0]" + "'", str12, "[0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 0, 0]" + "'", str13, "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.enqueue(10);
        boolean boolean10 = linkedQueue0.isEmpty();
        java.lang.String str11 = linkedQueue0.toString();
        boolean boolean12 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[32, 100, 10]" + "'", str11, "[32, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.dequeue();
        int int14 = linkedQueue0.peekFront();
        boolean boolean16 = linkedQueue0.enqueue((int) (byte) 1);
        int int17 = linkedQueue0.peekFront();
        int int18 = linkedQueue0.peekFront();
        int int19 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        boolean boolean22 = linkedQueue0.enqueue(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean15 = linkedQueue0.isEmpty();
        int int16 = linkedQueue0.peekFront();
        java.lang.String str17 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[0, 0, 32, 0]" + "'", str17, "[0, 0, 32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.dequeue();
        java.lang.String str16 = linkedQueue0.toString();
        int int17 = linkedQueue0.peekRear();
        boolean boolean18 = linkedQueue0.isEmpty();
        int int19 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 0, 100]" + "'", str16, "[0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        java.lang.String str14 = linkedQueue0.toString();
        int int15 = linkedQueue0.peekFront();
        int int16 = linkedQueue0.peekFront();
        java.lang.String str17 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0]" + "'", str14, "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[0]" + "'", str17, "[0]");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.size();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean18 = linkedQueue0.enqueue(0);
        java.lang.Class<?> wildcardClass19 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 0]" + "'", str13, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.dequeue();
        boolean boolean17 = linkedQueue0.enqueue((int) (byte) 0);
        int int18 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.enqueue((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.enqueue((int) (short) 100);
        java.lang.String str12 = linkedQueue0.toString();
        int int13 = linkedQueue0.peekFront();
        int int14 = linkedQueue0.size();
        java.lang.String str15 = linkedQueue0.toString();
        int int16 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[100]" + "'", str12, "[100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[100]" + "'", str15, "[100]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str13 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100]" + "'", str10, "[100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue((int) ' ');
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.dequeue();
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.peekRear();
        int int16 = linkedQueue0.size();
        int int17 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        java.lang.String str12 = linkedQueue0.toString();
        java.lang.String str13 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 0, 32]" + "'", str12, "[0, 0, 32]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 0, 32]" + "'", str13, "[0, 0, 32]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 0);
        java.lang.String str12 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 0]" + "'", str12, "[0, 0]");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.peekFront();
        java.lang.String str11 = linkedQueue0.toString();
        int int12 = linkedQueue0.size();
        boolean boolean14 = linkedQueue0.enqueue((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[-1]" + "'", str11, "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str15 = linkedQueue0.toString();
        int int16 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.peekFront();
        int int14 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) 100);
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        boolean boolean12 = linkedQueue0.enqueue((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 100]" + "'", str10, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) 1);
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.dequeue();
        java.lang.String str11 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.enqueue(0);
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.peekFront();
        boolean boolean15 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0]" + "'", str13, "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue(35);
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        int int15 = linkedQueue0.size();
        int int16 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.size();
        java.lang.String str10 = linkedQueue0.toString();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue(2);
        int int10 = linkedQueue0.peekRear();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.dequeue();
        java.lang.String str16 = linkedQueue0.toString();
        int int17 = linkedQueue0.peekRear();
        boolean boolean18 = linkedQueue0.isEmpty();
        int int19 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass20 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 0, 100]" + "'", str16, "[0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.dequeue();
        java.lang.String str14 = linkedQueue0.toString();
        boolean boolean16 = linkedQueue0.enqueue((int) 'a');
        boolean boolean17 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0, 0, 100]" + "'", str14, "[0, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        java.lang.String str3 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 10);
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        int int13 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.enqueue((-1));
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.dequeue();
        boolean boolean14 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) ' ');
        boolean boolean14 = linkedQueue0.enqueue((int) '#');
        int int15 = linkedQueue0.size();
        int int16 = linkedQueue0.size();
        boolean boolean17 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        java.lang.String str13 = linkedQueue0.toString();
        boolean boolean15 = linkedQueue0.enqueue(1);
        java.lang.String str16 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[2]" + "'", str13, "[2]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[2, 1]" + "'", str16, "[2, 1]");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        java.lang.String str14 = linkedQueue0.toString();
        boolean boolean16 = linkedQueue0.enqueue((int) (short) 0);
        java.lang.String str17 = linkedQueue0.toString();
        int int18 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0]" + "'", str14, "[0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[0, 0]" + "'", str17, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean15 = linkedQueue0.isEmpty();
        int int16 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        int int2 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.isEmpty();
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str10 = linkedQueue0.toString();
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int13 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 2]" + "'", str8, "[0, 2]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 10);
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) -1);
        int int13 = linkedQueue0.size();
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekRear();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.enqueue(0);
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.peekRear();
        int int14 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue(0);
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) -1);
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 10);
        linkedQueue0.clear();
        int int13 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean13 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        boolean boolean12 = linkedQueue0.isEmpty();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.size();
        int int15 = linkedQueue0.peekFront();
        int int16 = linkedQueue0.peekRear();
        int int17 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 0, 32]" + "'", str13, "[0, 0, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.dequeue();
        int int8 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 10);
        java.lang.String str11 = linkedQueue0.toString();
        java.lang.String str12 = linkedQueue0.toString();
        int int13 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0, 0, 10]" + "'", str11, "[0, 0, 10]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 0, 10]" + "'", str12, "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 1);
        int int12 = linkedQueue0.dequeue();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.dequeue();
        boolean boolean16 = linkedQueue0.enqueue((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 1]" + "'", str13, "[0, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        int int10 = linkedQueue0.peekRear();
        int int11 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        java.lang.String str14 = linkedQueue0.toString();
        int int15 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int18 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0]" + "'", str14, "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }
}

