package datastructures.lists;

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
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(10);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get((int) (short) -1);
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "hi!" + "'", charSequence10, "hi!");
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((-1));
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "hi!" + "'", charSequence20, "hi!");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence17);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) (short) 100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence24 = charSequenceCursorLinkedList0.get((int) ' ');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(charSequence24);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) ' ');
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get(10);
        java.lang.CharSequence charSequence23 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.Class<?> wildcardClass24 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) ' ');
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(2);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) '4');
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "hi!" + "'", charSequence10, "hi!");
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        int int28 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence5 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass8 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(charSequence17);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.removeByIndex(2);
        java.lang.CharSequence charSequence23 = charSequenceCursorLinkedList0.get(10);
        java.lang.Class<?> wildcardClass24 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex(100);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.removeByIndex(3);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "" + "'", charSequence8, "");
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.CharSequence charSequence23 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(charSequence23);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass13 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.printList();
        int int9 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(10);
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) '4');
        java.lang.CharSequence charSequence19 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.append(charSequence19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(10);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(2);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(10);
        java.lang.Class<?> wildcardClass11 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        java.lang.CharSequence charSequence15 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove(charSequence15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        java.lang.CharSequence charSequence23 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.append(charSequence23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.removeByIndex(3);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) '4');
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) 'a');
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence24 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        java.lang.CharSequence charSequence26 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = charSequence26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + charSequence24 + "' != '" + "hi!" + "'", charSequence24, "hi!");
        org.junit.Assert.assertNull(charSequence26);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(3);
        java.lang.CharSequence charSequence24 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove(charSequence24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "" + "'", charSequence9, "");
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(2);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((-1));
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int26 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(10);
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence23 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(charSequence23);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence17);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) (short) 100);
        int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence7 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence7);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(10);
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get(0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charSequence17);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) '4');
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = charSequence22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = charSequence13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (short) 0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.printList();
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) ' ');
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get(10);
        java.lang.CharSequence charSequence23 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        int int25 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence27 = charSequenceCursorLinkedList0.get(10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(charSequence21);
        org.junit.Assert.assertNull(charSequence23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNull(charSequence27);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex(10);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence3 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence7 = charSequenceCursorLinkedList0.get((int) (short) 100);
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((-1));
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) '4');
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get(1);
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "" + "'", charSequence9, "");
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence3 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence5 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence7 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "hi!" + "'", charSequence20, "hi!");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(10);
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        java.lang.Class<?> wildcardClass5 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass11 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int23 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int25 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(10);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass13 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 10);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((-1));
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass12 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get(2);
        java.lang.CharSequence charSequence21 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.append(charSequence21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(1);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "hi!" + "'", charSequence20, "hi!");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get(0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.CharSequence charSequence7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove(charSequence7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get((int) 'a');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass10 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.append(charSequence9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) '4');
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(2);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(1);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence17);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) ' ');
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence26 = charSequenceCursorLinkedList0.get(10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
        org.junit.Assert.assertNull(charSequence26);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(100);
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((-1));
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(2);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((-1));
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass23 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.removeByIndex(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(100);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.removeByIndex((-1));
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) '4');
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) '#');
        java.lang.CharSequence charSequence24 = charSequenceCursorLinkedList0.get(3);
        java.lang.CharSequence charSequence25 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove(charSequence25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(charSequence22);
        org.junit.Assert.assertNull(charSequence24);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence5 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(10);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "hi!" + "'", charSequence20, "hi!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = charSequenceCursorLinkedList0.indexOf(charSequence11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = charSequenceCursorLinkedList0.indexOf(charSequence12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (short) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) ' ');
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNull(charSequence21);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.Class<?> wildcardClass25 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(2);
        charSequenceCursorLinkedList0.printList();
        int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int24 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((-1));
        int int23 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.Class<?> wildcardClass11 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(1);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.printList();
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.removeByIndex((-1));
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(1);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence24 = charSequenceCursorLinkedList0.get((int) '4');
        java.lang.CharSequence charSequence26 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.removeByIndex(10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertEquals("'" + charSequence26 + "' != '" + "hi!" + "'", charSequence26, "hi!");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence3 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence5 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) ' ');
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get(10);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence26 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence26);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove(charSequence18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) ' ');
        java.lang.CharSequence charSequence14 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.append(charSequence14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.printList();
        int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(100);
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence5 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 100);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get((int) (short) 0);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(10);
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(2);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(1);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        int int24 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int6 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get(10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass19 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get(1);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = charSequence18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(2);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) '#');
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence5 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence5);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence21);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass13 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence24 = charSequenceCursorLinkedList0.get((int) '#');
        java.lang.CharSequence charSequence26 = charSequenceCursorLinkedList0.get(0);
        java.lang.Class<?> wildcardClass27 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertEquals("'" + charSequence26 + "' != '" + "hi!" + "'", charSequence26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int26 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((-1));
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int6 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) ' ');
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int23 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int25 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence17);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence17);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(2);
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(2);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.Class<?> wildcardClass11 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (short) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass25 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence17);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((-1));
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.Class<?> wildcardClass27 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.printList();
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) -1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.Class<?> wildcardClass23 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(2);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass20 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) '4');
        int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence7 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = charSequenceCursorLinkedList0.indexOf(charSequence16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence4 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence4);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence20 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.append(charSequence20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass18 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "hi!" + "'", charSequence8, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence21 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex((-1));
        java.lang.CharSequence charSequence25 = charSequenceCursorLinkedList0.get(10);
        int int27 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + charSequence21 + "' != '" + "hi!" + "'", charSequence21, "hi!");
        org.junit.Assert.assertNull(charSequence25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(2);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = charSequence16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((-1));
        java.lang.CharSequence charSequence23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = charSequenceCursorLinkedList0.indexOf(charSequence23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((-1));
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 10);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) 'a');
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(3);
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence7 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(2);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "hi!" + "'", charSequence14, "hi!");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(1);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "hi!" + "'", charSequence16, "hi!");
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get(1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) '4');
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(3);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence3 = charSequenceCursorLinkedList0.get((int) '4');
        java.lang.CharSequence charSequence5 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(2);
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) ' ');
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        int int21 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence11);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(2);
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) '#');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence16);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(10);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 10);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get(100);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence3 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence3);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(1);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence5 = charSequenceCursorLinkedList0.get(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = charSequence5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence20);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get((int) '4');
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int19 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(2);
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "hi!" + "'", charSequence11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(0);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "hi!" + "'", charSequence17, "hi!");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(10);
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "hi!" + "'", charSequence18, "hi!");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) (short) 100);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence18);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence28 = charSequenceCursorLinkedList0.get((int) (short) -1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(charSequence28);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(2);
        charSequenceCursorLinkedList0.removeByIndex(10);
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.Class<?> wildcardClass9 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence19 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence19);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence3 = charSequenceCursorLinkedList0.get((int) '4');
        java.lang.CharSequence charSequence5 = charSequenceCursorLinkedList0.get((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence3);
        org.junit.Assert.assertNull(charSequence5);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.reflect.AnnotatedElement> annotatedElementCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass1 = annotatedElementCursorLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get((int) '4');
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence7 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence7);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        int int22 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence24 = charSequenceCursorLinkedList0.get((int) (short) 1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(charSequence24);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        java.lang.Class<?> wildcardClass10 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "" + "'", charSequence9, "");
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence24 = charSequenceCursorLinkedList0.get((int) (byte) -1);
        java.lang.CharSequence charSequence26 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(charSequence24);
        org.junit.Assert.assertNull(charSequence26);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence17 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(charSequence17);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) '4');
        charSequenceCursorLinkedList0.removeByIndex(2);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(10);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence11 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = charSequence15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "" + "'", charSequence9, "");
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "" + "'", charSequence11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence12);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get(2);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 10);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = charSequence10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "" + "'", charSequence8, "");
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int23 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass24 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        int int24 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence18 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove(charSequence18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 100);
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence6);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) '#');
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.removeByIndex(0);
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass12 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence18 = charSequenceCursorLinkedList0.get(0);
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get(2);
        java.lang.Class<?> wildcardClass21 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence18);
        org.junit.Assert.assertNull(charSequence20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int12 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(charSequence16);
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int17 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) '#');
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        charSequenceCursorLinkedList0.removeByIndex((-1));
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 10);
        org.junit.Assert.assertEquals("'" + charSequence9 + "' != '" + "hi!" + "'", charSequence9, "hi!");
        org.junit.Assert.assertNull(charSequence13);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        java.lang.CharSequence charSequence20 = charSequenceCursorLinkedList0.get(0);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "hi!" + "'", charSequence20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence8);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int20 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 1);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass28 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (byte) 0);
        java.lang.CharSequence charSequence15 = charSequenceCursorLinkedList0.get((int) (byte) 1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) ' ');
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence9);
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertNull(charSequence15);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        java.lang.Class<?> wildcardClass22 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        java.lang.CharSequence charSequence9 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence9);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.removeByIndex((int) '4');
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex((int) (short) -1);
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertNull(charSequence10);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (short) 1);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get((int) (short) 0);
        int int14 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence16 = charSequenceCursorLinkedList0.get((int) (short) 1);
        charSequenceCursorLinkedList0.removeByIndex(100);
        charSequenceCursorLinkedList0.removeByIndex(10);
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertEquals("'" + charSequence10 + "' != '" + "" + "'", charSequence10, "");
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "hi!" + "'", charSequence12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + charSequence16 + "' != '" + "" + "'", charSequence16, "");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(1);
        java.lang.CharSequence charSequence13 = charSequenceCursorLinkedList0.get((int) (short) 100);
        charSequenceCursorLinkedList0.printList();
        int int16 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        org.junit.Assert.assertNull(charSequence13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        int int10 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceCursorLinkedList0.get((-1));
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(charSequence14);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.printList();
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex(0);
        int int18 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        int int8 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        java.lang.CharSequence charSequence12 = charSequenceCursorLinkedList0.get(100);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.removeByIndex(0);
        java.lang.CharSequence charSequence22 = charSequenceCursorLinkedList0.get((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(charSequence10);
        org.junit.Assert.assertNull(charSequence12);
        org.junit.Assert.assertNull(charSequence22);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        java.lang.CharSequence charSequence2 = charSequenceCursorLinkedList0.get((int) (byte) 10);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.printList();
        int int11 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "hi!");
        int int13 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        int int15 = charSequenceCursorLinkedList0.indexOf((java.lang.CharSequence) "");
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) 10);
        charSequenceCursorLinkedList0.remove((java.lang.CharSequence) "");
        org.junit.Assert.assertNull(charSequence2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence> charSequenceCursorLinkedList0 = new com.thealgorithms.datastructures.lists.CursorLinkedList<java.lang.CharSequence>();
        charSequenceCursorLinkedList0.removeByIndex((int) (short) 0);
        charSequenceCursorLinkedList0.removeByIndex((int) (byte) -1);
        java.lang.CharSequence charSequence6 = charSequenceCursorLinkedList0.get((int) 'a');
        java.lang.CharSequence charSequence8 = charSequenceCursorLinkedList0.get(10);
        charSequenceCursorLinkedList0.removeByIndex(0);
        charSequenceCursorLinkedList0.append((java.lang.CharSequence) "hi!");
        charSequenceCursorLinkedList0.removeByIndex(2);
        charSequenceCursorLinkedList0.printList();
        java.lang.Class<?> wildcardClass16 = charSequenceCursorLinkedList0.getClass();
        org.junit.Assert.assertNull(charSequence6);
        org.junit.Assert.assertNull(charSequence8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

