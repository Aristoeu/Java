package datastructures.queues;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        int int13 = linkedQueue0.peekRear();
        int int14 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        boolean boolean17 = linkedQueue0.enqueue((int) '4');
        int int18 = linkedQueue0.size();
        boolean boolean19 = linkedQueue0.isEmpty();
        int int20 = linkedQueue0.peekRear();
        int int21 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.size();
        int int6 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 100);
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean9 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.lang.String str14 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[32, 100]" + "'", str13, "[32, 100]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[32, 100]" + "'", str14, "[32, 100]");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        int int13 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        boolean boolean4 = linkedQueue0.isEmpty();
        int int5 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        boolean boolean11 = linkedQueue0.enqueue((int) (short) 1);
        int int12 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekFront();
        int int6 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        int int8 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.dequeue();
        boolean boolean9 = linkedQueue0.enqueue((int) ' ');
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.size();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        boolean boolean6 = linkedQueue0.isEmpty();
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100]" + "'", str7, "[100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[100]" + "'", str8, "[100]");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        java.lang.String str6 = linkedQueue0.toString();
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, 100]" + "'", str6, "[0, 100]");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        java.lang.String str14 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0, 0, 0, 100]" + "'", str14, "[0, 0, 0, 100]");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean11 = linkedQueue0.enqueue((int) (short) 100);
        int int12 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        boolean boolean10 = linkedQueue0.enqueue(5);
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        linkedQueue0.clear();
        boolean boolean16 = linkedQueue0.isEmpty();
        int int17 = linkedQueue0.size();
        boolean boolean19 = linkedQueue0.enqueue(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        boolean boolean9 = linkedQueue0.isEmpty();
        java.lang.String str10 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekFront();
        java.lang.String str11 = linkedQueue0.toString();
        java.lang.String str12 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[100]" + "'", str11, "[100]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[100]" + "'", str12, "[100]");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.dequeue();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        boolean boolean14 = linkedQueue0.enqueue((int) (short) 10);
        boolean boolean16 = linkedQueue0.enqueue((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        int int13 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        boolean boolean8 = linkedQueue0.isEmpty();
        int int9 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.size();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        int int19 = linkedQueue0.size();
        int int20 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        boolean boolean12 = linkedQueue0.enqueue(5);
        int int13 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100]" + "'", str10, "[100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        boolean boolean13 = linkedQueue0.enqueue((int) (short) 1);
        int int14 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) 1);
        int int8 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean6 = linkedQueue0.isEmpty();
        boolean boolean8 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
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
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        java.lang.String str8 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
            int int10 = linkedQueue0.dequeue();
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
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        int int13 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int6 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        java.lang.String str16 = linkedQueue0.toString();
        int int17 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[32]" + "'", str16, "[32]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue((int) 'a');
        linkedQueue0.clear();
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        int int14 = linkedQueue0.dequeue();
        int int15 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int10 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        boolean boolean14 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean15 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        int int13 = linkedQueue0.dequeue();
        boolean boolean15 = linkedQueue0.enqueue((int) (short) 10);
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        int int12 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        int int13 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0]" + "'", str8, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        int int15 = linkedQueue0.peekFront();
        int int16 = linkedQueue0.size();
        int int17 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        boolean boolean10 = linkedQueue0.enqueue(5);
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        int int14 = linkedQueue0.peekRear();
        java.lang.String str15 = linkedQueue0.toString();
        int int16 = linkedQueue0.peekFront();
        int int17 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0, 0, 0, -1]" + "'", str15, "[0, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        java.lang.String str13 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[100]" + "'", str13, "[100]");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.peekFront();
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
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.isEmpty();
        boolean boolean14 = linkedQueue0.enqueue((-1));
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        boolean boolean17 = linkedQueue0.enqueue((int) '4');
        int int18 = linkedQueue0.size();
        boolean boolean19 = linkedQueue0.isEmpty();
        int int20 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass21 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        boolean boolean9 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        boolean boolean15 = linkedQueue0.enqueue((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        boolean boolean12 = linkedQueue0.enqueue(5);
        boolean boolean14 = linkedQueue0.enqueue((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100]" + "'", str10, "[100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        int int15 = linkedQueue0.peekRear();
        int int16 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekFront();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean10 = linkedQueue0.enqueue((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        boolean boolean17 = linkedQueue0.enqueue((int) (short) -1);
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[10]" + "'", str10, "[10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        int int12 = linkedQueue0.peekFront();
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
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean7 = linkedQueue0.isEmpty();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        int int13 = linkedQueue0.dequeue();
        int int14 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
            int int9 = linkedQueue0.peekFront();
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
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        boolean boolean12 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.enqueue(0);
        int int11 = linkedQueue0.peekRear();
        int int12 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekRear();
        int int11 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.enqueue((int) ' ');
        java.lang.String str14 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 2]" + "'", str9, "[0, 2]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0, 2, 32]" + "'", str14, "[0, 2, 32]");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        int int13 = linkedQueue0.size();
        java.lang.String str14 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[100]" + "'", str12, "[100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[100]" + "'", str14, "[100]");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        int int16 = linkedQueue0.dequeue();
        int int17 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        java.lang.String str9 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        int int12 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        java.lang.String str5 = linkedQueue0.toString();
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        int int15 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        int int17 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        int int12 = linkedQueue0.peekFront();
        java.lang.String str13 = linkedQueue0.toString();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str17 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 100]" + "'", str13, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        int int12 = linkedQueue0.size();
        java.lang.String str13 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        java.lang.String str17 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[100, -1]" + "'", str17, "[100, -1]");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.size();
        java.lang.String str9 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        java.lang.String str16 = linkedQueue0.toString();
        boolean boolean18 = linkedQueue0.enqueue(0);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0]" + "'", str16, "[0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        linkedQueue0.clear();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        boolean boolean16 = linkedQueue0.enqueue((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        linkedQueue0.clear();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.peekRear();
        int int10 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.size();
        int int15 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.peekRear();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        boolean boolean15 = linkedQueue0.isEmpty();
        boolean boolean17 = linkedQueue0.enqueue(2);
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.isEmpty();
        java.lang.String str11 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        int int13 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.String str8 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        boolean boolean18 = linkedQueue0.enqueue((int) '4');
        linkedQueue0.clear();
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.peekRear();
        int int14 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(0);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue(32);
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekRear();
        int int12 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100]" + "'", str7, "[100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100, 32]" + "'", str10, "[100, 32]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        boolean boolean13 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100]" + "'", str10, "[100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (short) 100);
        int int7 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.enqueue(1);
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        boolean boolean14 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        int int10 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.isEmpty();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        boolean boolean15 = linkedQueue0.enqueue((int) (byte) 100);
        boolean boolean17 = linkedQueue0.enqueue(32);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        int int12 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        boolean boolean14 = linkedQueue0.enqueue((int) (short) 0);
        int int15 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        boolean boolean7 = linkedQueue0.enqueue((int) (byte) 10);
        boolean boolean9 = linkedQueue0.enqueue(2);
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        int int16 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        int int14 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        java.lang.String str8 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int10 = linkedQueue0.size();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        java.lang.String str12 = linkedQueue0.toString();
        boolean boolean13 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 100]" + "'", str12, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        int int2 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean4 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[32, 100]" + "'", str13, "[32, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        // The following exception was thrown during execution in test generation
        try {
            int int18 = linkedQueue0.dequeue();
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
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        boolean boolean14 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        int int17 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 100, 32, 35]" + "'", str16, "[0, 100, 32, 35]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        int int12 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 2]" + "'", str9, "[0, 2]");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        int int13 = linkedQueue0.peekRear();
        int int14 = linkedQueue0.size();
        int int15 = linkedQueue0.peekFront();
        boolean boolean16 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        boolean boolean14 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        int int16 = linkedQueue0.peekRear();
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.size();
        java.lang.String str10 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str12 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 1);
        boolean boolean12 = linkedQueue0.enqueue((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.enqueue(0);
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue((int) 'a');
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue(0);
        int int11 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.enqueue((int) '4');
        int int14 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        int int15 = linkedQueue0.peekFront();
        int int16 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (short) 100);
        int int7 = linkedQueue0.peekFront();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[10, 100]" + "'", str8, "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        boolean boolean18 = linkedQueue0.enqueue((int) '4');
        int int19 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        int int16 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        int int10 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        java.lang.String str12 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        int int15 = linkedQueue0.peekFront();
        int int16 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.size();
        int int6 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.size();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 10);
        int int10 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 10);
        int int10 = linkedQueue0.dequeue();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str10 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        boolean boolean18 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
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
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.enqueue(0);
        int int12 = linkedQueue0.dequeue();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 0]" + "'", str13, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean8 = linkedQueue0.enqueue(4);
        int int9 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        int int9 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.dequeue();
        java.lang.String str12 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[100]" + "'", str12, "[100]");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        boolean boolean9 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str11 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        boolean boolean13 = linkedQueue0.enqueue(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        boolean boolean12 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.size();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        linkedQueue0.clear();
        boolean boolean14 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        boolean boolean13 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        boolean boolean16 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        linkedQueue0.clear();
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
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 2]" + "'", str8, "[0, 2]");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        boolean boolean14 = linkedQueue0.enqueue(100);
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        int int15 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        int int15 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        linkedQueue0.clear();
        int int11 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.enqueue(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
            int int13 = linkedQueue0.peekFront();
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
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        boolean boolean13 = linkedQueue0.isEmpty();
        boolean boolean15 = linkedQueue0.enqueue((int) 'a');
        linkedQueue0.clear();
        boolean boolean18 = linkedQueue0.enqueue(52);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        int int14 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue((int) (byte) 1);
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        linkedQueue0.clear();
        boolean boolean6 = linkedQueue0.enqueue(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        java.lang.String str3 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean5 = linkedQueue0.isEmpty();
        java.lang.String str6 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        java.lang.String str15 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0, 0, 32]" + "'", str15, "[0, 0, 32]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        boolean boolean11 = linkedQueue0.isEmpty();
        java.lang.String str12 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 1);
        java.lang.String str11 = linkedQueue0.toString();
        int int12 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[1]" + "'", str11, "[1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        boolean boolean7 = linkedQueue0.enqueue((int) (byte) 10);
        boolean boolean9 = linkedQueue0.enqueue(2);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        int int17 = linkedQueue0.size();
        int int18 = linkedQueue0.peekRear();
        int int19 = linkedQueue0.peekFront();
        int int20 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        int int15 = linkedQueue0.peekFront();
        boolean boolean17 = linkedQueue0.enqueue(5);
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
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        int int10 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        java.lang.String str12 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        int int12 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.enqueue((int) (byte) 1);
        int int9 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 1);
        linkedQueue0.clear();
        int int12 = linkedQueue0.size();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 2]" + "'", str8, "[0, 2]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        int int14 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.size();
        java.lang.String str12 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean8 = linkedQueue0.enqueue(4);
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
        java.lang.String str10 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        linkedQueue0.clear();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        boolean boolean16 = linkedQueue0.enqueue(0);
        int int17 = linkedQueue0.peekRear();
        int int18 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) 1);
        boolean boolean8 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.peekFront();
        java.lang.String str14 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0]" + "'", str14, "[0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0]" + "'", str8, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean10 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100]" + "'", str7, "[100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.peekRear();
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        int int17 = linkedQueue0.peekFront();
        int int18 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass19 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.peekFront();
        boolean boolean14 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        boolean boolean18 = linkedQueue0.enqueue((int) '4');
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 0, 100]" + "'", str16, "[0, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue(2);
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.size();
        boolean boolean11 = linkedQueue0.enqueue(0);
        java.lang.String str12 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[2, 0]" + "'", str12, "[2, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekFront();
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue((int) ' ');
        int int8 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        int int11 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        java.lang.String str13 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[1]" + "'", str13, "[1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        int int13 = linkedQueue0.size();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        java.lang.String str17 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[0]" + "'", str17, "[0]");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.String str13 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.dequeue();
        boolean boolean10 = linkedQueue0.enqueue(52);
        java.lang.String str11 = linkedQueue0.toString();
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.peekRear();
        int int15 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[52]" + "'", str11, "[52]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        int int14 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        boolean boolean16 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.size();
        java.lang.String str12 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[10]" + "'", str10, "[10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[10]" + "'", str12, "[10]");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekRear();
        int int11 = linkedQueue0.peekFront();
        boolean boolean13 = linkedQueue0.enqueue((int) ' ');
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 2]" + "'", str9, "[0, 2]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.dequeue();
        boolean boolean9 = linkedQueue0.enqueue((int) ' ');
        boolean boolean11 = linkedQueue0.enqueue(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        boolean boolean4 = linkedQueue0.enqueue(10);
        int int5 = linkedQueue0.peekFront();
        boolean boolean6 = linkedQueue0.isEmpty();
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean6 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue((int) (byte) 100);
        java.lang.String str11 = linkedQueue0.toString();
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.dequeue();
        int int14 = linkedQueue0.size();
        boolean boolean16 = linkedQueue0.enqueue((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[100]" + "'", str11, "[100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        boolean boolean16 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (short) 100);
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue(0);
        int int10 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        int int17 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean7 = linkedQueue0.isEmpty();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 100);
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.size();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.enqueue(2);
        boolean boolean12 = linkedQueue0.enqueue((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        int int18 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        boolean boolean20 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        java.lang.String str16 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 100, 35, 52]" + "'", str16, "[0, 100, 35, 52]");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.peekFront();
        java.lang.String str16 = linkedQueue0.toString();
        boolean boolean18 = linkedQueue0.enqueue((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 1]" + "'", str16, "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        int int12 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        linkedQueue0.clear();
        int int6 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0, 100]" + "'", str11, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        java.lang.String str5 = linkedQueue0.toString();
        linkedQueue0.clear();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue(2);
        int int10 = linkedQueue0.peekRear();
        boolean boolean12 = linkedQueue0.enqueue((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        java.lang.String str16 = linkedQueue0.toString();
        int int17 = linkedQueue0.peekRear();
        boolean boolean19 = linkedQueue0.enqueue(10);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 0]" + "'", str16, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.peekFront();
        int int14 = linkedQueue0.peekRear();
        java.lang.String str15 = linkedQueue0.toString();
        int int16 = linkedQueue0.dequeue();
        boolean boolean17 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0, 0, 0, 100]" + "'", str15, "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) 100);
        int int13 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.peekRear();
        int int10 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        int int15 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue(2);
        linkedQueue0.clear();
        int int11 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        int int17 = linkedQueue0.size();
        int int18 = linkedQueue0.peekRear();
        int int19 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass20 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        int int12 = linkedQueue0.peekFront();
        int int13 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        linkedQueue0.clear();
        java.lang.String str18 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.enqueue(0);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        java.lang.String str19 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[0, 0, 4]" + "'", str19, "[0, 0, 4]");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) 100);
        int int8 = linkedQueue0.dequeue();
        java.lang.String str9 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) -1);
        int int14 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        int int16 = linkedQueue0.size();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        int int13 = linkedQueue0.peekRear();
        int int14 = linkedQueue0.size();
        int int15 = linkedQueue0.peekFront();
        java.lang.String str16 = linkedQueue0.toString();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 0, 0]" + "'", str16, "[0, 0, 0]");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int10 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        int int9 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        java.lang.String str1 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean4 = linkedQueue0.enqueue(2);
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue((int) '#');
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[2]" + "'", str5, "[2]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str6 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 100);
        linkedQueue0.clear();
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 100);
        java.lang.String str14 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[100]" + "'", str14, "[100]");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 100, 32, 35]" + "'", str16, "[0, 100, 32, 35]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[0, 100, 32, 35]" + "'", str17, "[0, 100, 32, 35]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        boolean boolean4 = linkedQueue0.enqueue(4);
        boolean boolean6 = linkedQueue0.enqueue(3);
        int int7 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        int int15 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) -1);
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 10);
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.size();
        boolean boolean15 = linkedQueue0.enqueue(35);
        java.lang.String str16 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[-1, 10, 35]" + "'", str16, "[-1, 10, 35]");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
            int int9 = linkedQueue0.peekRear();
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
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        boolean boolean14 = linkedQueue0.isEmpty();
        int int15 = linkedQueue0.peekRear();
        java.lang.String str16 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[2]" + "'", str13, "[2]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[2]" + "'", str16, "[2]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str8 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
        java.lang.String str9 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekFront();
        int int12 = linkedQueue0.peekRear();
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
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.dequeue();
        int int8 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        int int2 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.peekRear();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) -1);
        int int10 = linkedQueue0.peekRear();
        int int11 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue(32);
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekRear();
        java.lang.String str12 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str14 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100]" + "'", str7, "[100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100, 32]" + "'", str10, "[100, 32]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[100, 32]" + "'", str12, "[100, 32]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        int int5 = linkedQueue0.size();
        boolean boolean6 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean12 = linkedQueue0.enqueue(1);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        int int18 = linkedQueue0.size();
        int int19 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        int int14 = linkedQueue0.size();
        int int15 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        java.lang.String str6 = linkedQueue0.toString();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0, 100]" + "'", str6, "[0, 100]");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[32, 100]" + "'", str8, "[32, 100]");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        java.lang.String str14 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.peekFront();
        java.lang.String str8 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        int int15 = linkedQueue0.size();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        boolean boolean10 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str12 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue(2);
        int int8 = linkedQueue0.dequeue();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.dequeue();
        int int8 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        boolean boolean4 = linkedQueue0.enqueue(10);
        int int5 = linkedQueue0.peekFront();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100]" + "'", str10, "[100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        linkedQueue0.clear();
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
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        boolean boolean15 = linkedQueue0.isEmpty();
        boolean boolean17 = linkedQueue0.enqueue(10);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.size();
        int int6 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue(0);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        boolean boolean14 = linkedQueue0.enqueue((int) (short) -1);
        java.lang.String str15 = linkedQueue0.toString();
        int int16 = linkedQueue0.peekRear();
        int int17 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0, 100, -1]" + "'", str15, "[0, 100, -1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        boolean boolean13 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int15 = linkedQueue0.size();
        boolean boolean17 = linkedQueue0.enqueue((-1));
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.peekRear();
        int int11 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0]" + "'", str8, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        int int12 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.dequeue();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean10 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        int int16 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        int int5 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        boolean boolean16 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[2]" + "'", str9, "[2]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean7 = linkedQueue0.isEmpty();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 100);
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        boolean boolean6 = linkedQueue0.enqueue(1);
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.size();
        int int13 = linkedQueue0.peekFront();
        int int14 = linkedQueue0.peekRear();
        java.lang.String str15 = linkedQueue0.toString();
        int int16 = linkedQueue0.peekRear();
        int int17 = linkedQueue0.peekRear();
        int int18 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass19 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0, 0, 0, 100]" + "'", str15, "[0, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekRear();
        java.lang.String str11 = linkedQueue0.toString();
        int int12 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0]" + "'", str11, "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue((-1));
        int int10 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.enqueue(0);
        int int8 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 10);
        int int10 = linkedQueue0.peekRear();
        int int11 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.enqueue(5);
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        int int13 = linkedQueue0.peekFront();
        int int14 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.enqueue((-1));
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue((int) ' ');
        java.lang.String str11 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[32]" + "'", str11, "[32]");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue((int) (byte) 100);
        int int11 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        boolean boolean14 = linkedQueue0.enqueue((-1));
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.size();
        java.lang.String str11 = linkedQueue0.toString();
        java.lang.String str12 = linkedQueue0.toString();
        boolean boolean13 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        int int14 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        int int13 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        java.lang.String str11 = linkedQueue0.toString();
        int int12 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.isEmpty();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        linkedQueue0.clear();
        int int16 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue((int) ' ');
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        java.lang.String str16 = linkedQueue0.toString();
        int int17 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0, 0]" + "'", str16, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.enqueue(10);
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.isEmpty();
        java.lang.String str12 = linkedQueue0.toString();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[32, 100, 10]" + "'", str12, "[32, 100, 10]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[32, 100, 10]" + "'", str13, "[32, 100, 10]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue(2);
        int int10 = linkedQueue0.peekRear();
        int int11 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekFront();
        boolean boolean12 = linkedQueue0.enqueue(4);
        int int13 = linkedQueue0.dequeue();
        java.lang.String str14 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[4]" + "'", str14, "[4]");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.size();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        java.lang.String str15 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0]" + "'", str15, "[0]");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) -1);
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 10);
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.dequeue();
        java.lang.String str14 = linkedQueue0.toString();
        int int15 = linkedQueue0.peekRear();
        boolean boolean17 = linkedQueue0.enqueue(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[10]" + "'", str14, "[10]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        boolean boolean16 = linkedQueue0.enqueue((int) (short) 100);
        int int17 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        int int13 = linkedQueue0.dequeue();
        boolean boolean15 = linkedQueue0.enqueue(0);
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        boolean boolean7 = linkedQueue0.enqueue((int) (byte) 10);
        int int8 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        boolean boolean4 = linkedQueue0.enqueue(10);
        int int5 = linkedQueue0.peekFront();
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        int int13 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[2]" + "'", str9, "[2]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[2]" + "'", str10, "[2]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[2]" + "'", str12, "[2]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
            int int14 = linkedQueue0.peekFront();
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
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.size();
        boolean boolean7 = linkedQueue0.enqueue((int) (byte) 10);
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.size();
        boolean boolean11 = linkedQueue0.enqueue(4);
        int int12 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue(2);
        int int8 = linkedQueue0.dequeue();
        java.lang.String str9 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        boolean boolean13 = linkedQueue0.enqueue(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        java.lang.String str23 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[0, -1, 32]" + "'", str23, "[0, -1, 32]");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        int int14 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekRear();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 2]" + "'", str9, "[0, 2]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
        java.lang.String str9 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        int int14 = linkedQueue0.peekFront();
        int int15 = linkedQueue0.dequeue();
        int int16 = linkedQueue0.peekRear();
        int int17 = linkedQueue0.peekFront();
        int int18 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass19 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean8 = linkedQueue0.enqueue(4);
        int int9 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean13 = linkedQueue0.enqueue(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekFront();
        int int6 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue(32);
        boolean boolean11 = linkedQueue0.enqueue(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue(32);
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100]" + "'", str7, "[100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100, 32]" + "'", str10, "[100, 32]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        java.lang.String str12 = linkedQueue0.toString();
        boolean boolean14 = linkedQueue0.enqueue((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[10]" + "'", str12, "[10]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) -1);
        boolean boolean8 = linkedQueue0.isEmpty();
        int int9 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        int int14 = linkedQueue0.peekRear();
        java.lang.String str15 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[0, -1]" + "'", str15, "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue((int) (byte) 100);
        java.lang.String str11 = linkedQueue0.toString();
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.peekRear();
        int int14 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[100]" + "'", str11, "[100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        int int17 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) -1);
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 10);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        int int14 = linkedQueue0.peekRear();
        int int15 = linkedQueue0.peekRear();
        int int16 = linkedQueue0.peekRear();
        int int17 = linkedQueue0.size();
        boolean boolean19 = linkedQueue0.enqueue((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        java.lang.String str12 = linkedQueue0.toString();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 0]" + "'", str9, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 0]" + "'", str12, "[0, 0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 0]" + "'", str13, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.size();
        int int11 = linkedQueue0.dequeue();
        int int12 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekRear();
        int int11 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        int int15 = linkedQueue0.peekRear();
        int int16 = linkedQueue0.peekRear();
        int int17 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        linkedQueue0.clear();
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
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        java.lang.String str11 = linkedQueue0.toString();
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[2]" + "'", str11, "[2]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean11 = linkedQueue0.enqueue(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean10 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.dequeue();
        int int12 = linkedQueue0.dequeue();
        boolean boolean14 = linkedQueue0.enqueue((int) (short) -1);
        boolean boolean15 = linkedQueue0.isEmpty();
        int int16 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        boolean boolean15 = linkedQueue0.enqueue(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        int int13 = linkedQueue0.peekRear();
        int int14 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) -1);
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 10);
        boolean boolean12 = linkedQueue0.isEmpty();
        int int13 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean15 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        java.lang.String str14 = linkedQueue0.toString();
        boolean boolean15 = linkedQueue0.isEmpty();
        int int16 = linkedQueue0.size();
        linkedQueue0.clear();
        boolean boolean18 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0, 32]" + "'", str14, "[0, 32]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        int int8 = linkedQueue0.dequeue();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.size();
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str14 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[10]" + "'", str10, "[10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[10, 10]" + "'", str14, "[10, 10]");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        boolean boolean17 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean20 = linkedQueue0.enqueue(1);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        int int17 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
}

