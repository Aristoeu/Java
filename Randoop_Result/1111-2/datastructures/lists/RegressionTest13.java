package datastructures.lists;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.deleteDuplicates();
        int int7 = singlyLinkedList0.size();
        singlyLinkedList0.swapNodes(1, (int) (byte) 10);
        singlyLinkedList0.swapNodes(10, 2);
        singlyLinkedList0.insert(0);
        singlyLinkedList0.print();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.swapNodes((int) (byte) 10, 0);
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.clear();
        boolean boolean6 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertNth((int) (byte) 10, (int) (byte) 0);
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.insert((int) ' ');
        boolean boolean14 = singlyLinkedList0.search(32);
        int int15 = singlyLinkedList0.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insertNth((int) '#', 0);
        singlyLinkedList0.swapNodes((int) (short) 100, (-1));
        int int9 = singlyLinkedList0.count();
        boolean boolean11 = singlyLinkedList0.search((int) (short) 10);
        int int12 = singlyLinkedList0.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        boolean boolean8 = singlyLinkedList0.search((int) (byte) -1);
        singlyLinkedList0.print();
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead(0);
        java.lang.String str13 = singlyLinkedList0.toString();
        singlyLinkedList0.insert(2);
        singlyLinkedList0.insert((int) (short) -1);
        java.lang.String str18 = singlyLinkedList0.toString();
        singlyLinkedList0.insertHead(1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0->2->-1" + "'", str18, "0->2->-1");
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.swapNodes((int) (byte) 10, 0);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean5 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertNth((int) '4', (int) (short) 0);
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.swapNodes((int) '#', (int) (short) 100);
        singlyLinkedList0.insertHead((int) (short) 1);
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.clear();
        boolean boolean17 = singlyLinkedList0.detectLoop();
        boolean boolean18 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.clear();
        boolean boolean20 = singlyLinkedList0.detectLoop();
        int int21 = singlyLinkedList0.size();
        boolean boolean22 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.swapNodes((int) (short) 0, 32);
        java.lang.String str26 = singlyLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.clear();
        int int8 = singlyLinkedList0.count();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean9 = singlyLinkedList0.search((int) (short) 10);
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.checkBounds((int) (byte) 0, 0, 0);
        singlyLinkedList0.insert(1);
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.insert(2);
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.swapNodes((int) (short) 10, (int) '4');
        boolean boolean25 = singlyLinkedList0.detectLoop();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        int int11 = singlyLinkedList0.getNth(0);
        singlyLinkedList0.deleteDuplicates();
        int int13 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 0);
        boolean boolean13 = singlyLinkedList0.search(10);
        singlyLinkedList0.checkBounds(32, (int) (byte) 10, 32);
        singlyLinkedList0.swapNodes((int) (short) 10, (int) (byte) -1);
        singlyLinkedList0.print();
        singlyLinkedList0.delete();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insertHead((int) (short) 10);
        boolean boolean13 = singlyLinkedList0.isEmpty();
        int int14 = singlyLinkedList0.count();
        boolean boolean15 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.swapNodes((int) (byte) 10, 0);
        boolean boolean5 = singlyLinkedList0.search((int) (byte) 0);
        boolean boolean6 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.swapNodes(1, (int) (short) -1);
        int int12 = singlyLinkedList0.count();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.insertNth((int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.deleteHead();
        int int11 = singlyLinkedList0.size();
        int int12 = singlyLinkedList0.size();
        singlyLinkedList0.print();
        int int14 = singlyLinkedList0.count();
        java.lang.String str15 = singlyLinkedList0.toString();
        singlyLinkedList0.swapNodes((int) (short) 0, 97);
        singlyLinkedList0.insertHead((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 0);
        singlyLinkedList0.print();
        int int13 = singlyLinkedList0.count();
        java.lang.String str14 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.clear();
        singlyLinkedList0.insertHead((int) (short) 100);
        boolean boolean20 = singlyLinkedList0.search(52);
        boolean boolean21 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.clear();
        singlyLinkedList0.clear();
        java.lang.String str12 = singlyLinkedList0.toString();
        singlyLinkedList0.swapNodes(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        boolean boolean7 = singlyLinkedList0.isEmpty();
        int int8 = singlyLinkedList0.count();
        boolean boolean9 = singlyLinkedList0.detectLoop();
        java.lang.String str10 = singlyLinkedList0.toString();
        boolean boolean11 = singlyLinkedList0.isEmpty();
        boolean boolean12 = singlyLinkedList0.detectLoop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.swapNodes((int) (byte) 10, 0);
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str5 = singlyLinkedList0.toString();
        boolean boolean6 = singlyLinkedList0.isEmpty();
        boolean boolean7 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.swapNodes((int) '#', (int) (byte) 100);
        int int11 = singlyLinkedList0.size();
        java.lang.String str12 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) '#');
        int int15 = singlyLinkedList0.size();
        int int17 = singlyLinkedList0.getNth((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (short) 0);
        java.lang.String str13 = singlyLinkedList0.toString();
        int int14 = singlyLinkedList0.count();
        boolean boolean15 = singlyLinkedList0.isEmpty();
        int int16 = singlyLinkedList0.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100" + "'", str13, "100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean9 = singlyLinkedList0.search((int) (short) 10);
        singlyLinkedList0.swapNodes(0, 100);
        singlyLinkedList0.swapNodes(100, (int) (byte) 1);
        int int16 = singlyLinkedList0.size();
        singlyLinkedList0.insert((int) (short) 0);
        singlyLinkedList0.print();
        boolean boolean20 = singlyLinkedList0.detectLoop();
        boolean boolean21 = singlyLinkedList0.isEmpty();
        boolean boolean22 = singlyLinkedList0.detectLoop();
        boolean boolean24 = singlyLinkedList0.search(3);
        boolean boolean25 = singlyLinkedList0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.insertNth((int) 'a', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        int int11 = singlyLinkedList0.getNth(0);
        singlyLinkedList0.print();
        singlyLinkedList0.insert((int) (byte) 10);
        int int15 = singlyLinkedList0.size();
        int int16 = singlyLinkedList0.count();
        boolean boolean17 = singlyLinkedList0.isEmpty();
        boolean boolean18 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteNth(1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        java.lang.String str7 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        singlyLinkedList0.insert(0);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean13 = singlyLinkedList0.search(1);
        boolean boolean15 = singlyLinkedList0.search((int) ' ');
        boolean boolean16 = singlyLinkedList0.detectLoop();
        boolean boolean17 = singlyLinkedList0.detectLoop();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.print();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.deleteDuplicates();
        int int4 = singlyLinkedList0.size();
        boolean boolean5 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.clear();
        java.lang.Class<?> wildcardClass7 = singlyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert(10);
        singlyLinkedList0.insert((int) ' ');
        singlyLinkedList0.print();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insertNth((int) '#', 0);
        int int6 = singlyLinkedList0.size();
        singlyLinkedList0.print();
        int int8 = singlyLinkedList0.size();
        singlyLinkedList0.insertNth((int) (byte) 100, (int) (byte) 0);
        int int12 = singlyLinkedList0.count();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (short) 0);
        singlyLinkedList0.print();
        boolean boolean14 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.print();
        boolean boolean16 = singlyLinkedList0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.checkBounds(35, (int) (byte) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) (short) 100);
        boolean boolean9 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes(100, 1);
        singlyLinkedList0.insert((int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.print();
        singlyLinkedList0.print();
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        int int11 = singlyLinkedList0.getNth(0);
        singlyLinkedList0.print();
        singlyLinkedList0.insert((int) (byte) 10);
        int int15 = singlyLinkedList0.size();
        boolean boolean16 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.delete();
        singlyLinkedList0.insertHead((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.size();
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        int int7 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((-1), (int) (short) 100);
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insertHead(0);
        java.lang.String str3 = singlyLinkedList0.toString();
        singlyLinkedList0.insertHead(100);
        int int6 = singlyLinkedList0.size();
        int int7 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes(100, (int) (byte) 10);
        java.lang.String str11 = singlyLinkedList0.toString();
        singlyLinkedList0.insertHead((int) (byte) 0);
        java.lang.String str14 = singlyLinkedList0.toString();
        java.lang.String str15 = singlyLinkedList0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100->0" + "'", str11, "100->0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0->100->0" + "'", str14, "0->100->0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0->100->0" + "'", str15, "0->100->0");
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.clear();
        singlyLinkedList0.swapNodes((int) (short) -1, (int) (byte) 1);
        singlyLinkedList0.insertHead(2);
        java.lang.String str15 = singlyLinkedList0.toString();
        boolean boolean16 = singlyLinkedList0.detectLoop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2" + "'", str15, "2");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        java.lang.String str5 = singlyLinkedList0.toString();
        int int6 = singlyLinkedList0.size();
        boolean boolean7 = singlyLinkedList0.detectLoop();
        int int8 = singlyLinkedList0.size();
        boolean boolean9 = singlyLinkedList0.detectLoop();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = singlyLinkedList0.getNth((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.print();
        java.lang.String str4 = singlyLinkedList0.toString();
        java.lang.String str5 = singlyLinkedList0.toString();
        boolean boolean6 = singlyLinkedList0.isEmpty();
        int int7 = singlyLinkedList0.size();
        singlyLinkedList0.insertHead(4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "35" + "'", str4, "35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35" + "'", str5, "35");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        int int7 = singlyLinkedList0.count();
        int int8 = singlyLinkedList0.count();
        boolean boolean9 = singlyLinkedList0.isEmpty();
        boolean boolean11 = singlyLinkedList0.search((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.insertNth((int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.insertNth((int) (short) 100, 0);
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.print();
        int int13 = singlyLinkedList0.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        java.lang.String str9 = singlyLinkedList0.toString();
        int int10 = singlyLinkedList0.size();
        int int11 = singlyLinkedList0.count();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        int int11 = singlyLinkedList0.getNth(0);
        singlyLinkedList0.print();
        singlyLinkedList0.insert((int) (byte) 10);
        int int15 = singlyLinkedList0.size();
        boolean boolean16 = singlyLinkedList0.detectLoop();
        int int18 = singlyLinkedList0.getNth(0);
        int int19 = singlyLinkedList0.size();
        singlyLinkedList0.deleteHead();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        boolean boolean5 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.swapNodes((int) (short) -1, 100);
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insertHead((int) ' ');
        java.lang.String str12 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) '4');
        java.lang.String str15 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insertHead(100);
        boolean boolean20 = singlyLinkedList0.search(0);
        singlyLinkedList0.print();
        singlyLinkedList0.deleteHead();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32" + "'", str12, "32");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32->52" + "'", str15, "32->52");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.checkBounds((int) (byte) -1, (int) (byte) -1, 100);
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) -1, 10);
        int int15 = singlyLinkedList0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.size();
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.insert(10);
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.clear();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 10);
        int int5 = singlyLinkedList0.size();
        int int6 = singlyLinkedList0.count();
        boolean boolean8 = singlyLinkedList0.search(100);
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.print();
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        int int7 = singlyLinkedList0.count();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean10 = singlyLinkedList0.detectLoop();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteHead();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.size();
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.insert(10);
        singlyLinkedList0.print();
        singlyLinkedList0.print();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.print();
        boolean boolean3 = singlyLinkedList0.search((int) (short) 0);
        int int4 = singlyLinkedList0.size();
        int int5 = singlyLinkedList0.count();
        java.lang.String str6 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 0);
        java.lang.String str9 = singlyLinkedList0.toString();
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insert((int) (short) 0);
        java.lang.String str7 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.deleteHead();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        int int9 = singlyLinkedList0.size();
        singlyLinkedList0.deleteHead();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertHead((int) (byte) -1);
        int int11 = singlyLinkedList0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = singlyLinkedList0.getNth(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.print();
        boolean boolean9 = singlyLinkedList0.search((-1));
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insert(52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 0);
        boolean boolean12 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.delete();
        java.lang.String str14 = singlyLinkedList0.toString();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.insertNth(97, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        int int7 = singlyLinkedList0.size();
        singlyLinkedList0.clear();
        java.lang.String str9 = singlyLinkedList0.toString();
        singlyLinkedList0.insertHead((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean7 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean9 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean3 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertNth((int) (byte) 1, 0);
        boolean boolean7 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.checkBounds((int) (byte) 0, 52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.print();
        java.lang.String str4 = singlyLinkedList0.toString();
        java.lang.String str5 = singlyLinkedList0.toString();
        singlyLinkedList0.clear();
        singlyLinkedList0.print();
        java.lang.Class<?> wildcardClass8 = singlyLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "35" + "'", str4, "35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35" + "'", str5, "35");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 10);
        singlyLinkedList0.swapNodes((-1), (int) (short) 100);
        boolean boolean8 = singlyLinkedList0.isEmpty();
        java.lang.String str9 = singlyLinkedList0.toString();
        singlyLinkedList0.insertHead((int) (byte) 100);
        boolean boolean12 = singlyLinkedList0.isEmpty();
        boolean boolean13 = singlyLinkedList0.detectLoop();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.swapNodes((int) (byte) 10, 0);
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str5 = singlyLinkedList0.toString();
        boolean boolean6 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.print();
        singlyLinkedList0.insertHead(10);
        singlyLinkedList0.print();
        boolean boolean11 = singlyLinkedList0.detectLoop();
        boolean boolean12 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertNth((int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean7 = singlyLinkedList0.search((int) (short) 0);
        boolean boolean8 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.checkBounds((int) (byte) 1, (-1), (int) ' ');
        singlyLinkedList0.insertHead((int) (byte) 0);
        singlyLinkedList0.insertHead((int) (byte) 10);
        boolean boolean18 = singlyLinkedList0.search((int) (short) 10);
        boolean boolean19 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertNth(0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        int int1 = singlyLinkedList0.count();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.clear();
        singlyLinkedList0.insert((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.clear();
        singlyLinkedList0.clear();
        singlyLinkedList0.checkBounds((int) (byte) 0, (int) (short) -1, 3);
        singlyLinkedList0.insertHead((int) ' ');
        boolean boolean14 = singlyLinkedList0.search((int) (byte) 0);
        boolean boolean15 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean11 = singlyLinkedList0.isEmpty();
        boolean boolean12 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 1);
        singlyLinkedList0.print();
        boolean boolean7 = singlyLinkedList0.search((-1));
        singlyLinkedList0.deleteHead();
        java.lang.String str9 = singlyLinkedList0.toString();
        singlyLinkedList0.insertHead((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.print();
        singlyLinkedList0.print();
        java.lang.String str12 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100" + "'", str12, "100");
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        java.lang.String str6 = singlyLinkedList0.toString();
        singlyLinkedList0.checkBounds((int) (short) 0, (int) (byte) -1, 3);
        boolean boolean11 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.swapNodes(0, (int) (byte) 0);
        singlyLinkedList0.swapNodes((int) '#', (int) (short) 0);
        singlyLinkedList0.clear();
        boolean boolean19 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.insertHead((int) 'a');
        boolean boolean9 = singlyLinkedList0.search(10);
        singlyLinkedList0.print();
        boolean boolean11 = singlyLinkedList0.detectLoop();
        boolean boolean12 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        int int14 = singlyLinkedList0.count();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        singlyLinkedList0.insert((int) (short) 1);
        singlyLinkedList0.delete();
        java.lang.String str11 = singlyLinkedList0.toString();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        java.lang.String str5 = singlyLinkedList0.toString();
        int int6 = singlyLinkedList0.size();
        boolean boolean7 = singlyLinkedList0.detectLoop();
        java.lang.String str8 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        int int10 = singlyLinkedList0.count();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        java.lang.String str7 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertHead((int) '#');
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.clear();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.deleteDuplicates();
        int int8 = singlyLinkedList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.print();
        boolean boolean5 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert((int) (short) 10);
        singlyLinkedList0.print();
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertHead((int) (byte) -1);
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str13 = singlyLinkedList0.toString();
        singlyLinkedList0.swapNodes((int) '#', (int) (short) 10);
        singlyLinkedList0.swapNodes((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1->10" + "'", str13, "-1->10");
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        singlyLinkedList0.insert((int) (short) 1);
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.deleteNth((int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.insertHead(32);
        singlyLinkedList0.deleteHead();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.print();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        boolean boolean6 = singlyLinkedList0.search((int) (byte) 0);
        singlyLinkedList0.swapNodes(10, 100);
        java.lang.String str10 = singlyLinkedList0.toString();
        singlyLinkedList0.insert(35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35" + "'", str10, "35");
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean7 = singlyLinkedList0.search((int) (short) 0);
        boolean boolean8 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.checkBounds((int) (byte) 1, (-1), (int) ' ');
        singlyLinkedList0.insertHead((int) (byte) 0);
        boolean boolean16 = singlyLinkedList0.search(100);
        singlyLinkedList0.delete();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean12 = singlyLinkedList0.search((-1));
        boolean boolean13 = singlyLinkedList0.isEmpty();
        boolean boolean15 = singlyLinkedList0.search((int) (short) 10);
        java.lang.Class<?> wildcardClass16 = singlyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insertHead(0);
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 0);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.size();
        singlyLinkedList0.insertNth(10, 1);
        int int10 = singlyLinkedList0.count();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.insertNth((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        int int1 = singlyLinkedList0.count();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (short) 1);
        singlyLinkedList0.insert((int) (short) 1);
        singlyLinkedList0.insertHead(100);
        int int10 = singlyLinkedList0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (short) 0);
        singlyLinkedList0.insert((int) (short) 0);
        java.lang.String str15 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteHead();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = singlyLinkedList0.getNth((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100->0" + "'", str15, "100->0");
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean7 = singlyLinkedList0.search((int) (short) 0);
        boolean boolean8 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.checkBounds((int) (byte) 1, (-1), (int) ' ');
        singlyLinkedList0.insertHead((int) (byte) 0);
        singlyLinkedList0.insertHead((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insertNth(3, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        singlyLinkedList0.clear();
        singlyLinkedList0.checkBounds((int) (short) 10, (int) (byte) 0, (int) '#');
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insertHead((int) 'a');
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.print();
        boolean boolean18 = singlyLinkedList0.detectLoop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        boolean boolean9 = singlyLinkedList0.search((int) (short) 0);
        boolean boolean10 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.swapNodes((int) (byte) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = singlyLinkedList0.getNth(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) (short) 100);
        boolean boolean9 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.swapNodes(100, (int) 'a');
        int int13 = singlyLinkedList0.count();
        singlyLinkedList0.clear();
        singlyLinkedList0.clear();
        boolean boolean17 = singlyLinkedList0.search((int) '4');
        boolean boolean19 = singlyLinkedList0.search(97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.print();
        int int8 = singlyLinkedList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.swapNodes((int) (byte) 10, 0);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean5 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertNth((int) '4', (int) (short) 0);
        singlyLinkedList0.deleteHead();
        java.lang.String str10 = singlyLinkedList0.toString();
        boolean boolean11 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.checkBounds((int) (byte) -1, (int) (byte) -1, 100);
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str11 = singlyLinkedList0.toString();
        java.lang.String str12 = singlyLinkedList0.toString();
        java.lang.String str13 = singlyLinkedList0.toString();
        int int14 = singlyLinkedList0.size();
        singlyLinkedList0.insert(52);
        singlyLinkedList0.print();
        java.lang.String str18 = singlyLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "52" + "'", str18, "52");
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (short) 0);
        java.lang.String str13 = singlyLinkedList0.toString();
        java.lang.String str14 = singlyLinkedList0.toString();
        int int15 = singlyLinkedList0.size();
        singlyLinkedList0.swapNodes((int) (byte) -1, (int) 'a');
        boolean boolean20 = singlyLinkedList0.search((int) (byte) 1);
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100" + "'", str13, "100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100" + "'", str14, "100");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 1);
        singlyLinkedList0.print();
        boolean boolean7 = singlyLinkedList0.search((-1));
        singlyLinkedList0.swapNodes((int) (byte) 100, 10);
        singlyLinkedList0.delete();
        boolean boolean13 = singlyLinkedList0.search(0);
        singlyLinkedList0.insertHead((int) (short) 10);
        singlyLinkedList0.swapNodes((int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 1);
        singlyLinkedList0.print();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insertNth(52, (int) (short) 1);
        singlyLinkedList0.insert((int) ' ');
        singlyLinkedList0.insertHead((int) (short) -1);
        singlyLinkedList0.swapNodes((int) (byte) 10, 52);
        singlyLinkedList0.insert(2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insertNth((int) '#', 0);
        singlyLinkedList0.swapNodes((int) (short) 100, (-1));
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.delete();
        singlyLinkedList0.swapNodes(0, 100);
        boolean boolean14 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertHead((int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.print();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert((int) ' ');
        singlyLinkedList0.insertHead((int) (byte) 1);
        singlyLinkedList0.swapNodes((int) (short) -1, (int) (byte) 10);
        boolean boolean11 = singlyLinkedList0.search(3);
        singlyLinkedList0.insertHead(97);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = singlyLinkedList0.getNth((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.insertHead((int) 'a');
        boolean boolean9 = singlyLinkedList0.search((int) (byte) 1);
        singlyLinkedList0.clear();
        singlyLinkedList0.insert((int) (short) 1);
        boolean boolean14 = singlyLinkedList0.search((int) ' ');
        singlyLinkedList0.insertHead((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.insertHead((int) 'a');
        boolean boolean9 = singlyLinkedList0.search(10);
        singlyLinkedList0.print();
        boolean boolean11 = singlyLinkedList0.detectLoop();
        boolean boolean12 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        int int14 = singlyLinkedList0.size();
        boolean boolean16 = singlyLinkedList0.search(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.print();
        boolean boolean3 = singlyLinkedList0.search((int) (short) 0);
        int int4 = singlyLinkedList0.size();
        int int5 = singlyLinkedList0.count();
        java.lang.String str6 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 0);
        singlyLinkedList0.delete();
        int int10 = singlyLinkedList0.size();
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) (short) 100);
        boolean boolean9 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.swapNodes(100, (int) 'a');
        singlyLinkedList0.insertHead((int) ' ');
        singlyLinkedList0.insertHead((int) (short) 100);
        singlyLinkedList0.clear();
        boolean boolean18 = singlyLinkedList0.isEmpty();
        boolean boolean20 = singlyLinkedList0.search((-1));
        int int21 = singlyLinkedList0.count();
        int int22 = singlyLinkedList0.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.print();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        boolean boolean6 = singlyLinkedList0.search((int) (byte) 0);
        singlyLinkedList0.swapNodes(10, 100);
        singlyLinkedList0.insertHead(100);
        boolean boolean13 = singlyLinkedList0.search((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.deleteHead();
        java.lang.String str11 = singlyLinkedList0.toString();
        int int12 = singlyLinkedList0.count();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insert((int) '#');
        boolean boolean17 = singlyLinkedList0.search(100);
        singlyLinkedList0.delete();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        int int5 = singlyLinkedList0.size();
        singlyLinkedList0.insertHead((int) (byte) 0);
        boolean boolean9 = singlyLinkedList0.search((int) ' ');
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.clear();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.checkBounds(52, (int) (short) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        java.lang.String str5 = singlyLinkedList0.toString();
        int int6 = singlyLinkedList0.size();
        boolean boolean7 = singlyLinkedList0.detectLoop();
        boolean boolean9 = singlyLinkedList0.search((int) '4');
        singlyLinkedList0.print();
        singlyLinkedList0.insert(2);
        singlyLinkedList0.swapNodes(0, (int) (byte) 0);
        boolean boolean17 = singlyLinkedList0.search(3);
        boolean boolean19 = singlyLinkedList0.search((int) (short) 10);
        singlyLinkedList0.clear();
        singlyLinkedList0.clear();
        int int22 = singlyLinkedList0.count();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.print();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert((int) ' ');
        singlyLinkedList0.insertHead((int) (byte) 1);
        java.lang.String str7 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1->32" + "'", str7, "1->32");
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.checkBounds((int) (byte) -1, (int) (byte) -1, 100);
        singlyLinkedList0.clear();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean13 = singlyLinkedList0.search(0);
        boolean boolean14 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertHead((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.insertNth((int) (byte) 0, 0);
        java.lang.String str9 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteDuplicates();
        int int11 = singlyLinkedList0.count();
        singlyLinkedList0.checkBounds((int) '#', (int) (byte) 1, 100);
        int int16 = singlyLinkedList0.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.print();
        boolean boolean5 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert((int) (short) 10);
        singlyLinkedList0.print();
        boolean boolean9 = singlyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass10 = singlyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) (short) 100);
        singlyLinkedList0.clear();
        singlyLinkedList0.checkBounds((int) (byte) 1, (int) (byte) 0, 100);
        singlyLinkedList0.insertHead(0);
        singlyLinkedList0.insertHead((int) (short) -1);
        singlyLinkedList0.delete();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes(100, (int) (short) 1);
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        boolean boolean10 = singlyLinkedList0.search(32);
        singlyLinkedList0.insert((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) (short) 100);
        singlyLinkedList0.insertHead(2);
        singlyLinkedList0.clear();
        singlyLinkedList0.insertHead(0);
        singlyLinkedList0.deleteHead();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        java.lang.String str5 = singlyLinkedList0.toString();
        int int6 = singlyLinkedList0.size();
        boolean boolean7 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert((int) '#');
        boolean boolean11 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.print();
        singlyLinkedList0.insert((int) ' ');
        boolean boolean15 = singlyLinkedList0.detectLoop();
        int int16 = singlyLinkedList0.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 1);
        singlyLinkedList0.print();
        boolean boolean7 = singlyLinkedList0.search((-1));
        singlyLinkedList0.insert((int) ' ');
        int int10 = singlyLinkedList0.count();
        int int11 = singlyLinkedList0.size();
        java.lang.String str12 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteHead();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1->32" + "'", str12, "1->32");
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.size();
        java.lang.String str5 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.print();
        java.lang.Class<?> wildcardClass8 = singlyLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str3 = singlyLinkedList0.toString();
        singlyLinkedList0.clear();
        int int5 = singlyLinkedList0.count();
        boolean boolean7 = singlyLinkedList0.search((int) (short) 10);
        int int8 = singlyLinkedList0.count();
        int int9 = singlyLinkedList0.size();
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (byte) 1, 0);
        int int14 = singlyLinkedList0.count();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        java.lang.String str7 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        singlyLinkedList0.insert(0);
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.deleteDuplicates();
        int int13 = singlyLinkedList0.size();
        boolean boolean15 = singlyLinkedList0.search((int) (byte) 1);
        java.lang.String str16 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.insert((int) (short) 1);
        int int20 = singlyLinkedList0.count();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search(100);
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        singlyLinkedList0.insert(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.swapNodes((int) (short) -1, (int) (byte) -1);
        singlyLinkedList0.insertHead((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        int int1 = singlyLinkedList0.count();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search(2);
        singlyLinkedList0.clear();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteHead();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 1);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.size();
        singlyLinkedList0.insertHead(52);
        singlyLinkedList0.insertHead(100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = singlyLinkedList0.getNth((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        java.lang.String str5 = singlyLinkedList0.toString();
        int int6 = singlyLinkedList0.size();
        boolean boolean7 = singlyLinkedList0.detectLoop();
        boolean boolean9 = singlyLinkedList0.search((int) '4');
        singlyLinkedList0.print();
        boolean boolean11 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.deleteDuplicates();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.checkBounds((int) (short) 1, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.swapNodes((int) (byte) 10, 0);
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str5 = singlyLinkedList0.toString();
        boolean boolean6 = singlyLinkedList0.isEmpty();
        boolean boolean7 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.swapNodes((int) '#', (int) (byte) 100);
        int int11 = singlyLinkedList0.size();
        int int12 = singlyLinkedList0.count();
        java.lang.String str13 = singlyLinkedList0.toString();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.delete();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        singlyLinkedList0.clear();
        boolean boolean6 = singlyLinkedList0.search((int) ' ');
        boolean boolean7 = singlyLinkedList0.isEmpty();
        int int8 = singlyLinkedList0.count();
        boolean boolean9 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.swapNodes(32, 10);
        boolean boolean13 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        int int1 = singlyLinkedList0.count();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 0);
        singlyLinkedList0.insert(2);
        int int7 = singlyLinkedList0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        int int5 = singlyLinkedList0.size();
        singlyLinkedList0.insertHead((int) (byte) 0);
        boolean boolean9 = singlyLinkedList0.search((int) ' ');
        singlyLinkedList0.insert((int) (byte) 100);
        boolean boolean12 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.checkBounds(97, 32, 100);
        singlyLinkedList0.insertHead(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        boolean boolean5 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.print();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteHead();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) (short) 100);
        singlyLinkedList0.swapNodes((int) (byte) 1, 32);
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.delete();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.insertHead(1);
        singlyLinkedList0.deleteHead();
        java.lang.String str16 = singlyLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        int int5 = singlyLinkedList0.count();
        int int6 = singlyLinkedList0.size();
        singlyLinkedList0.checkBounds((int) '#', (int) (short) 10, (int) 'a');
        singlyLinkedList0.swapNodes((int) ' ', (-1));
        boolean boolean15 = singlyLinkedList0.search((-1));
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        boolean boolean7 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insert((int) (short) 10);
        singlyLinkedList0.insert((int) 'a');
        boolean boolean14 = singlyLinkedList0.search((int) (byte) 1);
        boolean boolean15 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertNth((int) '4', 2);
        singlyLinkedList0.delete();
        singlyLinkedList0.insert(10);
        singlyLinkedList0.insert(52);
        java.lang.String str24 = singlyLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10->97->10->52" + "'", str24, "10->97->10->52");
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.insertHead((int) 'a');
        boolean boolean9 = singlyLinkedList0.search(10);
        singlyLinkedList0.print();
        boolean boolean11 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        singlyLinkedList0.swapNodes((int) (short) 10, (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.insert((int) ' ');
        java.lang.String str19 = singlyLinkedList0.toString();
        singlyLinkedList0.insert(4);
        int int22 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead(10);
        int int25 = singlyLinkedList0.count();
        singlyLinkedList0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32" + "'", str19, "32");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) (short) 100);
        boolean boolean9 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.swapNodes(100, (int) 'a');
        singlyLinkedList0.insertHead((int) ' ');
        singlyLinkedList0.insertHead((int) (short) 100);
        singlyLinkedList0.clear();
        boolean boolean18 = singlyLinkedList0.isEmpty();
        boolean boolean20 = singlyLinkedList0.search((-1));
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.insertNth((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        int int11 = singlyLinkedList0.getNth(0);
        singlyLinkedList0.print();
        singlyLinkedList0.insert((int) (byte) 10);
        int int15 = singlyLinkedList0.size();
        boolean boolean16 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.delete();
        singlyLinkedList0.delete();
        singlyLinkedList0.print();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.checkBounds(52, 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) (short) 100);
        boolean boolean9 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.swapNodes(100, (int) 'a');
        int int13 = singlyLinkedList0.count();
        singlyLinkedList0.clear();
        boolean boolean15 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert(100);
        singlyLinkedList0.delete();
        boolean boolean19 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert(3);
        java.lang.String str22 = singlyLinkedList0.toString();
        boolean boolean24 = singlyLinkedList0.search((int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "3" + "'", str22, "3");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insert(0);
        singlyLinkedList0.deleteHead();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.delete();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) (short) 100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.checkBounds((int) (byte) 1, (int) (byte) -1, (int) (byte) 100);
        singlyLinkedList0.swapNodes((int) ' ', 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.insertNth((int) (byte) 0, 0);
        java.lang.String str9 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.clear();
        boolean boolean13 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insert((int) (short) 1);
        singlyLinkedList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.insertHead((int) 'a');
        boolean boolean9 = singlyLinkedList0.search((int) (byte) 1);
        singlyLinkedList0.clear();
        singlyLinkedList0.insert((int) (short) 1);
        singlyLinkedList0.swapNodes(52, (int) (short) -1);
        java.lang.String str16 = singlyLinkedList0.toString();
        boolean boolean18 = singlyLinkedList0.search((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead((int) (byte) -1);
        singlyLinkedList0.deleteHead();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteHead();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.swapNodes((-1), 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.deleteHead();
        java.lang.String str11 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean13 = singlyLinkedList0.detectLoop();
        java.lang.String str14 = singlyLinkedList0.toString();
        int int15 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes(3, 100);
        singlyLinkedList0.insertNth(100, 0);
        boolean boolean22 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str3 = singlyLinkedList0.toString();
        singlyLinkedList0.clear();
        int int5 = singlyLinkedList0.count();
        boolean boolean7 = singlyLinkedList0.search((int) (short) 10);
        int int8 = singlyLinkedList0.size();
        singlyLinkedList0.insert((int) '#');
        int int11 = singlyLinkedList0.count();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 1);
        singlyLinkedList0.print();
        boolean boolean7 = singlyLinkedList0.search((-1));
        java.lang.String str8 = singlyLinkedList0.toString();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.checkBounds((int) (byte) -1, (int) (byte) -1, 100);
        singlyLinkedList0.clear();
        singlyLinkedList0.deleteDuplicates();
        int int12 = singlyLinkedList0.size();
        singlyLinkedList0.clear();
        boolean boolean15 = singlyLinkedList0.search((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertHead((int) (byte) -1);
        singlyLinkedList0.swapNodes((int) (short) 10, (int) (short) -1);
        singlyLinkedList0.swapNodes((int) (byte) 100, 3);
        int int17 = singlyLinkedList0.size();
        int int18 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        int int2 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        boolean boolean4 = singlyLinkedList0.isEmpty();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.clear();
        singlyLinkedList0.clear();
        singlyLinkedList0.insert((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = singlyLinkedList0.getNth((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) (short) 100);
        boolean boolean9 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.print();
        java.lang.String str11 = singlyLinkedList0.toString();
        boolean boolean13 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.checkBounds(3, 0, 4);
        singlyLinkedList0.swapNodes((int) (byte) 100, 2);
        singlyLinkedList0.insertHead((int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.deleteDuplicates();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.insertNth((int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        int int3 = singlyLinkedList0.count();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertHead((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 1);
        singlyLinkedList0.print();
        singlyLinkedList0.deleteDuplicates();
        int int7 = singlyLinkedList0.size();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        boolean boolean10 = singlyLinkedList0.search((int) '4');
        java.lang.Class<?> wildcardClass11 = singlyLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean3 = singlyLinkedList0.isEmpty();
        java.lang.String str4 = singlyLinkedList0.toString();
        boolean boolean6 = singlyLinkedList0.search((int) '4');
        singlyLinkedList0.insert((int) 'a');
        int int10 = singlyLinkedList0.getNth((int) (short) 0);
        singlyLinkedList0.delete();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        java.lang.String str7 = singlyLinkedList0.toString();
        singlyLinkedList0.insertHead((int) (byte) 10);
        singlyLinkedList0.print();
        singlyLinkedList0.print();
        int int12 = singlyLinkedList0.size();
        java.lang.String str13 = singlyLinkedList0.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.clear();
        singlyLinkedList0.insert((int) (byte) 10);
        boolean boolean10 = singlyLinkedList0.isEmpty();
        int int11 = singlyLinkedList0.count();
        boolean boolean13 = singlyLinkedList0.search((int) 'a');
        boolean boolean14 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insert((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.checkBounds((int) (byte) 100, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.clear();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean12 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (byte) 10);
        int int16 = singlyLinkedList0.count();
        boolean boolean17 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertHead(100);
        singlyLinkedList0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((int) '4', (int) (short) -1);
        singlyLinkedList0.print();
        singlyLinkedList0.delete();
        int int15 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        boolean boolean7 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insert((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = singlyLinkedList0.getNth((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.swapNodes((-1), (-1));
        int int6 = singlyLinkedList0.size();
        boolean boolean8 = singlyLinkedList0.search(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 0);
        singlyLinkedList0.print();
        int int13 = singlyLinkedList0.count();
        java.lang.String str14 = singlyLinkedList0.toString();
        boolean boolean15 = singlyLinkedList0.isEmpty();
        int int16 = singlyLinkedList0.size();
        singlyLinkedList0.insert(0);
        singlyLinkedList0.delete();
        singlyLinkedList0.deleteHead();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean7 = singlyLinkedList0.isEmpty();
        boolean boolean9 = singlyLinkedList0.search((int) (short) 1);
        int int10 = singlyLinkedList0.size();
        boolean boolean11 = singlyLinkedList0.detectLoop();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        singlyLinkedList0.insert((int) (short) -1);
        boolean boolean11 = singlyLinkedList0.isEmpty();
        boolean boolean13 = singlyLinkedList0.search((int) (byte) 0);
        boolean boolean14 = singlyLinkedList0.isEmpty();
        int int15 = singlyLinkedList0.count();
        boolean boolean17 = singlyLinkedList0.search((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        singlyLinkedList0.deleteHead();
        boolean boolean11 = singlyLinkedList0.search((int) (short) 0);
        singlyLinkedList0.print();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteHead();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 0);
        boolean boolean13 = singlyLinkedList0.search(10);
        singlyLinkedList0.checkBounds(32, (int) (byte) 10, 32);
        singlyLinkedList0.swapNodes((int) (short) 10, (int) (byte) -1);
        singlyLinkedList0.print();
        java.lang.String str22 = singlyLinkedList0.toString();
        int int23 = singlyLinkedList0.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1" + "'", str22, "-1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertNth((int) (short) 100, 0);
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        singlyLinkedList0.deleteHead();
        boolean boolean18 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteHead();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.insertNth((int) (short) 100, 0);
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.print();
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.insertHead((int) 'a');
        singlyLinkedList0.swapNodes((int) 'a', (int) (short) 10);
        singlyLinkedList0.print();
        singlyLinkedList0.delete();
        boolean boolean13 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        boolean boolean5 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertHead((int) (short) 0);
        boolean boolean9 = singlyLinkedList0.search(2);
        singlyLinkedList0.deleteHead();
        boolean boolean11 = singlyLinkedList0.detectLoop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean7 = singlyLinkedList0.search((int) (short) 0);
        boolean boolean8 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.checkBounds((int) (byte) 1, (-1), (int) ' ');
        singlyLinkedList0.insertHead((int) (byte) 0);
        boolean boolean16 = singlyLinkedList0.search(100);
        boolean boolean18 = singlyLinkedList0.search((int) '4');
        int int20 = singlyLinkedList0.getNth((int) (short) 0);
        singlyLinkedList0.delete();
        int int22 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((int) (short) 0, (-1));
        boolean boolean26 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        int int7 = singlyLinkedList0.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.swapNodes((int) (byte) 10, 0);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean5 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertNth((int) '4', (int) (short) 0);
        boolean boolean9 = singlyLinkedList0.isEmpty();
        boolean boolean11 = singlyLinkedList0.search(3);
        singlyLinkedList0.insertNth(0, (int) (short) 1);
        boolean boolean15 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert((int) 'a');
        boolean boolean18 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        boolean boolean8 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.clear();
        singlyLinkedList0.clear();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.swapNodes(52, 3);
        int int15 = singlyLinkedList0.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.insertNth((int) (byte) 0, 0);
        singlyLinkedList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.insertHead((int) 'a');
        singlyLinkedList0.insertHead(3);
        singlyLinkedList0.swapNodes(0, 1);
        int int13 = singlyLinkedList0.count();
        singlyLinkedList0.clear();
        singlyLinkedList0.insertHead(1);
        boolean boolean17 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        java.lang.String str19 = singlyLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        singlyLinkedList0.insert((int) (short) 1);
        singlyLinkedList0.checkBounds((int) '#', (int) (short) -1, (int) '4');
        singlyLinkedList0.insertHead((int) (byte) 1);
        boolean boolean17 = singlyLinkedList0.search((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.insertNth((int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean7 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertHead((int) '#');
        singlyLinkedList0.print();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.size();
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.insert(10);
        int int8 = singlyLinkedList0.size();
        boolean boolean9 = singlyLinkedList0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.insertNth(32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead((-1));
        singlyLinkedList0.insertHead(10);
        boolean boolean14 = singlyLinkedList0.detectLoop();
        boolean boolean16 = singlyLinkedList0.search((int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.insertNth((int) (short) 100, 0);
        singlyLinkedList0.swapNodes(0, 4);
        java.lang.Class<?> wildcardClass13 = singlyLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        java.lang.String str9 = singlyLinkedList0.toString();
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead(1);
        singlyLinkedList0.checkBounds(10, (int) (short) 1, (int) (short) 10);
        singlyLinkedList0.insert((int) (short) -1);
        singlyLinkedList0.delete();
        singlyLinkedList0.swapNodes((int) (byte) 100, (int) (short) -1);
        singlyLinkedList0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        int int7 = singlyLinkedList0.size();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        int int9 = singlyLinkedList0.size();
        boolean boolean10 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertHead((int) (short) -1);
        int int13 = singlyLinkedList0.count();
        singlyLinkedList0.deleteHead();
        int int15 = singlyLinkedList0.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        int int11 = singlyLinkedList0.getNth(0);
        singlyLinkedList0.print();
        boolean boolean13 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.clear();
        singlyLinkedList0.insert((int) (short) 0);
        java.lang.String str17 = singlyLinkedList0.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 10);
        int int5 = singlyLinkedList0.size();
        java.lang.String str6 = singlyLinkedList0.toString();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) '4');
        boolean boolean11 = singlyLinkedList0.search(100);
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.print();
        boolean boolean15 = singlyLinkedList0.detectLoop();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead((-1));
        singlyLinkedList0.insert((-1));
        boolean boolean14 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds(10, (int) (byte) 10, (int) (short) 10);
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.insert((int) (short) 100);
        singlyLinkedList0.delete();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertHead((int) (byte) -1);
        boolean boolean11 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 0);
        boolean boolean13 = singlyLinkedList0.search(10);
        boolean boolean14 = singlyLinkedList0.isEmpty();
        boolean boolean15 = singlyLinkedList0.isEmpty();
        boolean boolean16 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        java.lang.String str5 = singlyLinkedList0.toString();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean7 = singlyLinkedList0.detectLoop();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.clear();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean12 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (byte) 10);
        java.lang.String str16 = singlyLinkedList0.toString();
        boolean boolean17 = singlyLinkedList0.isEmpty();
        int int18 = singlyLinkedList0.count();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insert((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean3 = singlyLinkedList0.isEmpty();
        java.lang.String str4 = singlyLinkedList0.toString();
        int int5 = singlyLinkedList0.count();
        int int6 = singlyLinkedList0.size();
        boolean boolean7 = singlyLinkedList0.detectLoop();
        int int8 = singlyLinkedList0.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        int int7 = singlyLinkedList0.size();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        int int9 = singlyLinkedList0.size();
        boolean boolean10 = singlyLinkedList0.detectLoop();
        int int11 = singlyLinkedList0.size();
        boolean boolean13 = singlyLinkedList0.search((int) (short) 10);
        int int14 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        java.lang.String str9 = singlyLinkedList0.toString();
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead(1);
        singlyLinkedList0.swapNodes(3, (int) (short) 0);
        singlyLinkedList0.swapNodes(0, (int) (byte) 100);
        singlyLinkedList0.insertNth(4, (int) (short) 0);
        int int22 = singlyLinkedList0.count();
        int int23 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = singlyLinkedList0.getNth((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.insertHead((int) 'a');
        boolean boolean9 = singlyLinkedList0.search(10);
        boolean boolean10 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.print();
        singlyLinkedList0.insertHead(100);
        singlyLinkedList0.insertHead((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.print();
        int int4 = singlyLinkedList0.size();
        java.lang.String str5 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.print();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = singlyLinkedList0.getNth((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35" + "'", str5, "35");
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.print();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        boolean boolean6 = singlyLinkedList0.search((int) '#');
        java.lang.String str7 = singlyLinkedList0.toString();
        singlyLinkedList0.delete();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35" + "'", str7, "35");
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        java.lang.String str9 = singlyLinkedList0.toString();
        singlyLinkedList0.swapNodes(1, (int) (short) 0);
        singlyLinkedList0.insertNth(10, (int) (byte) 1);
        singlyLinkedList0.insert(1);
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.deleteDuplicates();
        int int20 = singlyLinkedList0.count();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.print();
        boolean boolean6 = singlyLinkedList0.search((int) (short) 100);
        singlyLinkedList0.insert(1);
        singlyLinkedList0.swapNodes(52, 0);
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.deleteNth((int) (short) 0);
        singlyLinkedList0.clear();
        singlyLinkedList0.print();
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes(100, (int) (short) 1);
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean10 = singlyLinkedList0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.delete();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        int int3 = singlyLinkedList0.size();
        boolean boolean5 = singlyLinkedList0.search(0);
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) '4');
        int int9 = singlyLinkedList0.size();
        java.lang.String str10 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        java.lang.String str7 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        singlyLinkedList0.insert(0);
        singlyLinkedList0.clear();
        int int12 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead((-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insertNth((int) '#', 0);
        singlyLinkedList0.swapNodes((int) (short) 100, (-1));
        boolean boolean9 = singlyLinkedList0.isEmpty();
        int int10 = singlyLinkedList0.size();
        singlyLinkedList0.insert(32);
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.insertHead((int) 'a');
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.delete();
        singlyLinkedList0.swapNodes((int) ' ', 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.clear();
        singlyLinkedList0.swapNodes((int) (short) -1, (int) (byte) 1);
        singlyLinkedList0.insertHead(2);
        singlyLinkedList0.deleteHead();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.checkBounds(52, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.print();
        int int4 = singlyLinkedList0.size();
        singlyLinkedList0.insertHead(32);
        singlyLinkedList0.checkBounds((-1), (int) (short) -1, (int) '#');
        singlyLinkedList0.insertHead((int) (byte) -1);
        boolean boolean14 = singlyLinkedList0.search(3);
        java.lang.Class<?> wildcardClass15 = singlyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        java.lang.String str5 = singlyLinkedList0.toString();
        int int6 = singlyLinkedList0.size();
        boolean boolean7 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert((int) '#');
        boolean boolean11 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.print();
        singlyLinkedList0.insert((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.checkBounds((int) (short) -1, (int) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 1);
        singlyLinkedList0.print();
        boolean boolean7 = singlyLinkedList0.search((-1));
        singlyLinkedList0.insert((int) ' ');
        singlyLinkedList0.deleteDuplicates();
        int int11 = singlyLinkedList0.count();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.swapNodes((int) (byte) 10, 0);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean5 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertNth((int) '4', (int) (short) 0);
        singlyLinkedList0.clear();
        singlyLinkedList0.insertNth((int) '4', 0);
        int int13 = singlyLinkedList0.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        int int1 = singlyLinkedList0.count();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 0);
        singlyLinkedList0.insert(2);
        singlyLinkedList0.print();
        singlyLinkedList0.print();
        int int9 = singlyLinkedList0.size();
        singlyLinkedList0.print();
        singlyLinkedList0.insert((int) (byte) 10);
        java.lang.String str13 = singlyLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0->2->10" + "'", str13, "0->2->10");
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean2 = singlyLinkedList0.detectLoop();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insert((int) 'a');
        singlyLinkedList0.delete();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        int int5 = singlyLinkedList0.size();
        singlyLinkedList0.insertHead((int) (byte) 0);
        boolean boolean9 = singlyLinkedList0.search((int) ' ');
        int int10 = singlyLinkedList0.count();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) (short) 100);
        boolean boolean9 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.swapNodes(100, (int) 'a');
        int int13 = singlyLinkedList0.count();
        singlyLinkedList0.clear();
        boolean boolean15 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert(100);
        singlyLinkedList0.delete();
        boolean boolean19 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert(3);
        int int22 = singlyLinkedList0.size();
        singlyLinkedList0.insertHead((int) '4');
        singlyLinkedList0.delete();
        singlyLinkedList0.deleteHead();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.insertHead((int) 'a');
        boolean boolean9 = singlyLinkedList0.search(10);
        singlyLinkedList0.print();
        boolean boolean11 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        singlyLinkedList0.swapNodes(10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (short) 0);
        java.lang.String str13 = singlyLinkedList0.toString();
        singlyLinkedList0.insertNth(1, (int) (short) 1);
        singlyLinkedList0.insert((int) (byte) 0);
        java.lang.String str19 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteDuplicates();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100" + "'", str13, "100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100->1->0" + "'", str19, "100->1->0");
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (short) 0);
        java.lang.String str13 = singlyLinkedList0.toString();
        java.lang.String str14 = singlyLinkedList0.toString();
        singlyLinkedList0.delete();
        int int16 = singlyLinkedList0.size();
        singlyLinkedList0.clear();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100" + "'", str13, "100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100" + "'", str14, "100");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.print();
        boolean boolean3 = singlyLinkedList0.search((int) (short) 0);
        singlyLinkedList0.insert((int) (byte) 10);
        java.lang.String str6 = singlyLinkedList0.toString();
        singlyLinkedList0.delete();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 0);
        boolean boolean13 = singlyLinkedList0.search(10);
        singlyLinkedList0.insert(0);
        singlyLinkedList0.insert((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.clear();
        singlyLinkedList0.insert((int) (byte) 10);
        singlyLinkedList0.delete();
        java.lang.Class<?> wildcardClass11 = singlyLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 10);
        int int5 = singlyLinkedList0.size();
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.checkBounds((-1), (-1), (int) (byte) -1);
        boolean boolean12 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insert(0);
        boolean boolean15 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.swapNodes(100, (int) 'a');
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.swapNodes((int) ' ', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.checkBounds((-1), 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.swapNodes((int) (byte) 10, 0);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean5 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertNth((int) '4', (int) (short) 0);
        boolean boolean9 = singlyLinkedList0.isEmpty();
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.insert((int) ' ');
        boolean boolean14 = singlyLinkedList0.search(3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean5 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        java.lang.String str9 = singlyLinkedList0.toString();
        singlyLinkedList0.insertHead(1);
        boolean boolean12 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.delete();
        java.lang.String str14 = singlyLinkedList0.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean9 = singlyLinkedList0.search((int) (short) 10);
        singlyLinkedList0.swapNodes(0, 100);
        singlyLinkedList0.swapNodes(100, (int) (byte) 1);
        int int16 = singlyLinkedList0.size();
        singlyLinkedList0.insert((int) (short) 0);
        singlyLinkedList0.print();
        boolean boolean20 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insert(0);
        singlyLinkedList0.insertHead((int) 'a');
        boolean boolean25 = singlyLinkedList0.isEmpty();
        boolean boolean26 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteNth(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert((int) '#');
        boolean boolean3 = singlyLinkedList0.detectLoop();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        java.lang.String str5 = singlyLinkedList0.toString();
        int int6 = singlyLinkedList0.size();
        java.lang.Class<?> wildcardClass7 = singlyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35" + "'", str5, "35");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        int int3 = singlyLinkedList0.size();
        boolean boolean5 = singlyLinkedList0.search(0);
        int int6 = singlyLinkedList0.count();
        int int7 = singlyLinkedList0.count();
        java.lang.Class<?> wildcardClass8 = singlyLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        int int9 = singlyLinkedList0.size();
        int int10 = singlyLinkedList0.count();
        int int11 = singlyLinkedList0.size();
        boolean boolean13 = singlyLinkedList0.search(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead((int) (byte) -1);
        singlyLinkedList0.print();
        java.lang.String str13 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (short) 100);
        singlyLinkedList0.swapNodes(100, 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search(100);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (short) 0);
        java.lang.String str10 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        boolean boolean12 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertHead(32);
        boolean boolean15 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertNth(1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 0);
        boolean boolean13 = singlyLinkedList0.search(10);
        int int14 = singlyLinkedList0.count();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.insertNth(35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.deleteDuplicates();
        int int7 = singlyLinkedList0.size();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.print();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertNth((int) (short) 100, 0);
        singlyLinkedList0.print();
        boolean boolean14 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.deleteHead();
        boolean boolean17 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.delete();
        singlyLinkedList0.swapNodes(97, 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        int int11 = singlyLinkedList0.getNth(0);
        singlyLinkedList0.print();
        boolean boolean13 = singlyLinkedList0.detectLoop();
        int int14 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead((int) (byte) 100);
        boolean boolean18 = singlyLinkedList0.search(0);
        int int19 = singlyLinkedList0.count();
        boolean boolean21 = singlyLinkedList0.search(0);
        singlyLinkedList0.swapNodes((int) (byte) 1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        int int9 = singlyLinkedList0.size();
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.delete();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteHead();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((int) '4', (-1));
        singlyLinkedList0.insertHead((int) (byte) 0);
        boolean boolean13 = singlyLinkedList0.search((int) '#');
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.insert((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        boolean boolean5 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean8 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.insert(3);
        boolean boolean12 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.insertHead((int) (byte) -1);
        singlyLinkedList0.print();
        singlyLinkedList0.deleteDuplicates();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean3 = singlyLinkedList0.isEmpty();
        java.lang.String str4 = singlyLinkedList0.toString();
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        boolean boolean7 = singlyLinkedList0.detectLoop();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.delete();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean7 = singlyLinkedList0.search((int) (short) 0);
        int int8 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead(32);
        java.lang.String str11 = singlyLinkedList0.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean9 = singlyLinkedList0.search((int) (short) 10);
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.checkBounds((int) (byte) 0, 0, 0);
        singlyLinkedList0.insert((int) ' ');
        int int19 = singlyLinkedList0.getNth((int) (short) 0);
        singlyLinkedList0.clear();
        singlyLinkedList0.insert((int) (short) 1);
        boolean boolean23 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.print();
        boolean boolean8 = singlyLinkedList0.search((int) (short) -1);
        java.lang.String str9 = singlyLinkedList0.toString();
        int int10 = singlyLinkedList0.count();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        java.lang.String str5 = singlyLinkedList0.toString();
        int int6 = singlyLinkedList0.size();
        boolean boolean7 = singlyLinkedList0.detectLoop();
        int int8 = singlyLinkedList0.size();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str10 = singlyLinkedList0.toString();
        singlyLinkedList0.insertNth((int) (byte) 10, 0);
        singlyLinkedList0.deleteDuplicates();
        int int15 = singlyLinkedList0.size();
        java.lang.String str16 = singlyLinkedList0.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean9 = singlyLinkedList0.search((int) (short) 10);
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.checkBounds((int) (byte) 0, 0, 0);
        singlyLinkedList0.insert(1);
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.swapNodes(10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        int int7 = singlyLinkedList0.size();
        singlyLinkedList0.clear();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.print();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean7 = singlyLinkedList0.search((int) (short) 0);
        singlyLinkedList0.insertHead(10);
        singlyLinkedList0.insert((int) (short) 100);
        java.lang.String str12 = singlyLinkedList0.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10->100" + "'", str12, "10->100");
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.insertHead((int) 'a');
        boolean boolean9 = singlyLinkedList0.search(10);
        singlyLinkedList0.print();
        boolean boolean11 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        boolean boolean13 = singlyLinkedList0.isEmpty();
        boolean boolean14 = singlyLinkedList0.isEmpty();
        boolean boolean15 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertNth((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertNth((int) (short) 100, 0);
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) 100, (int) '#');
        int int18 = singlyLinkedList0.getNth((int) (byte) 1);
        singlyLinkedList0.deleteNth((int) (short) 1);
        singlyLinkedList0.clear();
        int int22 = singlyLinkedList0.size();
        singlyLinkedList0.insert(10);
        java.lang.Class<?> wildcardClass25 = singlyLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        int int6 = singlyLinkedList0.count();
        boolean boolean7 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert((int) (byte) 10);
        singlyLinkedList0.clear();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        int int5 = singlyLinkedList0.size();
        boolean boolean7 = singlyLinkedList0.search((int) '#');
        boolean boolean8 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertHead((int) (byte) 100);
        singlyLinkedList0.checkBounds(3, 0, (int) '4');
        boolean boolean15 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.print();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        java.lang.String str9 = singlyLinkedList0.toString();
        java.lang.String str10 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        singlyLinkedList0.swapNodes((int) (short) -1, (int) (byte) 100);
        int int7 = singlyLinkedList0.count();
        boolean boolean9 = singlyLinkedList0.search((int) '#');
        singlyLinkedList0.clear();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.size();
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.insert(10);
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.checkBounds(2, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insertHead(0);
        singlyLinkedList0.print();
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean9 = singlyLinkedList0.search((int) (short) 10);
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        java.lang.String str12 = singlyLinkedList0.toString();
        boolean boolean13 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert(0);
        boolean boolean16 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.size();
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.insert(10);
        int int8 = singlyLinkedList0.size();
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 1, 0, 4);
        boolean boolean15 = singlyLinkedList0.search((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        java.lang.String str5 = singlyLinkedList0.toString();
        int int6 = singlyLinkedList0.size();
        boolean boolean7 = singlyLinkedList0.detectLoop();
        java.lang.String str8 = singlyLinkedList0.toString();
        boolean boolean9 = singlyLinkedList0.isEmpty();
        java.lang.String str10 = singlyLinkedList0.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (short) 0);
        java.lang.String str13 = singlyLinkedList0.toString();
        java.lang.String str14 = singlyLinkedList0.toString();
        int int15 = singlyLinkedList0.size();
        int int16 = singlyLinkedList0.size();
        singlyLinkedList0.insertHead(100);
        boolean boolean20 = singlyLinkedList0.search((-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100" + "'", str13, "100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100" + "'", str14, "100");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insert((int) (short) 1);
        singlyLinkedList0.insert((int) (short) 0);
        int int14 = singlyLinkedList0.getNth(0);
        boolean boolean16 = singlyLinkedList0.search((int) (byte) 100);
        boolean boolean18 = singlyLinkedList0.search((int) ' ');
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insertNth((int) '#', 0);
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.clear();
        singlyLinkedList0.swapNodes(0, (int) (short) 0);
        singlyLinkedList0.clear();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.delete();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        boolean boolean8 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.clear();
        int int10 = singlyLinkedList0.size();
        boolean boolean12 = singlyLinkedList0.search(2);
        singlyLinkedList0.insertHead(35);
        singlyLinkedList0.deleteHead();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        int int2 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        boolean boolean4 = singlyLinkedList0.isEmpty();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        boolean boolean7 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.print();
        int int9 = singlyLinkedList0.size();
        boolean boolean10 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean7 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert((int) '4');
        singlyLinkedList0.insert((int) (byte) 0);
        boolean boolean12 = singlyLinkedList0.detectLoop();
        java.lang.String str13 = singlyLinkedList0.toString();
        boolean boolean15 = singlyLinkedList0.search(0);
        singlyLinkedList0.print();
        singlyLinkedList0.deleteNth((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "52->0" + "'", str13, "52->0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.checkBounds((int) (byte) -1, (int) (byte) -1, (int) ' ');
        boolean boolean11 = singlyLinkedList0.isEmpty();
        boolean boolean12 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insert((int) (short) 0);
        boolean boolean7 = singlyLinkedList0.detectLoop();
        java.lang.String str8 = singlyLinkedList0.toString();
        int int9 = singlyLinkedList0.size();
        java.lang.Class<?> wildcardClass10 = singlyLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 1);
        singlyLinkedList0.print();
        boolean boolean7 = singlyLinkedList0.search((-1));
        singlyLinkedList0.swapNodes((int) (byte) 100, 10);
        boolean boolean11 = singlyLinkedList0.detectLoop();
        java.lang.String str12 = singlyLinkedList0.toString();
        singlyLinkedList0.insertHead((int) '#');
        boolean boolean15 = singlyLinkedList0.detectLoop();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 10);
        int int5 = singlyLinkedList0.size();
        int int6 = singlyLinkedList0.count();
        boolean boolean8 = singlyLinkedList0.search(100);
        java.lang.String str9 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        int int11 = singlyLinkedList0.size();
        boolean boolean12 = singlyLinkedList0.detectLoop();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) (short) 100);
        singlyLinkedList0.clear();
        boolean boolean10 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.swapNodes((-1), (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead((-1));
        singlyLinkedList0.insert((-1));
        boolean boolean14 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds(10, (int) (byte) 10, (int) (short) 10);
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.insert((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 10);
        int int5 = singlyLinkedList0.size();
        int int6 = singlyLinkedList0.count();
        boolean boolean8 = singlyLinkedList0.search(100);
        singlyLinkedList0.swapNodes((int) (short) 0, (int) '#');
        boolean boolean13 = singlyLinkedList0.search((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.checkBounds((int) (byte) -1, (int) (byte) -1, 100);
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str11 = singlyLinkedList0.toString();
        singlyLinkedList0.insert(0);
        int int14 = singlyLinkedList0.size();
        java.lang.Class<?> wildcardClass15 = singlyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.checkBounds((int) (byte) -1, (int) (byte) -1, 100);
        singlyLinkedList0.clear();
        singlyLinkedList0.deleteDuplicates();
        int int12 = singlyLinkedList0.size();
        boolean boolean14 = singlyLinkedList0.search((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int16 = singlyLinkedList0.getNth(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean9 = singlyLinkedList0.search((int) (short) 10);
        singlyLinkedList0.swapNodes(0, 100);
        singlyLinkedList0.swapNodes(100, (int) (byte) 1);
        singlyLinkedList0.swapNodes((-1), 2);
        boolean boolean19 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertHead((int) '4');
        int int22 = singlyLinkedList0.size();
        java.lang.Class<?> wildcardClass23 = singlyLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str11 = singlyLinkedList0.toString();
        boolean boolean13 = singlyLinkedList0.search(52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 10);
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        singlyLinkedList0.clear();
        singlyLinkedList0.clear();
        singlyLinkedList0.insertHead((int) (short) 0);
        java.lang.String str12 = singlyLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.print();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.deleteDuplicates();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteHead();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        java.lang.String str9 = singlyLinkedList0.toString();
        java.lang.String str10 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        java.lang.String str12 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteDuplicates();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.delete();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes(1, 10);
        int int9 = singlyLinkedList0.count();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertNth((int) (short) 100, 0);
        singlyLinkedList0.print();
        boolean boolean14 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.deleteHead();
        boolean boolean17 = singlyLinkedList0.search((int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = singlyLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        int int5 = singlyLinkedList0.size();
        singlyLinkedList0.deleteDuplicates();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        int int7 = singlyLinkedList0.size();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        int int9 = singlyLinkedList0.size();
        singlyLinkedList0.print();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        int int7 = singlyLinkedList0.size();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead(32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.print();
        singlyLinkedList0.insertHead((int) (short) 10);
        int int10 = singlyLinkedList0.count();
        java.lang.String str11 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 1);
        singlyLinkedList0.print();
        boolean boolean7 = singlyLinkedList0.search((-1));
        singlyLinkedList0.insert((int) ' ');
        singlyLinkedList0.print();
        int int11 = singlyLinkedList0.size();
        boolean boolean12 = singlyLinkedList0.isEmpty();
        boolean boolean13 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.clear();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        boolean boolean8 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.clear();
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        boolean boolean13 = singlyLinkedList0.search(0);
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.checkBounds(32, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        singlyLinkedList0.clear();
        boolean boolean6 = singlyLinkedList0.search((int) ' ');
        boolean boolean7 = singlyLinkedList0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.insertNth((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        int int7 = singlyLinkedList0.size();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        int int9 = singlyLinkedList0.size();
        boolean boolean10 = singlyLinkedList0.detectLoop();
        int int11 = singlyLinkedList0.size();
        boolean boolean13 = singlyLinkedList0.search((int) ' ');
        singlyLinkedList0.insertNth((int) (byte) 1, (int) (byte) 0);
        int int17 = singlyLinkedList0.count();
        boolean boolean19 = singlyLinkedList0.search((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        java.lang.String str9 = singlyLinkedList0.toString();
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead(1);
        singlyLinkedList0.swapNodes(3, (int) (short) 0);
        singlyLinkedList0.swapNodes(0, (int) (byte) 100);
        singlyLinkedList0.insertNth(4, (int) (short) 0);
        int int22 = singlyLinkedList0.count();
        int int23 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        singlyLinkedList0.deleteHead();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insertHead(0);
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 0);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.size();
        singlyLinkedList0.insertNth(10, 1);
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.delete();
        singlyLinkedList0.delete();
        singlyLinkedList0.swapNodes((int) (short) -1, (int) (byte) 0);
        singlyLinkedList0.deleteDuplicates();
        java.lang.Class<?> wildcardClass17 = singlyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insert((int) (short) 0);
        java.lang.String str7 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        boolean boolean9 = singlyLinkedList0.detectLoop();
        java.lang.Class<?> wildcardClass10 = singlyLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        boolean boolean7 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        int int9 = singlyLinkedList0.size();
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        int int11 = singlyLinkedList0.getNth(0);
        singlyLinkedList0.insert((int) ' ');
        singlyLinkedList0.insert((int) (byte) 10);
        singlyLinkedList0.insertHead(10);
        singlyLinkedList0.print();
        singlyLinkedList0.clear();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        singlyLinkedList0.insert((int) (short) 1);
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.deleteNth((int) (byte) 0);
        boolean boolean14 = singlyLinkedList0.search((int) '4');
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str16 = singlyLinkedList0.toString();
        boolean boolean18 = singlyLinkedList0.search(2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((int) '4', (-1));
        boolean boolean11 = singlyLinkedList0.search(97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert((int) '#');
        boolean boolean4 = singlyLinkedList0.search(1);
        singlyLinkedList0.print();
        singlyLinkedList0.insert(2);
        java.lang.String str8 = singlyLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35->2" + "'", str8, "35->2");
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean3 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertHead(1);
        int int6 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead((int) (short) 1);
        boolean boolean9 = singlyLinkedList0.detectLoop();
        boolean boolean11 = singlyLinkedList0.search((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.print();
        java.lang.String str4 = singlyLinkedList0.toString();
        java.lang.String str5 = singlyLinkedList0.toString();
        singlyLinkedList0.clear();
        int int7 = singlyLinkedList0.count();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "35" + "'", str4, "35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35" + "'", str5, "35");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertHead((int) (byte) -1);
        singlyLinkedList0.swapNodes((int) (short) 10, (int) (short) -1);
        singlyLinkedList0.clear();
        boolean boolean15 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert((int) (short) 0);
        int int18 = singlyLinkedList0.size();
        singlyLinkedList0.delete();
        boolean boolean20 = singlyLinkedList0.detectLoop();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteHead();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str3 = singlyLinkedList0.toString();
        singlyLinkedList0.clear();
        int int5 = singlyLinkedList0.count();
        boolean boolean7 = singlyLinkedList0.search((int) (short) 10);
        int int8 = singlyLinkedList0.count();
        singlyLinkedList0.insert((-1));
        boolean boolean11 = singlyLinkedList0.detectLoop();
        java.lang.String str12 = singlyLinkedList0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        singlyLinkedList0.insert((int) (short) -1);
        boolean boolean11 = singlyLinkedList0.isEmpty();
        boolean boolean13 = singlyLinkedList0.search((int) (byte) 0);
        int int14 = singlyLinkedList0.count();
        int int15 = singlyLinkedList0.count();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        singlyLinkedList0.swapNodes((int) (byte) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = singlyLinkedList0.getNth((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 0);
        singlyLinkedList0.print();
        int int13 = singlyLinkedList0.count();
        java.lang.String str14 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.clear();
        boolean boolean17 = singlyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass18 = singlyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean3 = singlyLinkedList0.isEmpty();
        java.lang.String str4 = singlyLinkedList0.toString();
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead(2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes(100, (int) '#');
        int int8 = singlyLinkedList0.count();
        boolean boolean9 = singlyLinkedList0.detectLoop();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.delete();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.clear();
        singlyLinkedList0.clear();
        singlyLinkedList0.checkBounds((int) (byte) 0, (int) (short) -1, 3);
        singlyLinkedList0.insertHead((int) ' ');
        singlyLinkedList0.delete();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = singlyLinkedList0.getNth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insertHead(0);
        singlyLinkedList0.clear();
        singlyLinkedList0.swapNodes(1, (int) (short) 10);
        singlyLinkedList0.deleteDuplicates();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteHead();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        int int5 = singlyLinkedList0.size();
        singlyLinkedList0.insertHead((int) (byte) 0);
        boolean boolean9 = singlyLinkedList0.search((int) ' ');
        singlyLinkedList0.insert((int) (byte) 100);
        singlyLinkedList0.insert(100);
        singlyLinkedList0.insertNth(2, (int) (byte) 0);
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (byte) -1);
        singlyLinkedList0.insertNth(0, 2);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean24 = singlyLinkedList0.isEmpty();
        boolean boolean25 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.deleteDuplicates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        boolean boolean5 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insertHead((int) (short) 0);
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insertHead((int) (byte) 0);
        int int11 = singlyLinkedList0.count();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str13 = singlyLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        singlyLinkedList0.insertHead((int) 'a');
        boolean boolean9 = singlyLinkedList0.search(10);
        singlyLinkedList0.print();
        boolean boolean11 = singlyLinkedList0.detectLoop();
        boolean boolean12 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        int int14 = singlyLinkedList0.size();
        int int15 = singlyLinkedList0.size();
        singlyLinkedList0.print();
        singlyLinkedList0.deleteNth((int) (short) 0);
        singlyLinkedList0.insertHead((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean3 = singlyLinkedList0.isEmpty();
        java.lang.String str4 = singlyLinkedList0.toString();
        java.lang.String str5 = singlyLinkedList0.toString();
        boolean boolean7 = singlyLinkedList0.search((int) (short) 10);
        java.lang.String str8 = singlyLinkedList0.toString();
        boolean boolean9 = singlyLinkedList0.detectLoop();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteNth((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        int int7 = singlyLinkedList0.size();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        int int9 = singlyLinkedList0.size();
        boolean boolean10 = singlyLinkedList0.detectLoop();
        int int11 = singlyLinkedList0.size();
        singlyLinkedList0.insertHead(100);
        singlyLinkedList0.swapNodes((int) '#', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        boolean boolean7 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insert((int) (short) 10);
        singlyLinkedList0.insert((int) 'a');
        boolean boolean14 = singlyLinkedList0.search((int) (byte) 1);
        boolean boolean15 = singlyLinkedList0.isEmpty();
        java.lang.String str16 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 1);
        singlyLinkedList0.insertHead(97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10->97" + "'", str16, "10->97");
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        java.lang.String str9 = singlyLinkedList0.toString();
        int int10 = singlyLinkedList0.count();
        singlyLinkedList0.insertHead(1);
        singlyLinkedList0.checkBounds(10, (int) (short) 1, (int) (short) 10);
        singlyLinkedList0.print();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((int) '4', (int) (short) -1);
        singlyLinkedList0.clear();
        singlyLinkedList0.insert((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insert((int) '#');
        singlyLinkedList0.deleteNth((int) (short) 0);
        singlyLinkedList0.clear();
        int int6 = singlyLinkedList0.size();
        boolean boolean7 = singlyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.clear();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean12 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (byte) 10);
        java.lang.String str16 = singlyLinkedList0.toString();
        boolean boolean17 = singlyLinkedList0.isEmpty();
        int int18 = singlyLinkedList0.count();
        singlyLinkedList0.deleteDuplicates();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.checkBounds((int) '4', (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        java.lang.String str9 = singlyLinkedList0.toString();
        singlyLinkedList0.swapNodes(1, (int) (short) 0);
        java.lang.String str13 = singlyLinkedList0.toString();
        java.lang.String str14 = singlyLinkedList0.toString();
        singlyLinkedList0.print();
        singlyLinkedList0.insertNth((int) 'a', 0);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean20 = singlyLinkedList0.detectLoop();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100" + "'", str13, "100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100" + "'", str14, "100");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.clear();
        int int5 = singlyLinkedList0.size();
        singlyLinkedList0.insertHead((int) (byte) 0);
        boolean boolean9 = singlyLinkedList0.search((int) ' ');
        singlyLinkedList0.insert((int) (byte) 100);
        boolean boolean12 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert(10);
        singlyLinkedList0.insert((int) (short) 1);
        boolean boolean17 = singlyLinkedList0.detectLoop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        int int3 = singlyLinkedList0.count();
        singlyLinkedList0.print();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.delete();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        boolean boolean7 = singlyLinkedList0.isEmpty();
        int int8 = singlyLinkedList0.count();
        boolean boolean9 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insert((int) (byte) -1);
        singlyLinkedList0.insertHead(2);
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.print();
        int int17 = singlyLinkedList0.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        int int6 = singlyLinkedList0.count();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean9 = singlyLinkedList0.search((int) (short) 10);
        singlyLinkedList0.swapNodes(0, 100);
        singlyLinkedList0.swapNodes(100, (int) (byte) 1);
        int int16 = singlyLinkedList0.size();
        singlyLinkedList0.insert((int) (short) 0);
        singlyLinkedList0.print();
        boolean boolean20 = singlyLinkedList0.detectLoop();
        boolean boolean21 = singlyLinkedList0.isEmpty();
        boolean boolean22 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insertHead(3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.detectLoop();
        java.lang.String str5 = singlyLinkedList0.toString();
        int int6 = singlyLinkedList0.size();
        boolean boolean7 = singlyLinkedList0.detectLoop();
        boolean boolean9 = singlyLinkedList0.search((int) '4');
        singlyLinkedList0.print();
        singlyLinkedList0.insert(2);
        int int13 = singlyLinkedList0.size();
        singlyLinkedList0.deleteNth((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        boolean boolean7 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.insert((int) (short) 10);
        singlyLinkedList0.insert((int) 'a');
        boolean boolean14 = singlyLinkedList0.search((int) (byte) 1);
        boolean boolean15 = singlyLinkedList0.isEmpty();
        boolean boolean17 = singlyLinkedList0.search(0);
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insertHead((int) 'a');
        singlyLinkedList0.insert(4);
        int int23 = singlyLinkedList0.size();
        boolean boolean24 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.clear();
        int int26 = singlyLinkedList0.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        boolean boolean9 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insertNth((int) (short) 100, 0);
        singlyLinkedList0.print();
        singlyLinkedList0.swapNodes((int) (short) 100, (int) '#');
        singlyLinkedList0.delete();
        singlyLinkedList0.clear();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        int int4 = singlyLinkedList0.count();
        boolean boolean6 = singlyLinkedList0.search((int) 'a');
        singlyLinkedList0.insertHead(100);
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.swapNodes((int) (byte) 1, (int) (short) 0);
        singlyLinkedList0.insert((int) (short) 0);
        java.lang.String str15 = singlyLinkedList0.toString();
        singlyLinkedList0.swapNodes((int) (short) -1, (int) (byte) 10);
        singlyLinkedList0.insertHead((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = singlyLinkedList0.getNth((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100->0" + "'", str15, "100->0");
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insertHead(0);
        java.lang.String str3 = singlyLinkedList0.toString();
        singlyLinkedList0.swapNodes((int) (short) 100, 0);
        singlyLinkedList0.insertHead(10);
        int int9 = singlyLinkedList0.size();
        singlyLinkedList0.swapNodes(1, (int) (byte) 0);
        singlyLinkedList0.deleteNth((int) (short) 0);
        java.lang.String str15 = singlyLinkedList0.toString();
        singlyLinkedList0.insertHead((int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) (byte) 10);
        int int5 = singlyLinkedList0.size();
        java.lang.String str6 = singlyLinkedList0.toString();
        singlyLinkedList0.swapNodes((int) (short) 0, (int) '4');
        boolean boolean11 = singlyLinkedList0.search(100);
        singlyLinkedList0.insertHead(1);
        java.lang.Class<?> wildcardClass14 = singlyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insert((int) (byte) 1);
        singlyLinkedList0.print();
        boolean boolean7 = singlyLinkedList0.search((-1));
        java.lang.String str8 = singlyLinkedList0.toString();
        int int9 = singlyLinkedList0.size();
        boolean boolean11 = singlyLinkedList0.search(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.insertHead(0);
        boolean boolean4 = singlyLinkedList0.search(2);
        singlyLinkedList0.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        boolean boolean1 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.checkBounds((int) (byte) 10, (int) (byte) -1, (int) 'a');
        boolean boolean6 = singlyLinkedList0.isEmpty();
        java.lang.String str7 = singlyLinkedList0.toString();
        boolean boolean8 = singlyLinkedList0.isEmpty();
        int int9 = singlyLinkedList0.count();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insertHead((int) (short) 10);
        boolean boolean13 = singlyLinkedList0.isEmpty();
        int int14 = singlyLinkedList0.size();
        singlyLinkedList0.deleteHead();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.insertHead((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        java.lang.String str3 = singlyLinkedList0.toString();
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.swapNodes(0, 0);
        singlyLinkedList0.insertHead((int) '4');
        singlyLinkedList0.insert((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 10);
        singlyLinkedList0.deleteDuplicates();
        boolean boolean6 = singlyLinkedList0.detectLoop();
        boolean boolean8 = singlyLinkedList0.search((int) (short) 100);
        boolean boolean9 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.swapNodes(100, (int) 'a');
        int int13 = singlyLinkedList0.count();
        singlyLinkedList0.clear();
        boolean boolean15 = singlyLinkedList0.isEmpty();
        singlyLinkedList0.insert(100);
        singlyLinkedList0.delete();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str20 = singlyLinkedList0.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean4 = singlyLinkedList0.search((int) (byte) 100);
        singlyLinkedList0.insertNth((-1), (int) (byte) 0);
        singlyLinkedList0.print();
        singlyLinkedList0.clear();
        int int10 = singlyLinkedList0.count();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.delete();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.deleteDuplicates();
        java.lang.String str2 = singlyLinkedList0.toString();
        singlyLinkedList0.insertNth((int) '#', 0);
        singlyLinkedList0.deleteDuplicates();
        singlyLinkedList0.clear();
        singlyLinkedList0.print();
        // The following exception was thrown during execution in test generation
        try {
            singlyLinkedList0.deleteHead();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        com.thealgorithms.datastructures.lists.SinglyLinkedList singlyLinkedList0 = new com.thealgorithms.datastructures.lists.SinglyLinkedList();
        singlyLinkedList0.clear();
        boolean boolean2 = singlyLinkedList0.isEmpty();
        boolean boolean3 = singlyLinkedList0.detectLoop();
        singlyLinkedList0.deleteDuplicates();
        int int5 = singlyLinkedList0.count();
        singlyLinkedList0.insertNth((int) (byte) 0, 0);
        singlyLinkedList0.checkBounds((int) (short) 0, (int) (byte) 0, (int) (short) 100);
        singlyLinkedList0.insertNth(3, 0);
        singlyLinkedList0.clear();
        singlyLinkedList0.insertHead(100);
        singlyLinkedList0.swapNodes((int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }
}

