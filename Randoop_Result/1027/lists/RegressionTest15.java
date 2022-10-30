package lists;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        java.lang.String str4 = countSinglyLinkedListRecursion0.toString();
        int int5 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.print();
        boolean boolean7 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.swapNodes(1, 2);
        int int11 = countSinglyLinkedListRecursion0.size();
        int int12 = countSinglyLinkedListRecursion0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.deleteHead();
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.swapNodes((int) '4', (int) '4');
        boolean boolean12 = countSinglyLinkedListRecursion0.search(1);
        countSinglyLinkedListRecursion0.insertHead(52);
        countSinglyLinkedListRecursion0.deleteNth(0);
        java.lang.String str17 = countSinglyLinkedListRecursion0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.swapNodes((int) (byte) 1, (int) (short) 0);
        int int7 = countSinglyLinkedListRecursion0.size();
        boolean boolean9 = countSinglyLinkedListRecursion0.search((int) '4');
        countSinglyLinkedListRecursion0.insert((int) '#');
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.insert(0);
        int int16 = countSinglyLinkedListRecursion0.getNth(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.insert((int) '#');
        int int9 = countSinglyLinkedListRecursion0.getNth((int) (short) 0);
        countSinglyLinkedListRecursion0.deleteHead();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.insertHead(10);
        countSinglyLinkedListRecursion0.print();
        java.lang.String str15 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.insertNth(3, 2);
        boolean boolean19 = countSinglyLinkedListRecursion0.isEmpty();
        int int20 = countSinglyLinkedListRecursion0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10->35" + "'", str15, "10->35");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.deleteHead();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        int int8 = countSinglyLinkedListRecursion0.count();
        boolean boolean9 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.print();
        boolean boolean12 = countSinglyLinkedListRecursion0.isEmpty();
        boolean boolean14 = countSinglyLinkedListRecursion0.search(1);
        countSinglyLinkedListRecursion0.clear();
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.insertNth(5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.swapNodes((int) '#', 100);
        boolean boolean10 = countSinglyLinkedListRecursion0.search((int) (short) 10);
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.deleteHead();
        int int13 = countSinglyLinkedListRecursion0.count();
        boolean boolean14 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.insert(0);
        int int17 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.print();
        int int19 = countSinglyLinkedListRecursion0.count();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.insertHead((int) (short) 1);
        boolean boolean6 = countSinglyLinkedListRecursion0.detectLoop();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.print();
        java.lang.String str9 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.insert(0);
        int int13 = countSinglyLinkedListRecursion0.getNth((int) (byte) 1);
        int int14 = countSinglyLinkedListRecursion0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        boolean boolean5 = countSinglyLinkedListRecursion0.search(0);
        countSinglyLinkedListRecursion0.clear();
        boolean boolean7 = countSinglyLinkedListRecursion0.isEmpty();
        int int8 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.print();
        int int10 = countSinglyLinkedListRecursion0.count();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        int int3 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.insert((int) '#');
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.swapNodes((int) ' ', (int) (short) 10);
        countSinglyLinkedListRecursion0.insert(10);
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.insertHead((int) '#');
        countSinglyLinkedListRecursion0.delete();
        countSinglyLinkedListRecursion0.insertNth(2, 0);
        countSinglyLinkedListRecursion0.print();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.clear();
        boolean boolean3 = countSinglyLinkedListRecursion0.detectLoop();
        boolean boolean4 = countSinglyLinkedListRecursion0.isEmpty();
        boolean boolean5 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.clear();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        int int3 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.insert((int) '#');
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.swapNodes((int) ' ', (int) (short) 10);
        countSinglyLinkedListRecursion0.insertNth(0, 0);
        countSinglyLinkedListRecursion0.delete();
        int int14 = countSinglyLinkedListRecursion0.count();
        boolean boolean16 = countSinglyLinkedListRecursion0.search(0);
        countSinglyLinkedListRecursion0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.deleteHead();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.insert(10);
        boolean boolean11 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.insert((int) (short) 0);
        countSinglyLinkedListRecursion0.clear();
        int int15 = countSinglyLinkedListRecursion0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = countSinglyLinkedListRecursion0.getNth((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        int int1 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.swapNodes((int) (short) 0, (int) (byte) -1);
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.swapNodes((int) '#', (-1));
        countSinglyLinkedListRecursion0.insertHead(1);
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.insertHead(100);
        countSinglyLinkedListRecursion0.insert((int) (byte) 1);
        countSinglyLinkedListRecursion0.deleteDuplicates();
        int int19 = countSinglyLinkedListRecursion0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.swapNodes(1, 0);
        boolean boolean6 = countSinglyLinkedListRecursion0.search((int) (byte) 10);
        boolean boolean8 = countSinglyLinkedListRecursion0.search(1);
        boolean boolean9 = countSinglyLinkedListRecursion0.isEmpty();
        boolean boolean11 = countSinglyLinkedListRecursion0.search((int) '4');
        int int12 = countSinglyLinkedListRecursion0.size();
        boolean boolean14 = countSinglyLinkedListRecursion0.search((int) (byte) 10);
        countSinglyLinkedListRecursion0.insert((int) (short) -1);
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.insert(4);
        boolean boolean20 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        boolean boolean5 = countSinglyLinkedListRecursion0.search((int) (short) 0);
        boolean boolean7 = countSinglyLinkedListRecursion0.search(100);
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.insertHead(0);
        boolean boolean12 = countSinglyLinkedListRecursion0.search((int) (short) 1);
        countSinglyLinkedListRecursion0.deleteHead();
        countSinglyLinkedListRecursion0.insert((int) ' ');
        countSinglyLinkedListRecursion0.clear();
        boolean boolean18 = countSinglyLinkedListRecursion0.search(100);
        countSinglyLinkedListRecursion0.clear();
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.delete();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.insert((int) '#');
        countSinglyLinkedListRecursion0.swapNodes((int) (short) 0, 0);
        boolean boolean11 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.insertHead((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.swapNodes(1, 0);
        countSinglyLinkedListRecursion0.clear();
        boolean boolean6 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.print();
        int int8 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insert((int) (short) -1);
        int int11 = countSinglyLinkedListRecursion0.count();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        int int1 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.swapNodes((int) (short) 0, (int) (byte) -1);
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        boolean boolean9 = countSinglyLinkedListRecursion0.search((int) (byte) 0);
        countSinglyLinkedListRecursion0.swapNodes((int) 'a', (int) (byte) 10);
        int int13 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.clear();
        int int15 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(3);
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.insertNth(1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.deleteHead();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        int int8 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.clear();
        java.lang.String str10 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.insertHead((int) (byte) 10);
        countSinglyLinkedListRecursion0.swapNodes(52, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.checkBounds((int) ' ', 4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        boolean boolean7 = countSinglyLinkedListRecursion0.search((int) (short) 0);
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.swapNodes((int) (byte) -1, (int) (short) 100);
        int int12 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.insert((int) (short) 1);
        countSinglyLinkedListRecursion0.delete();
        countSinglyLinkedListRecursion0.insertNth((int) (short) 10, (int) (short) 1);
        countSinglyLinkedListRecursion0.swapNodes((int) '#', (int) (byte) 1);
        boolean boolean22 = countSinglyLinkedListRecursion0.detectLoop();
        int int23 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        boolean boolean3 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.insertHead((int) (short) 100);
        int int6 = countSinglyLinkedListRecursion0.count();
        int int7 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        boolean boolean11 = countSinglyLinkedListRecursion0.search((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.swapNodes((int) (byte) 1, (int) (short) 0);
        int int7 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insert(0);
        countSinglyLinkedListRecursion0.insert(100);
        boolean boolean12 = countSinglyLinkedListRecursion0.isEmpty();
        boolean boolean14 = countSinglyLinkedListRecursion0.search((int) (byte) 0);
        int int15 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        int int17 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.insertHead((int) (byte) -1);
        int int20 = countSinglyLinkedListRecursion0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.clear();
        boolean boolean3 = countSinglyLinkedListRecursion0.detectLoop();
        int int4 = countSinglyLinkedListRecursion0.size();
        java.lang.String str5 = countSinglyLinkedListRecursion0.toString();
        int int6 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.print();
        boolean boolean9 = countSinglyLinkedListRecursion0.detectLoop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        int int1 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insert((int) (byte) 1);
        java.lang.String str4 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.delete();
        countSinglyLinkedListRecursion0.swapNodes(0, 100);
        boolean boolean9 = countSinglyLinkedListRecursion0.detectLoop();
        boolean boolean10 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.swapNodes((int) 'a', 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        int int3 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.insert((int) '#');
        countSinglyLinkedListRecursion0.print();
        boolean boolean7 = countSinglyLinkedListRecursion0.detectLoop();
        boolean boolean8 = countSinglyLinkedListRecursion0.detectLoop();
        boolean boolean9 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.deleteHead();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        int int8 = countSinglyLinkedListRecursion0.count();
        boolean boolean9 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.print();
        boolean boolean12 = countSinglyLinkedListRecursion0.isEmpty();
        boolean boolean14 = countSinglyLinkedListRecursion0.search(1);
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.clear();
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.delete();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        int int1 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.swapNodes((int) (short) 0, (int) (byte) -1);
        java.lang.String str6 = countSinglyLinkedListRecursion0.toString();
        int int7 = countSinglyLinkedListRecursion0.count();
        boolean boolean8 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.insert((int) (short) 1);
        int int11 = countSinglyLinkedListRecursion0.count();
        int int12 = countSinglyLinkedListRecursion0.size();
        int int13 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.insertHead(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        int int1 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.swapNodes((int) (short) 0, (int) (byte) -1);
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.swapNodes((int) '#', (-1));
        countSinglyLinkedListRecursion0.insertHead(1);
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.insertHead(100);
        countSinglyLinkedListRecursion0.insert((int) (byte) 1);
        countSinglyLinkedListRecursion0.print();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.insertHead((int) (short) 1);
        boolean boolean6 = countSinglyLinkedListRecursion0.detectLoop();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.swapNodes((int) (byte) 100, (int) (short) 100);
        boolean boolean11 = countSinglyLinkedListRecursion0.isEmpty();
        int int12 = countSinglyLinkedListRecursion0.count();
        int int13 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.delete();
        countSinglyLinkedListRecursion0.swapNodes(5, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        boolean boolean3 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.insertHead((int) (short) 100);
        java.lang.String str6 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.clear();
        boolean boolean8 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.insert((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100" + "'", str6, "100");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.deleteHead();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.insert(10);
        int int11 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.deleteHead();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.clear();
        int int9 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        boolean boolean12 = countSinglyLinkedListRecursion0.search(3);
        java.lang.String str13 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.clear();
        java.lang.String str15 = countSinglyLinkedListRecursion0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.insertHead((int) (short) 1);
        boolean boolean6 = countSinglyLinkedListRecursion0.detectLoop();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.deleteNth((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.clear();
        boolean boolean4 = countSinglyLinkedListRecursion0.detectLoop();
        java.lang.String str5 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.insertHead((int) 'a');
        int int8 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.checkBounds((-1), (int) (short) -1, 10);
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.delete();
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.insertNth((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.swapNodes((int) (byte) 1, (int) (short) 0);
        int int7 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.insertNth((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.swapNodes((int) '#', 100);
        boolean boolean10 = countSinglyLinkedListRecursion0.search((int) (short) 10);
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        int int13 = countSinglyLinkedListRecursion0.count();
        java.lang.String str14 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.insert((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.checkBounds(10, (int) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
    }
}

