package datastructures.lists;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        int int1 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        boolean boolean3 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.clear();
        boolean boolean5 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.insert(3);
        countSinglyLinkedListRecursion0.deleteDuplicates();
        boolean boolean10 = countSinglyLinkedListRecursion0.search(7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.deleteHead();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        boolean boolean8 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.swapNodes(10, (int) 'a');
        boolean boolean12 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.insertHead((int) (short) 0);
        boolean boolean16 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        boolean boolean18 = countSinglyLinkedListRecursion0.detectLoop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        int int1 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.swapNodes((int) (short) 0, (int) (byte) -1);
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        boolean boolean9 = countSinglyLinkedListRecursion0.search((int) (byte) 0);
        boolean boolean11 = countSinglyLinkedListRecursion0.search((int) (byte) 0);
        countSinglyLinkedListRecursion0.swapNodes(35, 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        int int3 = countSinglyLinkedListRecursion0.count();
        int int4 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.print();
        int int6 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.checkBounds(0, (int) (short) 0, 0);
        boolean boolean11 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.insert((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
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
        countSinglyLinkedListRecursion0.insert(52);
        countSinglyLinkedListRecursion0.deleteDuplicates();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean2 = countSinglyLinkedListRecursion0.search(3);
        boolean boolean3 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.checkBounds(1, (int) (short) 1, 3);
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.insertNth(2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.deleteHead();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        boolean boolean8 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.swapNodes(10, (int) 'a');
        countSinglyLinkedListRecursion0.print();
        boolean boolean13 = countSinglyLinkedListRecursion0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.deleteHead();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        int int3 = countSinglyLinkedListRecursion0.count();
        int int4 = countSinglyLinkedListRecursion0.size();
        int int5 = countSinglyLinkedListRecursion0.count();
        boolean boolean7 = countSinglyLinkedListRecursion0.search((-1));
        int int8 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.insertHead((int) (byte) 100);
        countSinglyLinkedListRecursion0.delete();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.deleteHead();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        boolean boolean8 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.swapNodes(10, (int) 'a');
        countSinglyLinkedListRecursion0.insertHead((int) (byte) 100);
        int int14 = countSinglyLinkedListRecursion0.count();
        boolean boolean15 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.insert((int) (byte) 10);
        countSinglyLinkedListRecursion0.swapNodes(0, 4);
        countSinglyLinkedListRecursion0.insertHead((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.deleteNth(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        int int1 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insert((int) (byte) 1);
        java.lang.String str4 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.delete();
        countSinglyLinkedListRecursion0.insert((int) (short) -1);
        countSinglyLinkedListRecursion0.checkBounds(0, 0, (int) (byte) 100);
        countSinglyLinkedListRecursion0.print();
        int int13 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.insert((int) '#');
        boolean boolean17 = countSinglyLinkedListRecursion0.search((int) (short) 10);
        countSinglyLinkedListRecursion0.insert((int) (byte) 1);
        countSinglyLinkedListRecursion0.insertNth((int) (byte) -1, (int) (byte) 0);
        countSinglyLinkedListRecursion0.deleteHead();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        int int3 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.insert((int) '#');
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.swapNodes((int) ' ', (int) (short) 10);
        countSinglyLinkedListRecursion0.insert(10);
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.print();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.clear();
        boolean boolean4 = countSinglyLinkedListRecursion0.detectLoop();
        java.lang.String str5 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.insert((int) (short) 1);
        int int9 = countSinglyLinkedListRecursion0.count();
        boolean boolean10 = countSinglyLinkedListRecursion0.detectLoop();
        int int11 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.print();
        boolean boolean13 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.insertNth((int) '#', 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.deleteHead();
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.swapNodes((int) '4', (int) '4');
        boolean boolean12 = countSinglyLinkedListRecursion0.search(1);
        countSinglyLinkedListRecursion0.insertHead(1);
        boolean boolean16 = countSinglyLinkedListRecursion0.search((int) ' ');
        countSinglyLinkedListRecursion0.insert(3);
        boolean boolean19 = countSinglyLinkedListRecursion0.isEmpty();
        java.lang.String str20 = countSinglyLinkedListRecursion0.toString();
        countSinglyLinkedListRecursion0.checkBounds(100, (int) (byte) 1, (int) (byte) 100);
        countSinglyLinkedListRecursion0.checkBounds((int) (byte) 10, (int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass29 = countSinglyLinkedListRecursion0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1->3" + "'", str20, "1->3");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        int int1 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.print();
        countSinglyLinkedListRecursion0.print();
        boolean boolean4 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.insert(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        countSinglyLinkedListRecursion0.print();
        int int2 = countSinglyLinkedListRecursion0.count();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.swapNodes(0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.delete();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        int int1 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.swapNodes((int) (short) 0, (int) (byte) -1);
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        boolean boolean9 = countSinglyLinkedListRecursion0.search((int) (byte) 0);
        int int10 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.insertNth((-1), 0);
        int int14 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.insertHead(4);
        java.lang.String str17 = countSinglyLinkedListRecursion0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4->-1" + "'", str17, "4->-1");
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.deleteHead();
        java.lang.String str7 = countSinglyLinkedListRecursion0.toString();
        int int8 = countSinglyLinkedListRecursion0.count();
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.insert((int) (short) 100);
        countSinglyLinkedListRecursion0.delete();
        countSinglyLinkedListRecursion0.deleteDuplicates();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        countSinglyLinkedListRecursion0.insert((int) '#');
        int int9 = countSinglyLinkedListRecursion0.getNth((int) (short) 0);
        java.lang.String str10 = countSinglyLinkedListRecursion0.toString();
        boolean boolean11 = countSinglyLinkedListRecursion0.isEmpty();
        java.lang.String str12 = countSinglyLinkedListRecursion0.toString();
        java.lang.String str13 = countSinglyLinkedListRecursion0.toString();
        // The following exception was thrown during execution in test generation
        try {
            countSinglyLinkedListRecursion0.deleteNth((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0->35" + "'", str10, "0->35");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0->35" + "'", str12, "0->35");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0->35" + "'", str13, "0->35");
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.print();
        int int3 = countSinglyLinkedListRecursion0.size();
        countSinglyLinkedListRecursion0.insertHead(0);
        boolean boolean7 = countSinglyLinkedListRecursion0.search((int) (short) 0);
        boolean boolean8 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.swapNodes((int) '#', (-1));
        countSinglyLinkedListRecursion0.insert((int) (short) 1);
        boolean boolean14 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.clear();
        countSinglyLinkedListRecursion0.insertHead((int) (byte) 0);
        boolean boolean18 = countSinglyLinkedListRecursion0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion countSinglyLinkedListRecursion0 = new com.thealgorithms.datastructures.lists.CountSinglyLinkedListRecursion();
        boolean boolean1 = countSinglyLinkedListRecursion0.detectLoop();
        countSinglyLinkedListRecursion0.swapNodes(1, 0);
        countSinglyLinkedListRecursion0.clear();
        boolean boolean6 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.insertHead(10);
        countSinglyLinkedListRecursion0.insertHead((int) (short) -1);
        boolean boolean12 = countSinglyLinkedListRecursion0.search(3);
        countSinglyLinkedListRecursion0.deleteDuplicates();
        countSinglyLinkedListRecursion0.insert((int) (short) 0);
        boolean boolean16 = countSinglyLinkedListRecursion0.isEmpty();
        countSinglyLinkedListRecursion0.deleteHead();
        boolean boolean19 = countSinglyLinkedListRecursion0.search((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }
}

