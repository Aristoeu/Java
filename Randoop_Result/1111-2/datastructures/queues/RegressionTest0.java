package datastructures.queues;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        java.lang.Class<?> wildcardClass1 = linkedQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass3 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass4 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass5 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        int int2 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.peekFront();
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
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass2 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.dequeue();
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
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        int int5 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = linkedQueue0.peekRear();
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
        java.lang.String str10 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0, 0]" + "'", str10, "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.enqueue((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekFront();
        int int6 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = linkedQueue0.peekRear();
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.String str8 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        int int2 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
            int int10 = linkedQueue0.dequeue();
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean2 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass3 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        java.lang.String str3 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = linkedQueue0.dequeue();
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
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[100]" + "'", str12, "[100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str8 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        int int5 = linkedQueue0.size();
        java.lang.String str6 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        int int10 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean2 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        linkedQueue0.clear();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekRear();
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100]" + "'", str7, "[100]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        boolean boolean14 = linkedQueue0.enqueue(3);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        int int13 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.size();
        int int6 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        int int2 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass4 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        java.lang.String str6 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0]" + "'", str6, "[0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        boolean boolean7 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 1);
        linkedQueue0.clear();
        int int13 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.enqueue(0);
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue(0);
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        boolean boolean13 = linkedQueue0.enqueue((int) (byte) -1);
        boolean boolean14 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0, 100]" + "'", str11, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
            int int10 = linkedQueue0.dequeue();
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
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str10 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        int int14 = linkedQueue0.peekRear();
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
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue(0);
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        int int2 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        int int9 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue(2);
        int int8 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 100, 0]" + "'", str12, "[0, 100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 0, 0]" + "'", str12, "[0, 0, 0]");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekRear();
        java.lang.String str6 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0]" + "'", str6, "[0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue(2);
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        int int5 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = linkedQueue0.dequeue();
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.enqueue(0);
        int int8 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        int int7 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
            int int12 = linkedQueue0.peekRear();
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) 1);
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.peekRear();
        int int10 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 2]" + "'", str9, "[0, 2]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        java.lang.String str9 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.dequeue();
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        java.lang.String str5 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        boolean boolean7 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        boolean boolean14 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str16 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue(0);
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.peekRear();
        java.lang.String str13 = linkedQueue0.toString();
        int int14 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[0, 0, 0]" + "'", str13, "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean7 = linkedQueue0.enqueue((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        int int5 = linkedQueue0.size();
        boolean boolean6 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (short) 100);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        java.lang.String str9 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 2]" + "'", str9, "[0, 2]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
            int int11 = linkedQueue0.dequeue();
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.size();
        boolean boolean7 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.enqueue((int) (byte) -1);
        int int9 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 100);
        int int12 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        int int5 = linkedQueue0.size();
        int int6 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue(2);
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.dequeue();
        boolean boolean9 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        linkedQueue0.clear();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        java.lang.String str5 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0]" + "'", str8, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(0);
        java.lang.String str6 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[32, 0]" + "'", str6, "[32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str10 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        int int11 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean11 = linkedQueue0.isEmpty();
        boolean boolean13 = linkedQueue0.enqueue((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        boolean boolean13 = linkedQueue0.enqueue(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        boolean boolean14 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        java.lang.String str9 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[2]" + "'", str9, "[2]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass5 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        int int12 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 100, 0]" + "'", str12, "[0, 100, 0]");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.String str10 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        int int2 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.isEmpty();
        boolean boolean4 = linkedQueue0.isEmpty();
        int int5 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (short) 100);
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue(0);
        int int10 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        boolean boolean10 = linkedQueue0.enqueue(2);
        java.lang.String str11 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0, 100, 2]" + "'", str11, "[0, 100, 2]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        int int5 = linkedQueue0.size();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.dequeue();
        java.lang.String str11 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
            int int10 = linkedQueue0.peekFront();
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
        int int9 = linkedQueue0.size();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean10 = linkedQueue0.enqueue((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        boolean boolean17 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) 1);
        int int8 = linkedQueue0.peekFront();
        int int9 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        java.lang.String str8 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        int int4 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass5 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        linkedQueue0.clear();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        int int9 = linkedQueue0.dequeue();
        java.lang.String str10 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[100]" + "'", str10, "[100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.size();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.peekFront();
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        linkedQueue0.clear();
        int int4 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) -1);
        boolean boolean9 = linkedQueue0.enqueue(3);
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
        java.lang.String str9 = linkedQueue0.toString();
        java.lang.String str10 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        boolean boolean14 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        linkedQueue0.clear();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0]" + "'", str14, "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        boolean boolean8 = linkedQueue0.enqueue(100);
        int int9 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        java.lang.String str6 = linkedQueue0.toString();
        boolean boolean8 = linkedQueue0.enqueue(3);
        int int9 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0]" + "'", str6, "[0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        java.lang.String str9 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 0]" + "'", str9, "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 10);
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        boolean boolean13 = linkedQueue0.enqueue((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        java.lang.String str7 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
            int int11 = linkedQueue0.peekFront();
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
            int int12 = linkedQueue0.dequeue();
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[2]" + "'", str9, "[2]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.size();
        linkedQueue0.clear();
        java.lang.String str11 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 100);
        int int9 = linkedQueue0.dequeue();
        boolean boolean10 = linkedQueue0.isEmpty();
        int int11 = linkedQueue0.peekFront();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.dequeue();
        boolean boolean7 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekRear();
        int int6 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
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
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue((int) ' ');
        int int12 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        boolean boolean7 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.size();
        java.lang.String str6 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[10]" + "'", str6, "[10]");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        java.lang.String str9 = linkedQueue0.toString();
        java.lang.String str10 = linkedQueue0.toString();
        int int11 = linkedQueue0.dequeue();
        java.lang.String str12 = linkedQueue0.toString();
        java.lang.String str13 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[2]" + "'", str9, "[2]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[2]" + "'", str10, "[2]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        java.lang.String str8 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0]" + "'", str8, "[0, 0]");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        boolean boolean14 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        java.lang.String str5 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
            int int14 = linkedQueue0.peekRear();
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        boolean boolean11 = linkedQueue0.enqueue((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        boolean boolean4 = linkedQueue0.enqueue(10);
        int int5 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
            int int9 = linkedQueue0.dequeue();
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        boolean boolean15 = linkedQueue0.enqueue((int) (short) 10);
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        int int7 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.peekRear();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        java.lang.String str12 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        int int5 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        boolean boolean13 = linkedQueue0.enqueue(32);
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.peekRear();
        boolean boolean8 = linkedQueue0.enqueue((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean8 = linkedQueue0.enqueue(4);
        java.lang.String str9 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[4]" + "'", str9, "[4]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.dequeue();
        boolean boolean8 = linkedQueue0.enqueue(4);
        int int9 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.enqueue((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        int int5 = linkedQueue0.size();
        java.lang.String str6 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        int int2 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        int int9 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        java.lang.String str10 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[0]" + "'", str10, "[0]");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        linkedQueue0.clear();
        java.lang.String str21 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.dequeue();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[2]" + "'", str9, "[2]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.size();
        int int12 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        java.lang.Class<?> wildcardClass15 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.dequeue();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.peekFront();
        int int11 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        int int10 = linkedQueue0.size();
        boolean boolean11 = linkedQueue0.isEmpty();
        int int12 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.peekRear();
        boolean boolean7 = linkedQueue0.enqueue((int) (short) -1);
        int int8 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean8 = linkedQueue0.enqueue((int) (short) 0);
        int int9 = linkedQueue0.peekFront();
        int int10 = linkedQueue0.peekFront();
        boolean boolean11 = linkedQueue0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass10 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        int int4 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str9 = linkedQueue0.toString();
        int int10 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 100]" + "'", str7, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        int int5 = linkedQueue0.size();
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
        boolean boolean10 = linkedQueue0.enqueue(5);
        int int11 = linkedQueue0.dequeue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        int int16 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.dequeue();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue(32);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[100]" + "'", str7, "[100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.size();
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0]" + "'", str7, "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        int int10 = linkedQueue0.size();
        boolean boolean12 = linkedQueue0.enqueue(100);
        int int13 = linkedQueue0.dequeue();
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue((int) (byte) 0);
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekRear();
        int int9 = linkedQueue0.dequeue();
        int int10 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.isEmpty();
        int int10 = linkedQueue0.dequeue();
        int int11 = linkedQueue0.peekRear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        boolean boolean17 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass18 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[10]" + "'", str5, "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        java.lang.String str13 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        java.lang.Class<?> wildcardClass6 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[32]" + "'", str5, "[32]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        int int4 = linkedQueue0.size();
        int int5 = linkedQueue0.size();
        int int6 = linkedQueue0.size();
        java.lang.String str7 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekRear();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.String str8 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        linkedQueue0.clear();
        boolean boolean18 = linkedQueue0.enqueue((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekRear();
        int int7 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.size();
        int int6 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        java.lang.Class<?> wildcardClass14 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        int int15 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass13 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        int int15 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass16 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        boolean boolean14 = linkedQueue0.enqueue((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[0, 100, 0]" + "'", str12, "[0, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.dequeue();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
            int int12 = linkedQueue0.peekRear();
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        java.lang.String str5 = linkedQueue0.toString();
        java.lang.String str6 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0]" + "'", str6, "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        linkedQueue0.clear();
        linkedQueue0.clear();
        int int6 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0, 100]" + "'", str11, "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        int int8 = linkedQueue0.size();
        int int9 = linkedQueue0.size();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        java.lang.String str5 = linkedQueue0.toString();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = linkedQueue0.peekRear();
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
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        java.lang.String str2 = linkedQueue0.toString();
        int int3 = linkedQueue0.size();
        boolean boolean5 = linkedQueue0.enqueue(2);
        boolean boolean7 = linkedQueue0.enqueue((int) (byte) 10);
        boolean boolean9 = linkedQueue0.enqueue(2);
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = linkedQueue0.dequeue();
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
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        int int7 = linkedQueue0.peekFront();
        linkedQueue0.clear();
        boolean boolean9 = linkedQueue0.isEmpty();
        boolean boolean11 = linkedQueue0.enqueue(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        linkedQueue0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[2]" + "'", str9, "[2]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[2]" + "'", str10, "[2]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0]" + "'", str14, "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[0]" + "'", str16, "[0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        linkedQueue0.clear();
        java.lang.String str11 = linkedQueue0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        linkedQueue0.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = linkedQueue0.peekRear();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) ' ');
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekRear();
        linkedQueue0.clear();
        int int9 = linkedQueue0.size();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean2 = linkedQueue0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = linkedQueue0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass17 = linkedQueue0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
            int int13 = linkedQueue0.peekRear();
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        boolean boolean6 = linkedQueue0.isEmpty();
        int int7 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(100);
        int int6 = linkedQueue0.size();
        int int7 = linkedQueue0.peekFront();
        int int8 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.peekFront();
        int int6 = linkedQueue0.size();
        java.lang.Class<?> wildcardClass7 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        int int13 = linkedQueue0.size();
        int int14 = linkedQueue0.peekFront();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) -1);
        boolean boolean10 = linkedQueue0.isEmpty();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0, 0]" + "'", str7, "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        int int7 = linkedQueue0.size();
        java.lang.String str8 = linkedQueue0.toString();
        linkedQueue0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 100]" + "'", str8, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        boolean boolean5 = linkedQueue0.enqueue(2);
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean8 = linkedQueue0.isEmpty();
        int int9 = linkedQueue0.size();
        int int10 = linkedQueue0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        int int2 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.isEmpty();
        boolean boolean4 = linkedQueue0.isEmpty();
        java.lang.String str5 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        int int19 = linkedQueue0.peekFront();
        java.lang.Class<?> wildcardClass20 = linkedQueue0.getClass();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        int int6 = linkedQueue0.peekFront();
        int int7 = linkedQueue0.size();
        boolean boolean9 = linkedQueue0.enqueue((int) (short) 0);
        boolean boolean10 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        int int8 = linkedQueue0.peekFront();
        boolean boolean10 = linkedQueue0.enqueue((int) (short) 10);
        java.lang.String str11 = linkedQueue0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0, 0, 10]" + "'", str11, "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        java.lang.Class<?> wildcardClass12 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 100]" + "'", str9, "[0, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        int int4 = linkedQueue0.peekRear();
        int int5 = linkedQueue0.dequeue();
        boolean boolean6 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        boolean boolean8 = linkedQueue0.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        linkedQueue0.clear();
        int int6 = linkedQueue0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = linkedQueue0.dequeue();
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        java.lang.String str1 = linkedQueue0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = linkedQueue0.peekFront();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: queue is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean6 = linkedQueue0.enqueue(0);
        boolean boolean7 = linkedQueue0.isEmpty();
        java.lang.String str8 = linkedQueue0.toString();
        java.lang.String str9 = linkedQueue0.toString();
        linkedQueue0.clear();
        boolean boolean12 = linkedQueue0.enqueue(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0, 0]" + "'", str8, "[0, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[0, 0]" + "'", str9, "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[0]" + "'", str14, "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue((int) (byte) 10);
        java.lang.String str4 = linkedQueue0.toString();
        int int5 = linkedQueue0.size();
        int int6 = linkedQueue0.dequeue();
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass8 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[10]" + "'", str4, "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.thealgorithms.datastructures.queues.LinkedQueue linkedQueue0 = new com.thealgorithms.datastructures.queues.LinkedQueue();
        int int1 = linkedQueue0.size();
        boolean boolean3 = linkedQueue0.enqueue(0);
        java.lang.String str4 = linkedQueue0.toString();
        boolean boolean5 = linkedQueue0.isEmpty();
        linkedQueue0.clear();
        java.lang.String str7 = linkedQueue0.toString();
        boolean boolean9 = linkedQueue0.enqueue((int) (byte) 0);
        linkedQueue0.clear();
        java.lang.Class<?> wildcardClass11 = linkedQueue0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[0]" + "'", str4, "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        java.lang.String str12 = linkedQueue0.toString();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }
}
